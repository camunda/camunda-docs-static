---

title: 'Using Shared Process Engine'
weight: 40

menu:
  main:
    name: "Shared Process Engine"
    parent: "get-started-spring"
    identifier: "get-started-spring-shared-process-engine"
    pre: "Use a shared process engine for a web application using the Spring Framework."

---

In the last section of this tutorial we learn how to use a shared process engine.


# Alternative Configuration: Using Shared Process Engine

So far, we explored how to set up an embedded process engine inside a web application using the Spring Framework. You can also use the Spring Framework to develop applications that use a shared process engine. As opposed to the embedded process engine, the shared process engine is controlled independently from an application and is started / stopped by the runtime container (like Apache Tomcat). This allows multiple applications (or a single modular application) to use the same process engine. You can also re-deploy individual applications independently from the process engine.

In order to configure the loanapproval-spring example to work with an embedded process engine, you have to change three things:

First, we need to set the scope of the Maven dependency of the camunda-engine dependency to `provided`. On the Camunda BPM platform the process engine library is provided as a shared library and does not need to be bundled with the application:

```xml
<dependency>
  <groupId>org.camunda.bpm</groupId>
  <artifactId>camunda-engine</artifactId>
  <version>${camunda.version}</version>
  <scope>provided</scope>
</dependency>
```

Furthermore, you can delete the dependencies `org.springframework:spring-jdbc`, `com.h2database:h2`, and `org.slf4j:slf4j-jdk14`.

Second, you need to add a `META-INF/processes.xml` file to your application.

```xml
<?xml version="1.0" encoding="UTF-8" ?>

<process-application
    xmlns="http://www.camunda.org/schema/1.0/ProcessApplication"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">

  <process-archive name="loan-approval">
    <process-engine>default</process-engine>
    <properties>
      <property name="isDeleteUponUndeploy">false</property>
      <property name="isScanForProcessDefinitions">true</property>
    </properties>
  </process-archive>

</process-application>
```

And third, the `applicationContext.xml` file is adjusted so that the shared process engine is looked up and a `SpringServletProcessApplication` is bootstrapped:

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                         http://www.springframework.org/schema/beans/spring-beans.xsd
                         http://www.springframework.org/schema/context
                         http://www.springframework.org/schema/context/spring-context-2.5.xsd" >

  <!-- bind the process engine service as Spring Bean -->
  <bean name="processEngineService" class="org.camunda.bpm.BpmPlatform" factory-method="getProcessEngineService" />

  <!-- bind the default process engine as Spring Bean -->
  <bean name="processEngine" factory-bean="processEngineService" factory-method="getDefaultProcessEngine" />

  <bean id="repositoryService" factory-bean="processEngine" factory-method="getRepositoryService"/>
  <bean id="runtimeService" factory-bean="processEngine" factory-method="getRuntimeService"/>
  <bean id="taskService" factory-bean="processEngine" factory-method="getTaskService"/>
  <bean id="historyService" factory-bean="processEngine" factory-method="getHistoryService"/>
  <bean id="managementService" factory-bean="processEngine" factory-method="getManagementService"/>

  <!-- bootstrap the process application -->
  <bean id="processApplication" class="org.camunda.bpm.engine.spring.application.SpringServletProcessApplication" />

  <context:annotation-config />

  <bean class="org.camunda.bpm.getstarted.loanapproval.Starter" />
  <bean id="calculateInterestService" class="org.camunda.bpm.getstarted.loanapproval.CalculateInterestService" />

</beans>
```

{{< get-tag repo="camunda-get-started-spring" tag="Bonus" >}}

<script type="text/ng-template" id="code-annotations">
  {
    "pom.xml":
    {
    "camunda-engine": "The process engine is the component responsible for picking up your BPMN 2.0 processes and executing them.",
    "camunda-engine-spring": "Spring framework integration module for the process engine.",
    "spring-web": "The Spring web artifact declaratively pulls in the Spring core libraries.",
    "com.h2database": "We use an embedded H2 database for the process engine",
    "springsource-repo": "Repository for Spring artifacts.",
    "camunda-bpm-nexus" : "Camunda nexus providing the Maven artifacts."

    },
    "web.xml":
    {
    "contextConfigLocation": "Location of Spring XML files",
    "ContextLoaderListener": "The listener that kick-starts Spring"
    },
    "embeddedEngine.xml":
    {
    "dataSource": "Configuration of the dataSource to be used by the process engine. In this case we use an in-memory H2 database.",
    "processEngineConfiguration": "The process engine configuration bean allows configuration of the process engine. In this case, the datasource and transaction manager properties are configured.",
    "ProcessEngineFactoryBean": "The Process Engine is created by a factory bean."
    },
    "autodeployment":
    {
    "classpath*:*.bpmn": "picks up all BPMN 2.0 files on the classpath and deploys them to the process engine."
    },
    "applicationContext-withSpringPa":
    {
    "processApplication": "Defining a SpringServletProcessApplication makes sure the META-INF/processes.xml file is picked up.",
    "ManagedProcessEngineFactoryBean": "Alternative Process Engine Factory Bean which registers the process engine with the ProcessEngineService.",
    "\"engine\"": "the name of the process engine. Must be referenced in the META-INF/processes.xml file."
    }
  }
</script>
