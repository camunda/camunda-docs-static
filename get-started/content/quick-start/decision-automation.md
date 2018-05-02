---

title: 'Leverage business rules'
weight: 60

menu:
  main:
    name: "Decision Automation"
    parent: "get-started-quick-start"
    identifier: "get-started-quick-start-decision-automation"
    pre: "Learn how to integrate DMN decision tables in the Process."

---

In this section you learn how to add decision automation to your process by using BPMN 2.0 *Business Rule Tasks* and DMN 1.1 Decision Tables.

# Add a Business Rule Task to the Process
Use the Camunda Modeler to open the Payment Retrieval process. Now click on the Approve Payment Task. Change the activity type to *Business Rule Task* by using the wrench button and clicking on it.

{{< img src="../img/modeler-businessrule-task1.png" >}}

Now link the Business Rule Task to a DMN table by changing `Implementation` to `DMN` and `Decision Ref` to `approve-payment`. In order to retrieve the result of the evaluation and save it automatically as a process instance variable in our process, we need to change the `Result Variable` to `approved` and use `singleEntry` as the `Map Decision Result`.

{{< img src="../img/modeler-businessrule-task2.png" >}}

Save your changes and deploy the updated process using the `Deploy` Button in the Camunda Modeler.

# Create a DMN table using the Camunda Modeler
Create a new DMN table by clicking *File > New File > DMN Table*.

{{< img src="../img/modeler-new-dmn-table.png" >}}

# Specify the DMN table
First give the DMN table a Name Approve Payment and ID approve-payment. The ID has to match the Decision Ref in your BPMN process.
{{< img src="../img/modeler-dmn1.png" >}}

Next specify the input expressions for the DMN table. We will decide about the approval based on the item name. Your rules can also make use of the FEEL Expression Language, JUEL or Script. If you like, you can [read more about Expressions in the DMN Engine](/manual/latest/user-guide/dmn-engine/expressions-and-scripts/).
{{< img src="../img/modeler-dmn2.png" >}}

After the input, we also should define *Name* and *Label* for our Output Column Approved:
{{< img src="../img/modeler-dmn3.png" >}}

Let's create some rules by clicking on the plus icon on the left side of the DMN table. Also we should change the Output Column to the Data Type `boolean`:
{{< img src="../img/modeler-dmn4.png" >}}

Now, your DMN table should look similar to this:
{{< img src="../img/modeler-dmn5.png" >}}

# Deploy the DMN table
In order to deploy the Decision Table click on the deploy button in the Camunda Modeler, then give it a Deployment Name "Payment Retrieval Decision" and hit the Deploy button.
{{< img src="../img/modeler-dmn6.png" >}}

# Verify the Deployment with Cockpit
Now, use Cockpit to check if the decision table is successfully deployed. Go to [http://localhost:8080/camunda/app/cockpit](http://localhost:8080/camunda/app/cockpit). Log in with *demo / demo*. Go to "Decisions" section. Your decision table *Approve Payment* should be listed as deployed decision definition.

{{< img src="../img/cockpit-approve-payment.png" >}}

# Inspect using Cockpit and Tasklist

Now, use Tasklist to start two new Process Instances and verify that depending on your input, the Process Instance will be routed differently.
To do so, go to [http://localhost:8080/camunda/app/tasklist](http://localhost:8080/camunda/app/tasklist). Log in with *demo / demo*.

Click on the {{< glyphicon name="list-alt" text=" Start process" >}} button to start a process instance and choose the `Payment` process.
Use the generic form to add the variables as follows:
{{< img src="../img/tasklist-dmn1.png" >}}

Hit the Start Instance button.

Next, click again on the {{< glyphicon name="list-alt" text=" Start process" >}} button to start another process instance and choose the `Payment` process.
Use the generic form to add the variables as follows:
{{< img src="../img/tasklist-dmn2.png" >}}

You will see that depending on your input your worker will charge the credit car or not.
You can also verify that the DMN tables were evaluated by using the Cockpit. Go to [http://localhost:8080/camunda/app/cockpit](http://localhost:8080/camunda/app/cockpit). Log in with *demo / demo*. Go to "Decisions" section. Click on Approve Payment. Check the different Decision Instances that were evaluated by clicking on the ID in the table below the table.

{{< note title="Success!" class="info" >}}
You have successfully completed the Getting Started Guide. CTA?
{{< /note >}}


{{< get-tag repo="camunda-get-started-language-agnostic" tag="Step-5" >}}
