---

title: "Configuration"
weight: 60

menu:
  main:
    identifier: "configuration"
    parent: "technical-guide"

---

All distributions of Camunda Optimize come with a predefined set of configuration options that can be overwritten by the user, based on current environment requirements. To do that, have a look into the folder named environment. There is one file called environment.properties with values that override the defaults optimize properties.

In the following, all adjustable properties are listed with their default value and a short explanation of their purpose.

# Jetty properties

These properties are related to the embedded jetty server, which Optimize is running on.

*  A port number that will be used by the embedded jetty server to process HTTP connections.
```
camunda.optimize.container.http.port=8090
```

*  A port number that will be used by the embedded jetty server to process secure HTTPS connections.
```
camunda.optimize.container.https.port=8091
```
* A host name or IP address, to identify a specific network interface on which to listen.
```
camunda.optimize.container.host=localhost
```
* HTTPS requires an SSL Certificate. When you generate an SSL Certificate, you are creating a keystore file and a keystore password for use when the browser interface connects to the Master Server.
```
camunda.optimize.container.keystore.password=optimize
camunda.optimize.container.keystore.location=keystore.jks
```

# Authentication and security

These properties are related to everything connected to a security aspect.

* Optimize uses token-based authentication to keep track of which users are logged in. Define when a token is supposed to expire.
```
camunda.optimize.auth.token.live.min=15
```

* Define a secret (password), which is used to hash the token.
```
camunda.optimize.auth.token.secret=obfuscate
```
* Default user name that is automatically added the first time optimize is started.
```
camunda.optimize.auth.default.user=admin
```
* Default password that is automatically added the first time optimize is started.
```
camunda.optimize.auth.default.password=admin
```
* Enables the creation of the default Optimize user. If you're using Optimize in production, you should disable this property, so you just use the users from the engine.
```
camunda.optimize.auth.default.user.creation.enabled=true
```
* When basic authentication is enabled, this user is used to authenticate against the engine.
```
camunda.optimize.engine.auth.user=
```
* When basic authentication is enabled, this password is used to authenticate against the engine.
```
camunda.optimize.engine.auth.password=
```
* Toggles basic authentication on or off. When enabling basic authentication, please be aware that you also need to adjust the values of the properties ``camunda.optimize.engine.auth.user`` and ``camunda.optimize.engine.auth.password`` to a username and password from the engine that has read access to the data.
```
camunda.optimize.engine.auth.enabled=false
```
* With the specified group id, only engine users that are part of the group can access optimize.
```
camunda.optimize.engine.auth.access.group.id=
```

# Optimize

Adjust properties related to the functionalities of Optimize.

## Import

These properties are related to import.

* Define a custom date format that should be used (should be the same as in the engine).
```
camunda.optimize.serialization.date.format=yyyy-MM-dd'T'HH:mm:ss
```

* Check if engine should be considered connected. Disable only for testing!
```
camunda.optimize.engine.enabled=true
```
* Adjust the queue size of the import jobs created. A too large value might cause memory problems. Consider increasing camunda.optimize.engine.import.executor.thread.count in case the queue is full all the time.
```
camunda.optimize.engine.import.jobqueue.size.max=100
```
* Number of threads being used to process the import jobs in the import job queue.
```
camunda.optimize.engine.import.executor.thread.count=2
```
* Number of retries when there is a version conflict in Elasticsearch during the import.
```
camunda.optimize.engine.import.writer.number.of.retries=5
```
* Restrict the import only for the given process definition ids. If empty, all the data is imported. The value should be a comma seperated list of process definition ids, e.g., camunda.optimize.engine.import.process-definition-list=invoice:1:6c0ae208-4a9e-11e7-ada7-0242972faccc,aProcess:2:6c0ae208-4a9e-11e7-ada7-0242972faccc
```
camunda.optimize.engine.import.process-definition-list=
```
* Once all pages are consumed, the import scheduler component will start scheduling fetching tasks in increasing periods of time, controlled by "backoff" counter.
```
camunda.optimize.es.import.handler.max.backoff=10
```
* If all jobs are backing off at the moment, thi interval is used to trigger general backoff
```
camunda.optimize.es.import.handler.general.backoff.ms=60000
```
* Interval which is used for the backoff time calculation.
```
camunda.optimize.es.import.handler.interval.ms=10000
```
* Interval the import is started all over again, meaning only missing entities are fetched during the import restart. The data already imported is kept.
```
camunda.optimize.es.import.handler.pages.reset.interval.value=30
```
* Chronological unit used to calculate index reset due date.
```
camunda.optimize.es.import.handler.pages.reset.interval.unit=Minutes
```


## Pagination

The data is fetched from the engine in pages. Define a default minimum and maximum size or, to be precise, a range for the number of entities that should be fetched at once for each import type.

* Overwrites the maximum page size for process definitions fetching.
```
camunda.optimize.engine.import.process-definition.page.size.max=1000
```

* Overwrites the maximum page size for process definition xml model fetching. Should be a low value, as large models will lead to memory or timeout problems.
```
camunda.optimize.engine.import.process-definition-xml.page.size.max=4
```
* Overwrites the maximum page size for historic activity instance fetching.
```
camunda.optimize.engine.import.activity-instance.page.size.max=10000
```
* Overwrites the maximum page size for historic process instance fetching.
```
camunda.optimize.engine.import.process-instance.page.size.max=1000
```
* Overwrites the maximum page size for historic variable instance fetching.
```
camunda.optimize.engine.import.variable.page.size.max=1000
```
* Overwrites the minimum page size for process definitions fetching.
```
camunda.optimize.engine.import.process-definition.page.size.min=10
```
* Overwrites the minimum page size for process definition xml model fetching. Should be a low value, as large models will lead to memory or timeout problems.
```
camunda.optimize.engine.import.process-definition-xml.page.size.min=1
```
* Overwrites the maximum page size for historic activity instance fetching.
```
camunda.optimize.engine.import.activity-instance.page.size.min=50
```

## Queries

* States the maximum number of values that are shown for the user in the variable filter selection.

    ```
camunda.optimize.variable.max.valueList.size=15
```

# Elasticsearch connection

Set up the connection to Elasticsearch.

* A hostname on which the Elasticsearch TCP listener is available.
```
camunda.optimize.es.host=localhost
```

* A port number used by Elasticsearch to accept TCP connections.
```
camunda.optimize.es.port=9300
```
* Maximum time without connection to Elasticsearch, Optimize should wait until a time out triggers.
```
camunda.optimize.es.connection.timeout.ms=10000
```
* Maximum time a request to elasticsearch should last, before a timeout triggers.
```
camunda.optimize.es.scroll.timeout.ms=60000
```
* Connection sampler interval set to the client
```
camunda.optimize.es.sampler.interval=5000
```

# Elasticsearch type names

Define custom names for the Elasticssearch types used in Optimize. Have a look [here](https://www.elastic.co/blog/index-vs-type) if you're not familiar with Elasticsearch concepts of indexes and types.

* An index name used to create all Camunda Optimize types, shards, etc.
```
camunda.optimize.es.index=optimize
```

* The name of the event type.
```
camunda.optimize.es.event.type=event
```
* The name of the process instance type.
```
camunda.optimize.es.process.instance.type=process-instance
```
* The name of the process instance (pi) tracking type that is used to find pi's that were already imported.
```
camunda.optimize.es.process.instance.id.tracking.type=process-instance-id-tracking
```
* The name of the variable type.
```
camunda.optimize.es.variable.type=variable
```
* The name of the duration target value type.
```
camunda.optimize.es.heatmap.duration.target.value.type=duration-target-value
```
* The name of the process definition type.
```
camunda.optimize.es.procdef.type=process-definition
```
* The name of the process definition xml type.
```
camunda.optimize.es.procdef.xml.type=process-definition-xml
```
* The name of the user type.
```
camunda.optimize.es.users.type=users
```
* The name of the import index type.
```
camunda.optimize.es.import.index.type=import-index
```
* The name of the import index type when a list of process definitions to import is defined.
```
camunda.optimize.es.procdef.import.index.type=process-definition-import-index
```

# Engine connection

Set up the connection to the Engine.

* A base URL that will be used for connections to the Camunda Engine REST API.
```
camunda.optimize.engine.rest=http://localhost:8080/engine-rest
```

* The name of the engine that will be used to import data.
```
camunda.optimize.engine.name=/engine/default
```
* Maximum time without connection to the engine, Optimize should wait until a time out is triggered.
```
camunda.optimize.engine.connect.timeout.ms=10000
```
* Maximum time a request to the engine should last, before a timeout triggers.
```
camunda.optimize.engine.read.timeout.ms=10000
```
* The engine endpoint to the historic activity instances.
```
camunda.optimize.engine.hai.endpoint=/history/activity-instance
```
* The engine endpoint to the historic activity instance count.
```
camunda.optimize.engine.hai.count.endpoint=/history/activity-instance/count
```
* The engine endpoint to the historic variable instances.
```
camunda.optimize.engine.history.variable.endpoint=/history/variable-instance
```
* The engine endpoint to the historic variable instance count.
```
camunda.optimize.engine.history.variable.count.endpoint=/history/variable-instance/count
```
* The engine endpoint to the process definition.
```
camunda.optimize.engine.procdef.endpoint=/process-definition
```
* The engine endpoint to the process definition count.
```
camunda.optimize.engine.procdef.count.endpoint=/process-definition/count
```
* The engine endpoint to the process definition xml.
```
camunda.optimize.engine.procdef.xml.endpoint=/xml
```
* The engine endpoint to the historic process instances.
```
camunda.optimize.engine.history.procinst.endpoint=/history/process-instance
```
* The engine endpoint to the historic activity instance count.
```
camunda.optimize.engine.history.procinst.count.endpoint=/history/process-instance/count
```
* The engine endpoint for the user validation.
```
camunda.optimize.engine.user.validation.endpoint=/identity/verify
```
* The engine endpoint for the group retrieval.
```
camunda.optimize.engine.get.groups.endpoint=/identity/groups
```

# Elasticsearch internal data handling/storing settings

Adjust Elasticsearch's internal settings.

* Analyzer used to process queries.
```
camunda.optimize.es.analyzer.name=case_sensitive
```

* Tokenizer used to process tokens within a query.
```
camunda.optimize.es.analyzer.tokenizer=whitespace
```
* Tokenfilter applied to every token.
```
camunda.optimize.es.analyzer.tokenfilter=standard
```
* How long Elasticsearch waits until the documents are available for search. A positive value defines the duration in seconds. A value of -1 means that a refresh needs to be done manually.
```
camunda.optimize.es.settings.index.refresh_interval=-1
```
* How often should the data replicated in case of node failure. Note, the more replicas you define, the slower Elasticsearch becomes.
```
camunda.optimize.es.settings.index.number_of_replicas=0
```
* How many shards should be used in the cluster.
```
camunda.optimize.es.settings.index.number_of_shards=1
```

# Import Plugin System

Add plugins to extend the import in Optimize. Have a look at the detailed [plugin system documentation]({{< relref "technical-guide/import/plugins.md" >}}) for the details.

* Look in the given base package list for variable import adaption plugins. If empty, the import is not influenced. The value can be single value or a comma seperated list of base packages, e.g., org.mycompany.myproject1, org.mycompany.myproject2

    ```
camunda.optimize.plugin.variable.import.base.packages=
```
