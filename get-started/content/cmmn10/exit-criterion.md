---

title: 'Using a CMMN Sentry as Exit Criterion'
weight: 50

menu:
  main:
    name: "Exit Criterion"
    parent: "get-started-cmmn"
    identifier: "get-started-cmmn-exit"
    pre: "Use a sentry to decide when a task can be skipped / cancelled."
    
---

When a loan application is not sufficient, for example because it has formal errors, there is no need to provide a customer rating any longer. We can express this in CMMN by adding a sentry which acts as exit criterion.

{{< img src="../img/cmmn-complete.png" >}}


# Add an Exit Sentry

In the CMMN XML file, add the following sentry definition and register it for the *Provide Customer Rating* human task:

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<cmmn:definitions id="_d7e7cad4-86f1-4c04-9dff-a9aace3afb61" targetNamespace="http://cmmn.org" xmlns:cmmn="http://www.omg.org/spec/CMMN/20131201/MODEL" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:camunda="http://camunda.org/schema/1.0/cmmn">
  <cmmn:case id="loan_application">
    <cmmn:casePlanModel autoComplete="false" name="Loan Application" id="CasePlanModel">
      <!-- Plan Items -->
      <cmmn:planItem definitionRef="HumanTask_1" id="PI_HumanTask_1"/>
      <cmmn:planItem definitionRef="HumanTask_2" exitCriteriaRefs="Sentry_2" id="PI_HumanTask_2"/>
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
      <cmmn:sentry id="Sentry_2">
        <cmmn:planItemOnPart sourceRef="PI_HumanTask_1">
          <cmmn:standardEvent>complete</cmmn:standardEvent>
        </cmmn:planItemOnPart>
        <cmmn:ifPart>
          <cmmn:condition>
            <cmmn:body>${!applicationSufficient}</cmmn:body>
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


# Re-build and Deploy

Again, rebuild and redeploy the project.

{{< img src="../img/tasklist-check-application-variable-unchecked.png" >}}

Go to Tasklist and access the `demo` user's tasks. As before, check the task *Check Application*. In order to trigger the sentry, add the variable `applicationSufficient` of type `Boolean`, but this time make sure to leave the check box unchecked. Click <button class="btn btn-xs btn-primary" type="submit">Complete</button>.

You will notice that the task *Provide Customer Rating* has disappeared from the Tasklist. That is because the sentry has been triggered and the task's exit criterion has been fulfilled. Also, you can check the Tomcat console. This time, there is no log entry for the milestone.

To learn more about sentries, consider checking the [Sentry section](/manual/master/reference/cmmn10/sentry.md) in our CMMN implementation guide.

{{< get-tag repo="camunda-get-started-cmmn" tag="Step-6" >}}
