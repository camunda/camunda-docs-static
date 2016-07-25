---

title: 'Using CMMN Milestones and Sentries'
weight: 40

menu:
  main:
    name: "Milestones & Sentries"
    parent: "get-started-cmmn"
    identifier: "get-started-cmmn-milestone"
    pre: "Use a sentry to decide when a certain milestone is reached."

---

The next step consists of adding a milestone. In CMMN, milestones express that a certain intermediate goal in the case has been reached.
The condition(s) defining when the milestone is reached are modeled using Sentries.

# Defining a Milestone

Go to the Camunda Modeler and create a new milestone from the palette. Double click on the milestone and name it `Approved`.

{{< img src="../img/cmmn-6.png" >}}

# Defining a Sentry

Sentries are used to capture conditions within a case and can trigger other events to occur. We want to express that the *Approved* milestone is reached when both tasks have successfully completed, 
if the application was sufficient and if the customer received a good rating for creditworthiness.

First create a criterion on the milestone. Click on the *Check Application* task, then on the *Append Criterion* button in the context pad. Move the criterion to the right and place it on the milestone. Note how the criterion is attached to the milestone and an onPart connection is created with the *complete* standard event.

Now we want to connect the *Provide Customer Rating* task with the same sentry. Select the task and click on the *Connect using Discretionary/OnPart or Association* button. Move the mouse cursor and place the end of the connection on the sentry.

{{< img src="../img/cmmn-7.png" >}}

Now we can configure the two conditions (application sufficient and good rating) using the properties panel. Click on the sentry and type the following into the *If Part Condition* text input field: `${applicationSufficient && rating > 3}`

{{< img src="../img/cmmn-8.png" >}}

# Milestone Listener

Milestones are not visualized in the Camunda web applications. To see that the milestone occurs we add a *CaseExecutionListener*. Switch to Eclipse and create a new Java class in the project:

```java
package org.camunda.bpm.getstarted.cmmn.loanapproval;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.CaseExecutionListener;
import org.camunda.bpm.engine.delegate.DelegateCaseExecution;

public class LifecycleListener implements CaseExecutionListener {

  private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS-CMMN");

  public void notify(DelegateCaseExecution caseExecution) throws Exception {
    LOGGER.info("Plan Item '" + caseExecution.getActivityId() + "' labeled '"
        + caseExecution.getActivityName() + "' has performed transition: "
        + caseExecution.getEventName());
  }

}
```

Now this listener has to be registered with the milestone. To do that switch back to the Camunda Modeler. Click on the milestone and then on the *Listeners* tab in the properties panel. Now you can create a new *Case Execution Listener* with a click on the plus button to the right. A new *Case Execution Listener* with the event type *occur* and the type *Java Class* has been created. Configure the Java class by inserting the following into the *Java Class* text input field: `org.camunda.bpm.getstarted.cmmn.loanapproval.LifecycleListener`

{{< img src="../img/cmmn-9.png" >}}

# Re-build and Deploy

When you are done, save all resources, perform a Maven build and redeploy the process application.

{{< note title="Hint" class="info" >}}
It is best practice to perform a `clean install` build to make sure all resources are replaced with their newest version.
{{< /note >}}

Now you can open the Tasklist and access the `demo` user's tasks. First click on the task *Check Application*. Click on `Add a variable`. In the field `Name`, enter `applicationSufficient`. For `Type`, select `Boolean`. Make sure to tick the check box that now appears.

{{< img src="../img/tasklist-check-application-variable.png" >}}

Click {{< button name="primary" text="Complete" >}}.

{{< img src="../img/tasklist-provide-rating-variable.png" >}}

Next, complete the task `Provide Customer Rating`. Again, click on `Add a variable` and name the variable `rating`. Set the type to `Integer` and the value to `4`. Click {{< button name="primary" text="Complete" >}}.

Now open the Tomcat console. You have completed the tasks and set the variables accordingly so that the milestone has occurred. On the console, you should see the following log entries:

<pre class="console">
INFO org.camunda.bpm.getstarted.cmmn.loanapproval.LifecycleListener
Plan Item 'PI_Milestone_1' labeled 'Approved' has performed transition: occur
</pre>

Our lifecycle listener has been notified, showing that the milestone has actually occurred.

{{< note title="Milestones" class="info" >}}
To learn more about milestones, consider checking the [Milestone section](/manual/latest/reference/cmmn11/milestone) in our CMMN implementation guide.
{{< /note >}}

{{< get-tag repo="camunda-get-started-cmmn" tag="Step-5" >}}

