---

title: 'Instantiate a CMMN Case Definition'
weight: 30

menu:
  main:
    name: "Instantiate and Test"
    parent: "get-started-cmmn"
    identifier: "get-started-cmmn-instantiate-and-test"
    pre: "Use Java code to instantiate the case definition, then deploy and test the application."

---

In this step, we use Java code to instantiate the case definition, then deploy and test the application.


# Java Code

In order to directly create a case instance after deployment, add the following method to your `LoanApprovalApplication` class:

```java
package org.camunda.bpm.getstarted.cmmn.loanapproval;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.engine.CaseService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.variable.Variables;

@ProcessApplication("Loan Approval App CMMN")
public class LoanApprovalApplication extends ServletProcessApplication {

  @PostDeploy
  public void startCaseInstance(ProcessEngine processEngine) {
    CaseService caseService = processEngine.getCaseService();
    caseService.createCaseInstanceByKey("loan_application",
        Variables.createVariables()
          .putValue("applicationSufficient", Variables.booleanValue(null))
          .putValue("rating", Variables.integerValue(null)));

  }
}
```


# Build the Web Application with Maven

A Process Application is an ordinary Java Web Application and is deployed in exactly the same way.

Select the `pom.xml` in the Package Explorer, perform a right-click and select `Run As / Maven Install`. This will generate a WAR file named `loan-approval-cmmn-0.1.0-SNAPSHOT.war` In the `target/` folder of your Maven project.

{{< note title="Hint" class="info" >}}
If the `loan-approval-cmmn-0.1.0-SNAPSHOT.war` file is not visible after having performed the Maven build, you need to refresh the project (F5) in eclipse.
{{< /note >}}


# Deploy to Apache Tomcat

In order to deploy the process application, copy-paste the `loan-approval-cmmn-0.1.0-SNAPSHOT.war` from your Maven project to the `$CAMUNDA_HOME/server/apache-tomcat/webapps` folder.

Check the log file of the Apache Tomcat server. If you see the following log message, the deployment was successful:

<pre class="console">
INFO org.apache.catalina.startup.HostConfig.deployWAR
Deploying web application archive ...\webapps\loan-approval-cmmn-0.1.0-SNAPSHOT.war
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-07015 Detected @ProcessApplication class 'org.camunda.bpm.getstarted.cmmn.loanapproval.LoanApprovalApplication'
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-08024 Found processes.xml file at .../webapps/loan-approval-cmmn-0.1.0-SNAPSHOT/WEB-INF/classes/META-INF/processes.xml
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-08023 Deployment summary for process archive 'loan-approval-cmmn':

        loan-approval.cmmn11.xml

INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-08050 Process application Loan Approval App CMMN successfully deployed
INFO org.apache.catalina.startup.HostConfig.deployWAR
Deployment of web application archive ...\webapps\loan-approval-cmmn-0.1.0-SNAPSHOT.war has finished in 1,335 ms
</pre>


# Verify the Deployment with Camunda Tasklist

Now use Camunda Tasklist to check if the case was instantiated. Go to Camunda Tasklist ([http://localhost:8080/camunda/app/tasklist](http://localhost:8080/camunda/app/tasklist)).

{{< img src="../img/tasklist-overview.png" >}}

Log in with demo / demo. After you have logged in, click on the filter *My Tasks*. There should be two tasks listed with names *Check Application* and *Provide Customer Rating*. Select the task *Check Application*.

{{< img src="../img/tasklist-check-application.png" >}}

The Tasklist displays a generic form that can be used whenever you have not added a dedicated form for a Human Task. You can use it to add variables to the case. For now, we leave it empty. Just click {{< button name="primary" text="Complete" >}}.

Do the same with the task *Provide Customer Rating*. Both tasks have now completed and there is no more work to be done in this case instance.

{{< get-tag repo="camunda-get-started-cmmn" tag="Step-4" >}}
