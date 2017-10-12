---

title: "Configuration"
weight: 60

menu:
  main:
    identifier: "configuration"
    parent: "technical-guide"

---

All distributions of Camunda Optimize come with a predefined set of configuration options that can be overwritten by the user, based on current environment requirements. To do that, have a look into the folder named environment. There is one file called environment-config.json with values that override the defaults optimize properties.

Configuration file contains JSON object each field of which is containing
configuration values of one specific logical part of Camunda Optimize system.
You can see a sample configuration file with all possible configuration fields
and their default values [here](service-config.json).


In the following section you will find description and default values of separate fields
inside of main JSON object with their respective [JSONPath](https://github.com/json-path/JsonPath).


## Authentication And Security

These values control internal mechanisms of Optimize related to authentication
of users against the system and lifetime of web session tokens.

<table class="table table-striped">
  <tr>
    <th>JSON Path</th>
    <th>Default Value</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>$.auth.defaultAuthentication.password</td>
    <td>admin</td>
    <td>
      Default password that is automatically added the first time
      optimize is started.
    </td>
  </tr>
  <tr>
    <td>$.auth.defaultAuthentication.user</td>
    <td>admin</td>
    <td>
      Default user name that is automatically added the first time
      optimize is started.
    </td>
  </tr>
  <tr>
    <td>$.auth.defaultAuthentication.creationEnabled</td>
    <td>true</td>
    <td>
      Enables the creation of the default Optimize user. If you're using
      Optimize in production, you should disable this property,
      so you just use the users from the engine.
    </td>
  </tr>
  <tr>
    <td>$.auth.token.lifeMin</td>
    <td>15</td>
    <td>
      Optimize uses token-based authentication to keep track of which users are
      logged in. Define when a token is supposed to expire.
    </td>
  </tr>
</table>

## Container

Settings related to embedded Jetty container, which serves Optimize application.

<table class="table table-striped">
  <tr>
    <th>JSON Path</th>
    <th>Default Value</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>$.container.host</td>
    <td>localhost</td>
    <td>
      A host name or IP address, to identify a specific network interface on
      which to listen.
    </td>
  </tr>
  <tr>
    <td>$.container.ports.http</td>
    <td>8090</td>
    <td>
      A port number that will be used by the embedded jetty server to process
      HTTP connections.
    </td>
  </tr>
  <tr>
    <td>$.container.ports.https</td>
    <td>8091</td>
    <td>
      A port number that will be used by the embedded jetty server to process
      secure HTTPS connections.
    </td>
  </tr>
  <tr>
    <td>$.container.keystore.location</td>
    <td>keystore.jks</td>
    <td>
      HTTPS requires an SSL Certificate. When you generate an SSL Certificate,
      you are creating a keystore file and a keystore password for use when the
      browser interface connects. Location of keystore file.
    </td>
  </tr>
  <tr>
    <td>$.container.keystore.password</td>
    <td>optimize</td>
    <td>
      Password of keystore file.
    </td>
  </tr>
</table>

## Connection to Camunda BPM platform

Configuration for engines used to import data. Please note that you have to have
at least one engine configured at all times. You can configure multiple engines
to import data from. Each engine configuration should have unique alias associated
with it and represented by ```${engineAlias}```.

<table class="table table-striped">
  <tr>
    <th>JSON Path</th>
    <th>Default Value</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>$.engines.${engineAlias}.name</td>
    <td>default</td>
    <td>
      The name of the engine that will be used to import data.
    </td>
  </tr>
  <tr>
    <td>$.engines.${engineAlias}.rest</td>
    <td>http://localhost:8080/engine-rest</td>
    <td>
      A base URL that will be used for connections to the Camunda Engine REST API.
    </td>
  </tr>
  <tr>
    <td>$.engines.${engineAlias}.authentication.accessGroup</td>
    <td></td>
    <td>
      With the specified group id, only engine users that are part of the
      group can access optimize.
    </td>
  </tr>
  <tr>
    <td>$.engines.${engineAlias}.authentication.enabled</td>
    <td>false</td>
    <td>
      Toggles basic authentication on or off. When enabling basic
      authentication, please be aware that you also need to adjust the values
      of the user and password
    </td>
  </tr>
  <tr>
    <td>$.engines.${engineAlias}.authentication.password</td>
    <td></td>
    <td>
      When basic authentication is enabled, this password is used to
      authenticate against the engine.
    </td>
  </tr>
  <tr>
    <td>$.engines.${engineAlias}.authentication.user</td>
    <td></td>
    <td>
      When basic authentication is enabled, this user is used to authenticate
      against the engine.
    </td>
  </tr>
  <tr>
    <td>$.engines.${engineAlias}.enabled</td>
    <td>true</td>
    <td>
      Check if engine should be considered connected. <b>Disable only for testing!</b>
    </td>
  </tr>
</table>

## Engine Common Settings

Settings used by Optimize, which are common among all configured engines, such as
REST API endpoint locations, timeouts, etc.

<table class="table table-striped">
  <tr>
    <th>JSON Path</th>
    <th>Default Value</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>$.engine-commons.connection.timeout</td>
    <td>10000</td>
    <td>
      Maximum time in milliseconds without connection to the engine,
      Optimize should wait until a time out is triggered.
    </td>
  </tr>
  <tr>
    <td>$.engine-commons.groups.resource</td>
    <td>/identity/groups</td>
    <td>
      The engine endpoint to verify group memberships of users.
    </td>
  </tr>
  <tr>
    <td>$.engine-commons.hai.count</td>
    <td>/history/activity-instance/count</td>
    <td>
      The engine endpoint to the historic activity instance count.
    </td>
  </tr>
  <tr>
    <td>$.engine-commons.hai.resource</td>
    <td>/history/activity-instance</td>
    <td>
      The engine endpoint to the historic activity instances.
    </td>
  </tr>
  <tr>
    <td>$.engine-commons.history.procinst.count</td>
    <td>/history/process-instance/count</td>
    <td>
      The engine endpoint to the historic process instance count.
    </td>
  </tr>
  <tr>
    <td>$.engine-commons.history.procinst.resource</td>
    <td>/history/process-instance</td>
    <td>
      The engine endpoint to the historic process instances.
    </td>
  </tr>
  <tr>
    <td>$.engine-commons.history.variable.count</td>
    <td>/history/variable-instance/count</td>
    <td>
      The engine endpoint to the historic variable instance count.
    </td>
  </tr>
  <tr>
    <td>$.engine-commons.history.variable.resource</td>
    <td>/history/variable-instance</td>
    <td>
      The engine endpoint to the historic variable instances.
    </td>
  </tr>
  <tr>
    <td>$.import.data.activity-instance.pageSize.max</td>
    <td>10000</td>
    <td>
      Overwrites the maximum page size for historic activity instance
      fetching.
    </td>
  </tr>
  <tr>
    <td>$.import.data.activity-instance.pageSize.min</td>
    <td>50</td>
    <td>
      Overwrites the minimum page size for historic activity instance
      fetching.
    </td>
  </tr>
  <tr>
    <td>$.import.executorThreadCount</td>
    <td>2</td>
    <td>
      Number of threads being used to process the import jobs in the import
      job queue
    </td>
  </tr>
  <tr>
    <td>$.import.jobQueueMaxSize</td>
    <td>100</td>
    <td>
      Adjust the queue size of the import jobs created.
      A too large value might cause memory problems.
    </td>
  </tr>
  <tr>
    <td>$.import.pageMaxSize</td>
    <td>1000</td>
    <td>
      The data is fetched from the engine in pages. Define a default minimum
      and maximum size or, to be precise, a range for the number of entities
      that should be fetched at once for each import type.
    </td>
  </tr>
  <tr>
    <td>$.import.data.process-definition.pageSize.max</td>
    <td>1000</td>
    <td>
      Overwrites the maximum page size for process definitions fetching.
    </td>
  </tr>
  <tr>
    <td>$.import.data.process-definition.pageSize.min</td>
    <td>10</td>
    <td>
      Overwrites the minimum page size for process definitions fetching.
    </td>
  </tr>
  <tr>
    <td>$.import.process-definition-ids-to-import</td>
    <td></td>
    <td>
      Restrict the import only for the given process definition ids.
      If empty, all the data is imported.
    </td>
  </tr>
  <tr>
    <td>$.import.data.process-definition-xml.pageSize.max</td>
    <td>4</td>
    <td>
      Overwrites the maximum page size for process definition xml model
      fetching. Should be a low value, as large models will lead to
      memory or timeout problems.
    </td>
  </tr>
  <tr>
    <td>$.import.data.process-definition-xml.pageSize.min</td>
    <td>1</td>
    <td>
      Overwrites the minimum page size for process definition xml model
      fetching. Should be a low value, as large models will lead to
      memory or timeout problems.
    </td>
  </tr>
  <tr>
    <td>$.import.data.process-instance.pageSize.max</td>
    <td>1000</td>
    <td>
      Overwrites the maximum page size for historic process instance
      fetching.
    </td>
  </tr>
  <tr>
    <td>$.import.data.variable.pageSize.max</td>
    <td>1000</td>
    <td>
      Overwrites the maximum page size for historic process instance
      fetching.
    </td>
  </tr>
  <tr>
    <td>$.import.writer.numberOfRetries</td>
    <td>5</td>
    <td>
      Number of retries when there is a version conflict in Elasticsearch
      during the import.
    </td>
  </tr>
  <tr>
    <td>$.engine-commons.procdef.count</td>
    <td>/process-definition/count</td>
    <td>
      The engine endpoint to the process definition count.
    </td>
  </tr>
  <tr>
    <td>$.engine-commons.procdef.resource</td>
    <td>/process-definition</td>
    <td>
      The engine endpoint to the process definition.
    </td>
  </tr>
  <tr>
    <td>$.engine-commons.procdef.xml</td>
    <td>/xml</td>
    <td>
      The engine endpoint to the process definition xml.
    </td>
  </tr>
  <tr>
    <td>$.engine-commons.read.timeout</td>
    <td>15000</td>
    <td>
      Maximum time a request to the engine should last,
      before a timeout triggers.
    </td>
  </tr>
  <tr>
    <td>$.engine-commons.user.validation.resource</td>
    <td>/identity/verify</td>
    <td>
      The engine endpoint for the user validation.
    </td>
  </tr>
</table>

## Elasticsearch

Settings related to Elasticsearch such as index and type names, connection properties and shard settings.

<table class="table table-striped">
  <tr>
    <th>JSON Path</th>
    <th>Default Value</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>$.es.analyzer.name</td>
    <td>case_sensitive</td>
    <td>
      Defines the name of the analyzer.
    </td>
  </tr>
  <tr>
    <td>$.es.analyzer.tokenfilter</td>
    <td>standard</td>
    <td>
      Tokenfilter applied to every token.
    </td>
  </tr>
  <tr>
    <td>$.es.analyzer.tokenizer</td>
    <td>whitespace</td>
    <td>
      Tokenizer used to process tokens within a query.
    </td>
  </tr>
  <tr>
    <td>$.es.connection.timeout</td>
    <td>10000</td>
    <td>
      Maximum time without connection to Elasticsearch, Optimize should
      wait until a time out triggers.
    </td>
  </tr>
  <tr>
    <td>$.import.data.activity-instance.elasticsearchType</td>
    <td>event</td>
    <td>
      The name of the event type.
    </td>
  </tr>
  <tr>
    <td>$.es.heatmap.duration.targetValueType</td>
    <td>duration-target-value</td>
    <td>
      The name of the duration target value type.
    </td>
  </tr>
  <tr>
    <td>$.es.host</td>
    <td>localhost</td>
    <td>
      A hostname on which the Elasticsearch TCP listener is available.
    </td>
  </tr>
  <tr>
    <td>$.es.port</td>
    <td>9300</td>
    <td>
      A port number used by Elasticsearch to accept TCP connections.
    </td>
  </tr>
  <tr>
    <td>$.import.handler.backoff.interval</td>
    <td>1000</td>
    <td>
      Interval which is used for the backoff time calculation.
    </td>
  </tr>
  <tr>
    <td>$.import.handler.backoff.value</td>
    <td>6000</td>
    <td>
      If all jobs are backing off at the moment, this interval is used
      to trigger general backoff
    </td>
  </tr>
  <tr>
    <td>$.import.handler.backoff.max</td>
    <td>5</td>
    <td>
      Once all pages are consumed, the import scheduler component will
      start scheduling fetching tasks in increasing periods of time,
      controlled by "backoff" counter.
    </td>
  </tr>
  <tr>
    <td>$.import.handler.pages.resetInterval.unit</td>
    <td>Minutes</td>
    <td>
      Chronological unit used to calculate index reset due date.
      Possible values are:

      Seconds, Minutes, Hours, HalfDays, Days, Weeks, Months

      in case not supported value is provided 'Minutes' will be used
      for interval calculation.
    </td>
  </tr>
  <tr>
    <td>$.import.handler.pages.resetInterval.value</td>
    <td>30</td>
    <td>
      Interval the import is started all over again, meaning only missing
      entities are fetched during the import restart. The data already
      imported is kept.
    </td>
  </tr>
  <tr>
    <td>$.import.indexType</td>
    <td>import-index</td>
    <td>
      The name of the import index type.
    </td>
  </tr>
  <tr>
    <td>$.es.index</td>
    <td>optimize</td>
    <td>
      An index name used to create all Camunda Optimize types, shards, etc.
    </td>
  </tr>
  <tr>
    <td>$.es.licenseType</td>
    <td>license</td>
    <td>
      A type used to store license information
    </td>
  </tr>
  <tr>
    <td>$.import.data.process-definition.indexType</td>
    <td>process-definition-import-index</td>
    <td>
      The name of the import index type when a list of process definitions
      to import is defined.
    </td>
  </tr>
  <tr>
    <td>$.import.data.process-definition.elasticsearchType</td>
    <td>process-definition</td>
    <td>
      The name of the process definition type.
    </td>
  </tr>
  <tr>
    <td>$.import.data.process-definition-xml.elasticsearchType</td>
    <td>process-definition-xml</td>
    <td>
      The name of the process definition xml type.
    </td>
  </tr>
  <tr>
    <td>$.import.data.process-instance.idTrackingType</td>
    <td>process-instance-id-tracking</td>
    <td>
      The name of the process instance (pi) tracking type that is used
      to find pi’s that were already imported.
    </td>
  </tr>
  <tr>
    <td>$.import.data.process-instance.elasticsearchType</td>
    <td>process-instance</td>
    <td>
      The name of the process instance type.
    </td>
  </tr>
  <tr>
    <td>$.es.sampler.interval</td>
    <td>5000</td>
    <td>
      Connection sampler interval set to the client
    </td>
  </tr>
  <tr>
    <td>$.es.scrollTimeout</td>
    <td>60000</td>
    <td>
      Maximum time a request to elasticsearch should last, before a timeout
      triggers.
    </td>
  </tr>
  <tr>
    <td>$.es.settings.index.number_of_replicas</td>
    <td>0</td>
    <td>
      How often should the data replicated in case of node failure.
      Note, the more replicas you define, the slower Elasticsearch becomes.
    </td>
  </tr>
  <tr>
    <td>$.es.settings.index.number_of_shards</td>
    <td>1</td>
    <td>
      How many shards should be used in the cluster.
    </td>
  </tr>
  <tr>
    <td>$.es.settings.index.refresh_interval</td>
    <td>2s</td>
    <td>
      How long Elasticsearch waits until the documents are available
      for search. A positive value defines the duration in seconds.
      A value of -1 means that a refresh needs to be done manually.
    </td>
  </tr>
  <tr>
    <td>$.es.users.type</td>
    <td>users</td>
    <td>
      The name of the user type.
    </td>
  </tr>
  <tr>
    <td>$.import.data.variable.elasticsearchType</td>
    <td>variable</td>
    <td>
      The name of the variable type.
    </td>
  </tr>
</table>


## Other

Settings of plugin subsystem serialization format, variable import.

<table class="table table-striped">
  <tr>
    <th>JSON Path</th>
    <th>Default Value</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>$.plugin.variableImport.basePackages</td>
    <td></td>
    <td>
      Look in the given base package list for variable import adaption plugins.
      If empty, the import is not influenced.
    </td>
  </tr>
  <tr>
    <td>$.serialization.dateFormat</td>
    <td>yyyy-MM-dd'T'HH:mm:ss</td>
    <td>
      Define a custom date format that should be used
      (should be the same as in the engine)
    </td>
  </tr>
  <tr>
    <td>$.variable.maxValueListSize</td>
    <td>15</td>
    <td>
      States the maximum number of values that are shown for the user in the
      variable filter selection.
    </td>
  </tr>
</table>
