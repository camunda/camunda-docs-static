---

title: 'Embedded Process Engine Configuration'
weight: 20

menu:
  main:
    name: "Embedded Process Engine Configuration"
    parent: "get-started-spring"
    identifier: "get-started-spring-embedded-process-engine"
    pre: "Configure an embedded process engine."

---

Now that you have set up the project with the correct Maven dependencies, we can start configuring the process engine.


# Configure an Embedded Process Engine

Add the following Spring beans configuration to the `src/main/webapp/WEB-INF/applicationContext.xml` file:

```xml
<bean id="dataSource" class="org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy">
  <property name="targetDataSource">
    <bean class="org.springframework.jdbc.datasource.SimpleDriverDataSource">
      <property name="driverClass" value="org.h2.Driver" />
      <property name="url"
                value="jdbc:h2:mem:process-engine;DB_CLOSE_DELAY=1000" />
      <property name="username" value="sa" />
      <property name="password" value="" />
    </bean>
  </property>
</bean>

<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
  <property name="dataSource" ref="dataSource" />
</bean>

<bean id="processEngineConfiguration" class="org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration">
  <property name="processEngineName" value="engine" />
  <property name="dataSource" ref="dataSource" />
  <property name="transactionManager" ref="transactionManager" />
  <property name="databaseSchemaUpdate" value="true" />
  <property name="jobExecutorActivate" value="false" />
</bean>

<bean id="processEngine" class="org.camunda.bpm.engine.spring.ProcessEngineFactoryBean">
  <property name="processEngineConfiguration" ref="processEngineConfiguration" />
</bean>

<bean id="repositoryService" factory-bean="processEngine" factory-method="getRepositoryService" />
<bean id="runtimeService" factory-bean="processEngine" factory-method="getRuntimeService" />
<bean id="taskService" factory-bean="processEngine" factory-method="getTaskService" />
<bean id="historyService" factory-bean="processEngine" factory-method="getHistoryService" />
<bean id="managementService" factory-bean="processEngine" factory-method="getManagementService" />
```

After you added these definitions to the Spring Application context, perform a full Maven build and redeploy the application. In the logfile of the Apache Tomcat server you should be able to see the initialization of the process-engine:

<pre class="console">
org.camunda.bpm.engine.impl.db.sql.DbSqlSession executeSchemaResource
INFORMATION: performing create on engine with resource org/camunda/bpm/engine/db/create/activiti.h2.create.engine.sql
org.camunda.bpm.engine.impl.db.sql.DbSqlSession executeSchemaResource
INFORMATION: performing create on history with resource org/camunda/bpm/engine/db/create/activiti.h2.create.history.sql
org.camunda.bpm.engine.impl.db.sql.DbSqlSession executeSchemaResource
INFORMATION: performing create on identity with resource org/camunda/bpm/engine/db/create/activiti.h2.create.identity.sql
org.camunda.bpm.engine.impl.db.sql.DbSqlSession executeSchemaResource
INFORMATION: performing create on case.engine with resource org/camunda/bpm/engine/db/create/activiti.h2.create.case.engine.sql
org.camunda.bpm.engine.impl.db.sql.DbSqlSession executeSchemaResource
INFORMATION: performing create on case.history with resource org/camunda/bpm/engine/db/create/activiti.h2.create.case.history.sql
org.camunda.bpm.engine.impl.SchemaOperationsProcessEngineBuild checkHistoryLevel
INFORMATION: No historyLevel property found in database.
org.camunda.bpm.engine.impl.SchemaOperationsProcessEngineBuild dbCreateHistoryLevel
Creating historyLevel property in database with value: audit
org.camunda.bpm.engine.impl.ProcessEngineImpl <init>
INFORMATION: ProcessEngine engine created
</pre>

{{< get-tag repo="camunda-get-started-spring" tag="Step-2" >}}
