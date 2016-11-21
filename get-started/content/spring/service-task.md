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

Start by modeling an executable process using the Camunda Modeler. The process should look as depicted in the screenshot below.

{{< img src="../img/process-model.png" >}}

{{< note title="Hint" class="info" >}}
If you are unfamiliar with modeling an executable process, you can read the
[Model a Process]({{< relref "bpmn20/model.md" >}}) section of the *Developing Process Applications* tutorial.
{{< /note >}}

When you are done, save the process model in the `src/main/resources` folder of your Eclipse project. Make sure to refresh the Eclipse project afterwards.

## Use Spring Auto-Deployment for BPMN 2.0 Processes

For the process to be deployed, use the auto-deployment feature provided by the Camunda engine Spring integration. In order to use this feature, modify the definition of the `processEngineConfiguration` bean inside your `src/main/webapp/WEB-INF/applicationContext.xml` file:

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

The next step consists of starting a process instance from a Spring Bean. Firstly, create a package `org.camunda.bpm.getstarted.loanapproval`. Secondly, add the following `Starter` class to it: 

```java
package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

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

This will simply add a Spring Bean to the application context, which injects to the process engine and starts a single process instance from an `afterPropertiesSet()` method.

Add the Spring bean to the `applicationContext.xml` file:

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

</beans>
```

## Invoke a Spring Bean from a BPMN 2.0 Service Task

{{< img src="../img/service-task.png" >}}

Referencing a Spring Bean from a BPMN 2.0 Service Task is simple. As shown in the screenshot above, we have to select the service task in the Camunda Modeler and provide an expression. Set *Implementation Type* to *Delegate Expression* and type `${calculateInterestService}` in the *Delegate Expression* field. Again, save the model and refresh the Eclipse project.

Finally, we add the Java class implementing the `JavaDelegate` interface.

```java
package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

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
  <bean id="calculateInterestService" class="org.camunda.bpm.getstarted.loanapproval.CalculateInterestService" />
  
</beans>
```

If you redeploy the application, you should see the following message in the logfile, meaning that the service task was executed.

<pre class="console">
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-00001 Process Engine engine created.
Spring Bean invoked
INFO org.springframework.web.context.ContextLoader.initWebApplicationContext
Root WebApplicationContext: initialization completed in 3050 ms
</pre>

{{< get-tag repo="camunda-get-started-spring" tag="Step-3" >}}
