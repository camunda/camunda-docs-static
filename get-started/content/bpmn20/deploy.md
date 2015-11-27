---

title: 'Deploy and Test the BPMN 2.0 Process'
weight: 40

menu:
  main:
    name: "Deploy and Test"
    parent: "get-started-pa"
    identifier: "get-started-pa-deploy"
    pre: "Build and deploy the web application to Apache Tomcat. Test the BPMN 2.0 Process with Tasklist and Cockpit."

---

The next step consists in building, deploying and testing the process.


# Build the Web Application with Maven

Select the `pom.xml` in the Package Explorer, perform a right-click and select `Run As / Maven Install`. This will generate a WAR file named `loan-approval-0.0.1-SNAPSHOT.war` In the `target/` folder of your Maven project.

{{< note title="Hint" class="info" >}}
If the `loan-approval-0.0.1-SNAPSHOT.war` file is not visible after having performed the Maven build, you need to refresh the project (F5) in eclipse.
{{< /note >}}


# Deploy to Apache Tomcat

In order to deploy the process application, copy-paste the `loan-approval-0.0.1-SNAPSHOT.war` from your Maven project to the `$CAMUNDA_HOME/server/apache-tomcat/webapps` folder.

Check the log file of the Apache Tomcat server. If you see the following log message, the deployment was successful:

<pre class="console">
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-07015 Detected @ProcessApplication class 'org.camunda.bpm.getstarted.loanapproval.LoanApprovalApplication'
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-08024 Found processes.xml file at ../webapps/loan-approval-0.1.0-SNAPSHOT/WEB-INF/classes/META-INF/processes.xml
INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-08023 Deployment summary for process archive 'loan-approval':

        loan-approval.bpmn

INFO org.camunda.commons.logging.BaseLogger.logInfo
ENGINE-08050 Process application Loan Approval App successfully deployed
</pre>


# Verify the Deployment with Cockpit

Now use Cockpit to check if the process is successfully deployed. Go to [http://localhost:8080/camunda/app/cockpit](http://localhost:8080/camunda/app/cockpit). Log in with demo / demo. Your process *Loan Approval* is visible on the start screen.

{{< img src="../img/cockpit-loan-approval.png" >}}


# Start a Process Instance

Next, go to Camunda Tasklist ([http://localhost:8080/camunda/app/tasklist](http://localhost:8080/camunda/app/tasklist)). Click on the {{< glyphicon name="list-alt" text=" Start process" >}} button to start a process instance. This opens a dialog where you can select *Loan Approval* from the list. Now you can set variables for the process instance using a generic form.

{{< img src="../img/start-form-generic.png" >}}

The generic form can be used whenever you have not added a dedicated form for a User Task or a Start Event.
Click on the *Add a variable* button to get a new row. Fill in the form as shown in the screenshot. When you are done, click *Start*.

If you now go back to [Camunda Cockpit](http://localhost:8080/camunda/app/cockpit), you see the newly created process instance that is waiting in the User Task.

# Configure Process Start Authorizations

To allow the user *john* to see the process definition *Loan Approval* you have to go to Camunda Admin ([http://localhost:8080/camunda/app/admin/default/#/authorization?resource=6](http://localhost:8080/camunda/app/admin/default/#/authorization?resource=6)). Next, click on the button *Create New* to add a new authorization on the resource *process definition*. Now you can give the user *john* all permissions on process definition *approve-loan*. When you are done, submit the new authorization.

{{< img src="../img/create-process-definition-authorization.png" >}}

Now create a second authorization for the *process instance* resource. Set the permission to *CREATE*.

{{< img src="../img/create-process-instance-authorization.png" >}}

For further details about authorizations and how to manage them please read the following sections in the user guide: [Authorization Service](/manual/latest/user-guide/process-engine/authorization-service) and [Authorizations](/manual/latest/webapps/admin/authorization-management).


# Work on the Task

Log out of the Admin. Go to Tasklist ([http://localhost:8080/camunda/app/tasklist](http://localhost:8080/camunda/app/tasklist)) and log back in with the user credentials "john / john". Now you see the *Approve Loan* task in your Tasklist. Select the task and click on the *Diagram* tab. This displays the process diagram highlighting the User Task that is waiting for you to work on it.

{{< img src="../img/diagram.png" >}}

To work on the task, select the *Form* tab. Again, there is no task form associated with the process. Click on *Load Variables*. This displays the variables you have put in in the first step.

{{< img src="../img/task-form-generic.png" >}}
