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

In order to configure the loanapproval-spring example to work with a shared process engine, you have to change three things:

Firstly, we need to set the scope of the Maven dependency of the camunda-engine dependency to `provided`. On the Camunda BPM platform the process engine library is provided as a shared library and does not need to be bundled with the application:

```xml
<dependency>
  <groupId>org.camunda.bpm</groupId>
  <artifactId>camunda-engine</artifactId>
  <scope>provided</scope>
</dependency>
```

Furthermore, you can delete the dependencies `com.h2database:h2`, and `org.slf4j:slf4j-jdk14`.

Secondly, create the folder `META-INF` in the `src/main/resources` directory and add a `src/main/resources/META-INF/processes.xml` file to your application.

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

And thirdly, the `LoanApplicationContext` class is adjusted so that the shared process engine is looked up and a `SpringServletProcessApplication` is bootstrapped:

```java
package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.ProcessEngineService;
import org.camunda.bpm.engine.HistoryService;
import org.camunda.bpm.engine.ManagementService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.spring.application.SpringProcessApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoanApplicationContext {

  @Bean
  public ProcessEngineService processEngineService() {
    return BpmPlatform.getProcessEngineService();
  }

  @Bean(destroyMethod = "")
  public ProcessEngine processEngine(){
    return BpmPlatform.getDefaultProcessEngine();
  }

  @Bean
  public SpringProcessApplication processApplication()
  {
    return new SpringProcessApplication();
  }

  @Bean
  public RepositoryService repositoryService(ProcessEngine processEngine) {
    return processEngine.getRepositoryService();
  }

  @Bean
  public RuntimeService runtimeService(ProcessEngine processEngine) {
    return processEngine.getRuntimeService();
  }

  @Bean
  public TaskService taskService(ProcessEngine processEngine) {
    return processEngine.getTaskService();
  }

  @Bean
  public HistoryService historyService(ProcessEngine processEngine) {
    return processEngine.getHistoryService();
  }

  @Bean
  public ManagementService managementService(ProcessEngine processEngine) {
    return processEngine.getManagementService();
  }

  @Bean
  public CalculateInterestService calculateInterestService()
  {
    return new CalculateInterestService();
  }
}
```

We also removed `Starter` bean as we are going to use Tasklist to manually start the process. If you like, you can also remove the class itself as it not used anymore.

After Maven build and redeploy, process definitions will be automatically deployed. Then you can go to Tasklist, login with `demo/demo` credentials, click on `Start process` and start the `Loan approval` process.
You will see in Tomcat logfile:
<pre class="console">
Spring Bean invoked
</pre>

{{< get-tag repo="camunda-get-started-spring" tag="Bonus" >}}
