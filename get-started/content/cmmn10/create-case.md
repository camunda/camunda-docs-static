---

title: 'Creating a new CMMN Case Definition'
weight: 30

menu:
  main:
    name: "Create a new Case Definition"
    parent: "get-started-cmmn"
    identifier: "get-started-cmmn-create-new-case"
    pre: "Create a new CMMN 1.0 file and initialize a Case with a Human Task."
    
---

In this section you learn how to create your first CMMN 1.0 case in XML. Don't worry, the XML is not going to be complex.


# Create an Empty CMMN 1.0 File
  
In the eclipse *Package Explorer* select the `src/main/resources` folder. Right-click and select `New > Other ...`. Select *File*. Click Next.

{{< img src="../img/eclipse-new-file.png" >}}
    
On the second page, you must specify the file name of the case. Insert `loan-approval.cmmn10.xml`. Click Finish.
      
# Set Up the Case Plan Model

{{< img src="../img/cmmn-1.png" >}}

Open the newly created file and copy-paste the following contents into it:

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<cmmn:definitions id="_d7e7cad4-86f1-4c04-9dff-a9aace3afb61" targetNamespace="http://cmmn.org" xmlns:cmmn="http://www.omg.org/spec/CMMN/20131201/MODEL" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:camunda="http://camunda.org/schema/1.0/cmmn">
  <cmmn:case id="loan_application">
    <cmmn:casePlanModel autoComplete="false" name="Loan Application" id="CasePlanModel">

    </cmmn:casePlanModel>
  </cmmn:case>
</cmmn:definitions>
```

This snippet declares a *case plan model*, the essential part of any CMMN case definition.


# Add Human Tasks

{{< img src="../img/cmmn-2.png" >}}

As the first part of the loan application case, the loan application should be reviewed for any formal errors. We therefore add a *human task* to the case. Tasks are always specified by two parts: A *plan item* and a *plan item definition*. While the plan item definition is a blue print for the task's behavior, the plan item represents the actual task instantiation. Update your CMMN definition as follows (insert the highlighted parts at the appropriate positions or simply replace the entire content):

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<cmmn:definitions id="_d7e7cad4-86f1-4c04-9dff-a9aace3afb61" targetNamespace="http://cmmn.org" xmlns:cmmn="http://www.omg.org/spec/CMMN/20131201/MODEL" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:camunda="http://camunda.org/schema/1.0/cmmn">
  <cmmn:case id="loan_application">
    <cmmn:casePlanModel autoComplete="false" name="Loan Application" id="CasePlanModel">
      <!-- Plan Items -->
      <cmmn:planItem definitionRef="HumanTask_1" id="PI_HumanTask_1"/>

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
    </cmmn:casePlanModel>
  </cmmn:case>
</cmmn:definitions>
```

In addition, the customer's creditworthiness has to be assessed. We add another user task:

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<cmmn:definitions id="_d7e7cad4-86f1-4c04-9dff-a9aace3afb61" targetNamespace="http://cmmn.org" xmlns:cmmn="http://www.omg.org/spec/CMMN/20131201/MODEL" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:camunda="http://camunda.org/schema/1.0/cmmn">
  <cmmn:case id="loan_application">
    <cmmn:casePlanModel autoComplete="false" name="Loan Application" id="CasePlanModel">
      <!-- Plan Items -->
      <cmmn:planItem definitionRef="HumanTask_1" id="PI_HumanTask_1"/>
      <cmmn:planItem definitionRef="HumanTask_2" id="PI_HumanTask_2"/>

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
    </cmmn:casePlanModel>
  </cmmn:case>
</cmmn:definitions>
```

Note how there is no direct relation between the two plan items. There is no sequence flow connecting the two tasks as in BPMN. In CMMN, this expresses that the tasks can be executed concurrently.
  
To learn more about human tasks, consider checking the [Human Task section](/manual/master/reference/cmmn10/tasks/human-task) of our CMMN implementation guide.
  
{{< get-tag repo="camunda-get-started-cmmn" tag="Step-3" >}}
