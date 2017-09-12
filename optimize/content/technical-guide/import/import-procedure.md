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
Understanding the details of the import procedure is not necessary to make Optimize work. In addition, there is no guarantee that the following description is either complete or up-to-date.
{{< /note >}}

The following image illustrates the components involved in the import process as well as basic interactions between them:

{{< img src="../img/Optimize-Import-Process.png" title="Optimize Procedure" >}}

During execution, the following steps are performed:

1. [Start an import round](#start-an-import-round)
2. [Prepare the import](#prepare-the-import)
  - 2.1 Poll a new page
  - 2.2 Cull already imported entities
  - 2.3 Map entities and add an import job
3. [Execute the import](#execute-the-import)
  - 3.1 Poll a job
  - 3.2 Persist the new entities to Elasticsearch


# Start an import round

The import process is triggered automatically after startup of Optimize in a separate thread, implemented by the `ImportScheduler` class. The scheduler works in rounds. In each import round, five different schedule jobs are scheduled, which are responsible for fetching one specific type of entity each, conducted by a dedicated `ImportService`. E.g., one task is responsible for importing the historic activity instances, one for the process definitions, one for the process definition XMLs, one for the historic process instances and another one for historic variable instances.

For each schedule job, it is checked if new data was imported. Once all entities for one task have been imported, the scheduler component starts to backoff from this job. To be more precise, the scheduling is done in increasing periods of time, controlled by the "backoff" counter. At the moment, the scheduler thread will stay idle a fixed amount of milliseconds between every backoff cycle. Each round in which no new data could be imported, the counter is incremented. Thus, the backoff counter will act as a multiplier for the backoff time and increase the time to be idle between two import rounds. This mechanism is configurable using the following properties:

```json
  "backoff": {
    /*
    Interval which is used for the backoff time calculation.
    */
    "interval": 1000,
    /*
    If all jobs are backing off at the moment, this interval is used
    to trigger general backoff
    */
    "value": 6000,
    /*
    Once all pages are consumed, the import scheduler component will
    start scheduling fetching tasks in increasing periods of time,
    controlled by "backoff" counter.
    */
    "max": 5
  }
```

In addition to the "backoff" mechanism, the import scheduler will reschedule all types of schedule jobs starting from the beginning every once in a while. Thus, in case some enities were missed out or skipped during the import, they can be added in the next import cycle. The period of time between full imports is controlled by following properties:

```json
  "pages": {
    "resetInterval": {
      /*
      Chronological unit used to calculate index reset due date.
      Possible values are:

      Seconds, Minutes, Hours, HalfDays, Days, Weeks, Months

      in case not supported value is provided 'Minutes' will be used
      for interval calculation.
      */
      "unit": "Minutes",
      /*
      Interval the import is started all over again, meaning only missing
      entities are fetched during the import restart. The data already
      imported is kept.
      */
      "value": 30
    }
  }
```

If you would like to rapidly update data imported into Optimize, you have to reduce this value. On the other hand, if you would like the import procedure to be performed
only once a day, this interval has to be increased.

# Prepare the import

The preparation of the import is executed by the `ImportService`. Thereby, every `ImportService` implementation performs several steps:

## Poll a new page

The whole polling/preparation workflow of the engine data is done in pages, meaning we only fetch a certain amount of entities. For example, we could assume that the engine has 1000 historic activity instances (HAI) and the page size is 100. As a consequence, the engine is polled 10 times. This prevents running out of memory and overloading the network.

Polling a new page does not only consist of the `ImportService`, but the `IndexHandler` and the `EntityFetcher` are also involved. The following image depicts how those components are connected with each other:

{{< img src="../img/Import-Service-Polling.png" title="ImportService Polling Procedure" >}}

First, the `ImportScheduler` retrieves the newest index, which is saying where to start fetching lines in a table. This index is passed to the `ImportService` ordering to import a page of data. In addition, a page size is calculated depending on how long the last rest call to the engine took. With the index and the page size, the fetching of the engine data is deligated to the `EntitityFetcher`. Once the `ImportService` has retrieved the engine data from the fetcher, it passes the number of entities that were fetched to the `ImportScheduler`. With this information, the scheduler is then able to update the index, so that which instances have already been scrolled is recorded.

To see how to adapt the page size of the import, have a look at the [pagination section]({{< relref "technical-guide/configuration/index.md#pagination" >}}) of the configuration documentation.

## Cull already imported entities

To prevent entities from being imported several times, Elasticsearch is queried to check if the given entities have already been imported. Thus, only new entities are imported to Optimize.

## Map entities and add an import job

All fetched entities are mapped to a representation that allows Optimize to query the data very quickly. Subsequently, an import job is created and added to the queue to persist the data in Elasticsearch.

# Execute the import

Full aggregation of the data is performed by the `ImportJobExecutor`, which waits for `ImportJob` instances to be added to the execution queue. As soon as a job is in the queue, the executor

* polls the job with the new Optimize entities
* persists the new entities to Elasticsearch.

The data from the engine and Optimize do not have a one-to-one relationship, i.e., one entity type in Optimize may consist of data aggregated from different data types of the engine. For example, the historic process instance is first mapped to an Optimize `ProcessInstance`. However, for the heatmap analysis it is also necessary for `ProcessInstance` to contain all activities that were executed in the process instance. Therefore, the Optimize is an aggregation of the engine's historic process instance and its historic activity instances (and more, but we leave that here aside for the sake of simplicity). It is important to note that data in Elasticsearch is never updated after initial persistence.

Also note that the Start/Preparation and the execution are actually independent from another. They follow a [producer-consumer-pattern](https://dzone.com/articles/producer-consumer-pattern), where the `ImportService` is the producer and the `ImportJobExecutor` is the consumer. So, both are executed in different threads. To adjust the processing speed of the executor, the queue size and the number of threads that process the import jobs can be configured:

```json
  "import": {
    ...
    /*
    Number of threads being used to process the import jobs in the import
    job queue
    */
    "executorThreadCount": 2,
    /*
    Adjust the queue size of the import jobs created.
    A too large value might cause memory problems.
    */
    "jobQueueMaxSize": 100,
    ...
  }
```
