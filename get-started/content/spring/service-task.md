---

title: 'Invoking a Spring Bean from a BPMN 2.0 Service Task'
weight: 30

menu:
  main:
    name: "Spring Bean Service Task"
    parent: "get-started-spring"
    identifier: "get-started-spring-service-task"
    pre: "Invoke a Spring Bean from a BPMN 2.0 Service Task."

---

In this section we learn how to start a process from a Spring Bean and how to invoke a Spring Bean from a BPMN 2.0 Service Task.


# Add a Spring Bean Service Task

Now that we know how to bootstrap the process engine in a Spring Application context, we can add a BPMN 2.0 process
model and interact with the process form inside our Spring beans. In this section we will

1. Model an executable BPMN 2.0 process.
2. Use Spring auto-deployment for BPMN 2.0 processes.
3. Start a process instance from a Spring bean.
4. Invoke a Spring bean from a BPMN 2.0 Service task.

## Model an Executable BPMN 2.0 Process

We start by modeling an executable process using the Camunda Modeler. The process should look as depicted in the screenshot to the left.

{{< img src="../img/process-model.png" >}}

{{< note title="Hint" class="info" >}}
If you are unfamiliar with modeling an executable process, you can read the
[Model a Process]({{< relref "bpmn20/model.md" >}}) section of the Developing Process Applications tutorial.
{{< /note >}}
      
When you are done, save the process model.
      
## Use Spring Auto-Deployment for BPMN 2.0 Processes

For the process to be deployed, we use the auto-deployment feature provided by the Camunda engine Spring integration. In order to use this feature, modify the definition of the `processEngineConfiguration` bean inside your `src/main/webapp/WEB-INF/applicationContext.xml` file:

```xml
<bean id="processEngineConfiguration" class="org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration">
  <property name="processEngineName" value="engine" />
  <property name="dataSource" ref="dataSource" />
  <property name="transactionManager" ref="transactionManager" />
  <property name="databaseSchemaUpdate" value="true" />
  <property name="jobExecutorActivate" value="false" />
  <property name="deploymentResources" value="classpath*:*.bpmn" />
</bean>
```

## Start a Process Instance from a Spring Bean

The next step consists of starting a process instance from a Spring Bean. We will simply add a Spring Bean to the application context which injects to the process engine and starts a single process instance from an `afterPropertiesSet()` Method:

```java
public class Starter implements InitializingBean {

  @Autowired
  private RuntimeService runtimeService;

  public void afterPropertiesSet() throws Exception {
    runtimeService.startProcessInstanceByKey("loanApproval");
  }

  public void setRuntimeService(RuntimeService runtimeService) {
    this.runtimeService = runtimeService;
  }
}
```

We add the Spring bean to the applicationContext.xml file:

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                         http://www.springframework.org/schema/beans/spring-beans.xsd
                         http://www.springframework.org/schema/context
                         http://www.springframework.org/schema/context/spring-context-2.5.xsd" >

  ...

  <context:annotation-config />

  <bean class="org.camunda.bpm.getstarted.loanapproval.Starter" />

  ...

</beans>
```

## Invoke a Spring Bean from a BPMN 2.0 Service Task

{{< img src="../img/service-task.png" >}}

Referencing a Spring Bean from a BPMN 2.0 Service Task is simple. As shown in the screenshot to the left, we have to select the service task in the Camunda Modeler and provide an expression in the *Expression Delegate* Field. We type `${calculateInterestService}`.

Finally, we add the Java class implementing the `JavaDelegate` interface.

```java
public class CalculateInterestService implements JavaDelegate {

  public void execute(DelegateExecution delegate) throws Exception {

    System.out.println("Spring Bean invoked.");

  }

}
```

And register it as a Spring Bean in the application context.

```java
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                         http://www.springframework.org/schema/beans/spring-beans.xsd
                         http://www.springframework.org/schema/context
                         http://www.springframework.org/schema/context/spring-context-2.5.xsd" >
  ...
  <context:annotation-config />
  <bean class="org.camunda.bpm.getstarted.loanapproval.Starter" />
  ...
</beans>
```

If you redeploy the application, you should see the following message in the logfile, meaning that the service task was executed.
  
<pre class="console">
org.camunda.bpm.engine.impl.ProcessEngineImpl <init>
INFORMATION: ProcessEngine engine created
Spring Bean invoked
org.springframework.web.context.ContextLoader initWebApplicationContext
INFORMATION: Root WebApplicationContext: initialization completed in 1960 ms
</pre>

{{< get-tag repo="camunda-get-started-spring" tag="Step-3" >}}
