---

title: 'Leverage business rules (6/6)'
weight: 60

menu:
  main:
    name: "Decision Automation"
    parent: "get-started-quick-start"
    identifier: "get-started-quick-start-decision-automation"
    pre: "Learn how to integrate DMN decision tables in the Process."

---

In this section, you'll learn how to add decision automation to your process by using [BPMN 2.0 *Business Rule Tasks*](/manual/latest/reference/bpmn20/tasks/business-rule-task/) and [DMN 1.3 Decision Tables](/manual/latest/reference/dmn11/).

# Add a Business Rule Task to the Process
Use the Camunda Modeler to open the Payment Retrieval process then click on the Approve Payment Task. Change the activity type to *Business Rule Task* in the wrench button menu.

{{< img src="../img/modeler-businessrule-task1.png" >}}

Next, link the Business Rule Task to a DMN table by changing `Implementation` to `DMN` and `Decision Ref` to `approve-payment` in the properties panel. In order to retrieve the result of the evaluation and save it automatically as a process instance variable in our process, we also need to change the `Result Variable` to `approved` and use `singleEntry` as the `Map Decision Result` in the properties panel.

{{< img src="../img/modeler-businessrule-task2.png" >}}

Save your changes and deploy the updated process using the `Deploy` Button in the Camunda Modeler.

# Create a DMN table using the Camunda Modeler
Create a new DMN table by clicking *File > New File > DMN Table*.

{{< img src="../img/modeler-new-dmn-table.png" >}}

# Specify the DMN table
First, give the DMN table the name Approve Payment and the ID approve-payment. The DMN table ID must match the `Decision Ref` in your BPMN process.
{{< img src="../img/modeler-dmn1.png" >}}

Next, specify the input expressions for the DMN table. In this example, we'll decide whether a payment is approved based on the item name. Your rules can also make use of the FEEL Expression Language, JUEL or Script. If you like, you can [read more about Expressions in the DMN Engine](/manual/latest/user-guide/dmn-engine/expressions-and-scripts/).

For the input column, use `item` as the *Input Expression* and `Item` as the *Input Label*:
{{< img src="../img/modeler-dmn2.png" >}}

Next, set up the output column. Use `approved` as the *Output Name* and `Approved` as the *Output Label* for the output column "Approved":
{{< img src="../img/modeler-dmn3.png" >}}

Let's create some rules by clicking on the plus icon on the left side of the DMN table. We should also change the Output Column to the Data Type `boolean`:
{{< img src="../img/modeler-dmn4.png" >}}

After setup, your DMN table should look like this:
{{< img src="../img/modeler-dmn5.png" >}}

# Deploy the DMN table
To deploy the Decision Table, click on the Deploy button in the Camunda Modeler, give it Deployment Name "Payment Retrieval Decision", then hit the Deploy button.
{{< img src="../img/modeler-dmn6.png" >}}

# Verify the Deployment with Cockpit
Now, use Cockpit to see if the decision table was successfully deployed. Go to [http://localhost:8080/camunda/app/cockpit](http://localhost:8080/camunda/app/cockpit). Log in with the credentials *demo / demo*. Navigate to the "Decisions" section. Your decision table *Approve Payment* should be listed as deployed decision definition.

{{< img src="../img/cockpit-approve-payment.png" >}}

# Inspect using Cockpit and Tasklist

Next, use Tasklist to start two new Process Instances and verify that depending on your input, the Process Instance will be routed differently.
To do so, go to [http://localhost:8080/camunda/app/tasklist](http://localhost:8080/camunda/app/tasklist). Log in with *demo / demo*.

Click on the {{< glyphicon name="list-alt" text=" Start process" >}} button to start a process instance and choose the `Payment` process.
Use the generic form to add the variables as follows:
{{< img src="../img/tasklist-dmn1.png" >}}

Hit the Start Instance button.

Next, click again on the {{< glyphicon name="list-alt" text=" Start process" >}} button to start another process instance and choose the `Payment` process.
Use the generic form to add the variables as follows:
{{< img src="../img/tasklist-dmn2.png" >}}

You'll see that depending on the input, the worker will either charge or not charge the credit card.
You can also verify that the DMN tables were evaluated by using Camunda Cockpit. Go to [http://localhost:8080/camunda/app/cockpit](http://localhost:8080/camunda/app/cockpit). Log in with the credentials *demo / demo*. Navigate to the "Decisions" section and click on Approve Payment. Check the different Decision Instances that were evaluated by clicking on the ID in the table.

A single DMN table that was executed could look like this in Camunda Cockpit:
{{< img src="../img/cockpit-dmn-table.png" >}}

{{< note title="Success!" class="info" >}}
Congratulations! You've successfully completed the Camunda BPM Quick Start. Ready to continue? We recommend the [Camunda BPM documentation](https://docs.camunda.org/manual/latest/).
{{< /note >}}


{{< get-tag repo="camunda-get-started-quickstart" tag="Step-5" >}}
