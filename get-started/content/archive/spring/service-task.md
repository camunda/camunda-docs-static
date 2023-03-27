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
[Model a Process]({{< ref "/quick-start/service-task.md" >}}) section of the *Quick Start* tutorial.
{{< /note >}}

When you are done, save the process model in the `src/main/resources` folder of your Eclipse project. Make sure to refresh the Eclipse project afterwards.

## Use Spring Auto-Deployment for BPMN 2.0 Processes

For the process to be deployed, use the auto-deployment feature provided by the Camunda engine Spring integration. In order to use this feature, modify the definition of the `SpringProcessEngineConfiguration` bean inside `LoanApplicationContext` as follows:

```java
@Bean
public SpringProcessEngineConfiguration engineConfiguration(
    DataSource dataSource,
    PlatformTransactionManager transactionManager,
    @Value("classpath*:*.bpmn") Resource[] deploymentResources) {
  SpringProcessEngineConfiguration configuration = new SpringProcessEngineConfiguration();

  configuration.setProcessEngineName("engine");
  configuration.setDataSource(dataSource);
  configuration.setTransactionManager(transactionManager);
  configuration.setDatabaseSchemaUpdate("true");
  configuration.setJobExecutorActivate(false);
  configuration.setDeploymentResources(deploymentResources);

  return configuration;
}
```

(the import for the `Resource` interface is `org.springframework.core.io.Resource`)

## Start a Process Instance from a Spring Bean

The next step consists of starting a process instance from a Spring Bean. Add a class called `Starter` to the `org.camunda.bpm.getstarted.loanapproval` package:

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

Add the Spring bean to the `LoanApplicationContext` class:

```java
@Configuration
public class LoanApplicationContext {

  ...

  @Bean
  public Starter starter() {
    return new Starter();
  }
}
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

  public void execute(DelegateExecution delegate) {

    System.out.println("Spring Bean invoked.");

  }

}
```

And register it as a Spring Bean in the application context.

```java
@Configuration
public class LoanApplicationContext {

  ...

  @Bean
  public Starter starter() {
    return new Starter();
  }

  @Bean
  public CalculateInterestService calculateInterestService() {
    return new CalculateInterestService();
  }
}
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
