---

title: "Import Procedure"
weight: 20

menu:
  main:
    name: "Import Procedure"
    identifier: "import-procedure"
    parent: "import-guide"
    pre: "Explains the procedure of the import of the engine data."

---

{{< note title="Heads Up!" class="warning" >}}
Understanding the details of the import procedure is not necessary in order to make Optimize work. In addition, there is no guarantee that the following description is neither complete nor up-to-date.
{{< /note >}}

The following diagram illustrates components involved in import process as well as basic interaction between them:

{{< img src="../img/Optimize-Import-Process.png" title="Optimize Procedure" >}}

During execution following steps are performed:

1. [Start an import round](#start-an-import-round)
2. [Prepare the import](#prepare-the-import)
  - 2.1 Poll a new page
  - 2.2 Cull already imported entities
  - 3.3 Map entities and add an import job
3. [Execute the import](#execute-the-import)
  - 3.1 Poll a job
  - 3.2 Persist the new entities to Elasticsearch


# Start an import round

Import process is triggered automatically after startup of Camunda Optimize in a separate thread, implemented by `ImportScheduler` class. The scheduler works in rounds. Each import round a five different schedule jobs are scheduled, which are responsible for fetching one specific type of entity, each conducted by a dedicated `ImportService`. E.g., one task is responsible to import the historic activity instances, one for the process definitions, one for the process definition xmls, one for the historic process instance and another one for historic variable instances.

For each schedule job, it is checked if still new data was imported. Once all entities for one task are imported, the scheduler component will start to backoff from this job. To be more precise, the scheduling is done in increasing periods of time, controlled by "backoff" counter. At the moment, the scheduler thread will stay idle a fixed amount of milliseconds between every backoff cycle. Each round no new data could be imported, the counter is incremented. Thus, the backoff counter will act as a multiplier for the backoff time and increase the time to be idle between two import rounds. This mechanism is configurable using following properties:

```
camunda.optimize.es.import.handler.max.backoff=10
```

```
camunda.optimize.es.import.handler.interval.ms=10000
```

In addition to the "backoff" mechanism, the import scheduler will reschedule all types of schedule jobs starting from the beginning every once in a while. Thus, in case some enities were missed out or skipped during the import, they can be added in the next import cycle. The period of time between full imports is controlled by following properties:

```
camunda.optimize.es.import.handler.pages.reset.interval.value=30
camunda.optimize.es.import.handler.pages.reset.interval.unit=Minutes
```

If you would like to rapidly update data imported into Optimize, you have to reduce this value. On the other hand if you would like import procedure to be performed
once a day only this interval has to be increased.

# Prepare the import

The preparation of the import is executed by the `ImportService`. Every `ImportService` implementation performs thereby several steps.

## Poll a new page

The whole polling/preparation workflow of the engine data is done in pages, meaning we only fetch a certain a mount of entities. For example, we could assume that the engine has 1000 historic activity instances (HAI) and the page size is 100. As a consequence, the engine is polled 10 times. This prevents from getting out of memory and overloading the network.

Polling a new page does not only consist of the `ImportService`, but there are also the `IndexHandler` and the `EntityFetcher` involded. The following figure depicts how those components are conntected with each other:

{{< img src="../img/Import-Service-Polling.png" title="ImportService Polling Procedure" >}}

First, the `ImportScheduler` retrieves the newest index, which is saying where to start fetching lines in a table. This index is passed to the `ImportService` ordering to import a page of data. In addition, a page size is calculated depending on how long the last rest call to the engine took. With the index and the page size, the fetching of the engine data is deligated to the `EnitityFetcher`. Once the `ImportService` retrieved the engine data from the fetcher, it passes the number of entities that were fetched to the `ImportScheduler`. With this information the scheduler then is able to update the index, so it is recoded which instances have already been scrolled.

To see how to adapt the page size of the import, have a look at the [respective section]({{< relref "technical-guide/configuration/index.md#pagination" >}}) on the configuration description.

## Cull already imported entities

To prevent entities from being imported several times, Elasticsearch is queried, if the given entities were already imported. Thus, only new entities are imported to Optimize.

## Map entities and add an import job

All fetched entities are mapped to a representation that allows Optimize to query the data very fast. Subsequently, an import job is created and added to the queue to persist the data in Elasticsearch.

# Execute the import

Full aggregation of the data is performed by `ImportJobExecutor`, which is waiting for `ImportJob` instances to be added into the execution queue. As soon as a job is in the queue, the executor

* polls the job with the new Optimize entities
* persists the new entities to Elasticsearch.

The data from the engine and Optimize do not have a one-to-one relationship, i.e. one entity type in Optimize may consist of data aggregated from different data types of the engine. For example, the historic process instance is first mapped to an Optimize `ProcessInstance`. However, for the heatmap analysis it is also necessary for `ProcessInstance` to contain all activities that were executed in the process instance. Therefore, the Optimize is an aggregation of the engine's historic process instance and its historic activity instances (and more, but we leave that here aside for the sake of simplicity). It is important to note that data in Elasticsearch is never getting updated after initial persistence.

Also note that the Start/Preparation and the execution are actually independent from each other. They are following a [producer-consumer-pattern](https://dzone.com/articles/producer-consumer-pattern), where the `ImportService` is the producer and the `ImportJobExecutor` is the consumer. So both are executed in different threads. To adjust the processing speed of the executor, the queue size and the number of threads that are processing the import jobs can be configured:

```
camunda.optimize.engine.import.jobqueue.size.max=100
```

```
camunda.optimize.engine.import.executor.thread.count=2
```
