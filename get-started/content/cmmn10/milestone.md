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

The next step consists in adding a *milestone*. In CMMN, milestones express that a certain intermediate goal in the case has been reached.
The condition(s) defining when the milestone is reached are modeled using Sentries:

{{< img src="../img/cmmn-3.png" >}}

# Defining a Milestone and a Sentry

Go back to eclipse and the CMMN model file. Insert the following XML:

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<cmmn:definitions id="_d7e7cad4-86f1-4c04-9dff-a9aace3afb61" targetNamespace="http://cmmn.org" xmlns:cmmn="http://www.omg.org/spec/CMMN/20131201/MODEL" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:camunda="http://camunda.org/schema/1.0/cmmn">
  <cmmn:case id="loan_application">
    <cmmn:casePlanModel autoComplete="false" name="Loan Application" id="CasePlanModel">
      <!-- Plan Items -->
      <cmmn:planItem definitionRef="HumanTask_1" id="PI_HumanTask_1"/>
      <cmmn:planItem definitionRef="HumanTask_2" id="PI_HumanTask_2"/>
      <cmmn:planItem definitionRef="Milestone_1" entryCriteriaRefs="Sentry_1" id="PI_Milestone_1"/>

      <!-- Sentries -->
      <cmmn:sentry id="Sentry_1">
        <cmmn:planItemOnPart sourceRef="PI_HumanTask_1">
          <cmmn:standardEvent>complete</cmmn:standardEvent>
        </cmmn:planItemOnPart>
        <cmmn:planItemOnPart sourceRef="PI_HumanTask_2">
          <cmmn:standardEvent>complete</cmmn:standardEvent>
        </cmmn:planItemOnPart>
        <cmmn:ifPart>
          <cmmn:condition>
            <cmmn:body><![CDATA[${applicationSufficient && rating > 3}]]></cmmn:body>
          </cmmn:condition>
        </cmmn:ifPart>
      </cmmn:sentry>

      <!-- Plan Item Definitions -->
      <cmmn:humanTask isBlocking="true" name="Check Application" id="HumanTask_1" camunda:assignee="demo">
        <cmmn:defaultControl>
          <cmmn:manualActivationRule>
            <cmmn:condition>
              <cmmn:body>${false}</cmmn:body>
            </cmmn:condition>
          </cmmn:manualActivationRule>
        </cmmn:defaultControl>
      </cmmn:humanTask>
      <cmmn:humanTask isBlocking="true" name="Provide Customer Rating" id="HumanTask_2" camunda:assignee="demo">
        <cmmn:defaultControl>
          <cmmn:manualActivationRule>
            <cmmn:condition>
              <cmmn:body>${false}</cmmn:body>
            </cmmn:condition>
          </cmmn:manualActivationRule>
        </cmmn:defaultControl>
      </cmmn:humanTask>
      <cmmn:milestone name="Approved" id="Milestone_1"/>
    </cmmn:casePlanModel>
  </cmmn:case>
</cmmn:definitions>
```

The above does not only add a milestone but also a *sentry*. Sentries are used to capture conditions within a case and can trigger other events to occur. Here we have expressed that the milestone *Approved* is reached when both tasks have successfully completed, and if the application was sufficient and the customer received a good rating for creditworthiness.

# Milestone Listener

Milestones are not visualized in the Camunda web applications. In order to see that the milestone occurs we add a *CaseExecutionListener*. Create a new Java class in the project:

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

To register the listener with the milestone, update the milestone in `loan-approval.cmmn10.xml` as follows:

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<cmmn:definitions id="_d7e7cad4-86f1-4c04-9dff-a9aace3afb61" targetNamespace="http://cmmn.org" xmlns:cmmn="http://www.omg.org/spec/CMMN/20131201/MODEL" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:camunda="http://camunda.org/schema/1.0/cmmn">
  <cmmn:case id="loan_application">
    <cmmn:casePlanModel autoComplete="false" name="Loan Application" id="CasePlanModel">
      <!-- Plan Items -->
      <cmmn:planItem definitionRef="HumanTask_1" id="PI_HumanTask_1"/>
      <cmmn:planItem definitionRef="HumanTask_2" id="PI_HumanTask_2"/>
      <cmmn:planItem definitionRef="Milestone_1" entryCriteriaRefs="Sentry_1" id="PI_Milestone_1"/>

      <!-- Sentries -->
      <cmmn:sentry id="Sentry_1">
        <cmmn:planItemOnPart sourceRef="PI_HumanTask_1">
          <cmmn:standardEvent>complete</cmmn:standardEvent>
        </cmmn:planItemOnPart>
        <cmmn:planItemOnPart sourceRef="PI_HumanTask_2">
          <cmmn:standardEvent>complete</cmmn:standardEvent>
        </cmmn:planItemOnPart>
        <cmmn:ifPart>
          <cmmn:condition>
            <cmmn:body><![CDATA[${applicationSufficient && rating > 3}]]></cmmn:body>
          </cmmn:condition>
        </cmmn:ifPart>
      </cmmn:sentry>

      <!-- Plan Item Definitions -->
      <cmmn:humanTask isBlocking="true" name="Check Application" id="HumanTask_1" camunda:assignee="demo">
        <cmmn:defaultControl>
          <cmmn:manualActivationRule>
            <cmmn:condition>
              <cmmn:body>${false}</cmmn:body>
            </cmmn:condition>
          </cmmn:manualActivationRule>
        </cmmn:defaultControl>
      </cmmn:humanTask>
      <cmmn:humanTask isBlocking="true" name="Provide Customer Rating" id="HumanTask_2" camunda:assignee="demo">
        <cmmn:defaultControl>
          <cmmn:manualActivationRule>
            <cmmn:condition>
              <cmmn:body>${false}</cmmn:body>
            </cmmn:condition>
          </cmmn:manualActivationRule>
        </cmmn:defaultControl>
      </cmmn:humanTask>
      <cmmn:milestone name="Approved" id="Milestone_1">
        <cmmn:extensionElements>
          <camunda:caseExecutionListener event="occur" class="org.camunda.bpm.getstarted.cmmn.loanapproval.LifecycleListener" />
        </cmmn:extensionElements>
      </cmmn:milestone>
    </cmmn:casePlanModel>
  </cmmn:case>
</cmmn:definitions>
```

# Re-build and deploy

When you are done, save all resources, perform a Maven build and redeploy the process application.

{{< note title="Hint" class="info" >}}
It is best practice to perform a `clean install` build to make sure all resources are replaced with their newest version.
{{< /note >}}

Now you can open the Tasklist and access the `demo` user's tasks. First click on the task *Check Application*. Click on `Add a variable`. In the field `Name`, enter `applicationSufficient`. For `Type`, select `Boolean`. Make sure to tick the check box that now appeared.

{{< img src="../img/tasklist-check-application-variable.png" >}}

Click <button class="btn btn-xs btn-primary" type="submit">Complete</button>.

{{< img src="../img/tasklist-provide-rating-variable.png" >}}

Next, complete the task `Provide Customer Rating`. Again, click on `Add a variable` and name the variable `rating`. Set the type to `Integer` and the value to `4`. Click <button class="btn btn-xs btn-primary" type="submit">Complete</button>.

Now open the Tomcat console. You have completed the tasks and set the variables accordingly so that the milestone has occurred. On the console, you should see the following log entries:

<pre class="console">
org.camunda.bpm.getstarted.cmmn.loanapproval.LifecycleListener notify
INFORMATION: Plan Item 'PI_Milestone_1' labeled 'Approved' has performed transition: occur
</pre>

Our lifecycle listener has been notified, showing that the milestone has actually occurred.

To learn more about milestones, consider checking the [Milestone section]({{< relref "reference/cmmn10/milestone.md" >}}) in our CMMN implementation guide.

{{< get-tag repo="camunda-get-started-cmmn" tag="Step-5" >}}

