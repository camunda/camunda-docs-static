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

Add the following Spring beans to the `LoanApplication` class as follows:

```java
package org.camunda.bpm.getstarted.loanapproval;

import javax.sql.DataSource;

import org.camunda.bpm.engine.HistoryService;
import org.camunda.bpm.engine.ManagementService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.spring.ProcessEngineFactoryBean;
import org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class LoanApplicationContext {

  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("org.h2.Driver");
    dataSource.setUrl("jdbc:h2:mem:process-engine;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
    dataSource.setUsername("sa");
    dataSource.setPassword("");
    return dataSource;
  }

  @Bean
  public PlatformTransactionManager transactionManager(DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }

  @Bean
  public SpringProcessEngineConfiguration engineConfiguration(DataSource dataSource, PlatformTransactionManager transactionManager) {
    SpringProcessEngineConfiguration configuration = new SpringProcessEngineConfiguration();

    configuration.setProcessEngineName("engine");
    configuration.setDataSource(dataSource);
    configuration.setTransactionManager(transactionManager);
    configuration.setDatabaseSchemaUpdate("true");
    configuration.setJobExecutorActivate(false);

    return configuration;
  }

  @Bean
  public ProcessEngineFactoryBean engineFactory(SpringProcessEngineConfiguration engineConfiguration) {
    ProcessEngineFactoryBean factoryBean = new ProcessEngineFactoryBean();
    factoryBean.setProcessEngineConfiguration(engineConfiguration);
    return factoryBean;
  }

  @Bean
  public ProcessEngine processEngine(ProcessEngineFactoryBean factoryBean) throws Exception {
    return factoryBean.getObject();
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
}
```

This bootstraps a process engine with an in-memory H2 database and makes the engine as well as its API services available as Spring beans.

After you added the beans to the application context, perform a full Maven build and redeploy the application. In the logfile of the Apache Tomcat server you should be able to see the initialization of the process-engine:

<pre class="console">
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-03016 Performing database operation 'create' on component 'engine' with resource 'org/camunda/bpm/engine/db/create/activiti.h2.create.engine.sql'
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-03016 Performing database operation 'create' on component 'history' with resource 'org/camunda/bpm/engine/db/create/activiti.h2.create.history.sql'
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-03016 Performing database operation 'create' on component 'identity' with resource 'org/camunda/bpm/engine/db/create/activiti.h2.create.identity.sql'
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-03016 Performing database operation 'create' on component 'case.engine' with resource 'org/camunda/bpm/engine/db/create/activiti.h2.create.case.engine.sql'
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-03016 Performing database operation 'create' on component 'case.history' with resource 'org/camunda/bpm/engine/db/create/activiti.h2.create.case.history.sql'
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-03016 Performing database operation 'create' on component 'decision.engine' with resource 'org/camunda/bpm/engine/db/create/activiti.h2.create.decision.engine.sql'
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-03016 Performing database operation 'create' on component 'decision.history' with resource 'org/camunda/bpm/engine/db/create/activiti.h2.create.decision.history.sql'
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-03067 No history level property found in database
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-03065 Creating historyLevel property in database for level: HistoryLevelAudit(name=audit, id=2)
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-00001 Process Engine engine created.
</pre>

{{< get-tag repo="camunda-get-started-spring" tag="Step-2" >}}
