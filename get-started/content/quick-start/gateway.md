---

title: 'Add Gateways to the Process'
weight: 50

menu:
  main:
    name: "Make it dynamic"
    parent: "get-started-quick-start"
    identifier: "get-started-quick-start-gateway"
    pre: "Learn how to make your Process more dynamic by adding Gateways to the Process."

---

In this section you learn how to make your process more dynamic by using BPMN 2.0 *Exclusive Gateways*.

# Add two Gateways
We want to modify our process so that we can make it more dynamic.

To do so, open the process in the Camunda Modeler.

Next, from its context menu, select the gateway shape (diamond) and drag it to a good position between the Start Event and the Service Task. Move down the User Task and add another Gateway after it. Now also adjust the Sequence Flows so the model looks like this.
{{< img src="../img/modeler-gateway1.png" >}}

Now also name the new elements correctly:
{{< img src="../img/modeler-gateway2.png" >}}

# Configure the Gateways

Next, Open the properties view and select the `<1000 €` Sequence Flow after the Gateway on the canvas. This updates the selection in the properties view.
Scroll to the property named `Condition Type` and change it to `Expression`. Then type `${amount<1000}` as the Expression.
We are using the [Java Unified Expression Language](https://docs.camunda.org/manual/latest/user-guide/process-engine/expression-language/) to evaluate the Gateway.

{{< img src="../img/modeler-gateway3.png" >}}

Now, go ahead and change the Expressions for the other Sequence Flows, too.

For the `>=1000 €` Sequence Flow we should use the Expression `${amount>=1000}`:
{{< img src="../img/modeler-gateway4.png" >}}


For the `Yes` Sequence Flow we should use the Expression `${approved}`:
{{< img src="../img/modeler-gateway5.png" >}}

For the `No` Sequence Flow we should use the Expression `${!approved}`:
{{< img src="../img/modeler-gateway6.png" >}}

# Deploy the Process

Use the `Deploy` Button in the Camunda Modeler for deploying the updated process to Camunda.

# Work on the Task

Go to Tasklist ([http://localhost:8080/camunda/app/tasklist](http://localhost:8080/camunda/app/tasklist)) and log in with the user credentials "demo / demo".
Click on the {{< glyphicon name="list-alt" text=" Start process" >}} button to start a process instance for the *Payment Retrieval* Process.
Now you can set variables for the process instance using the generic form as we have learnt when looking at *User Tasks*.

{{< img src="../img/start-form-generic.png" >}}

Fill in the form as shown in the screenshot and make sure you use an amount that is larger or equal to 1000 in order to see the User Task *Approve Payment*.
When you are done, click *Start*.

You should see the *Approve Payment* when you click on *All Tasks*.
To work on the task, select the *Form* tab and check the *approved* checkbox so that are payment retrieval gets approved.
We should see that our worker prints something to the console.

Next, repeat the same procedure and reject the payment. Also create one instance with an amount of less than 1000 to see that the first gateways works correctly.

{{< note title="Next Step" class="info" >}}
Seems like you are ready for Decision Automation. Let's have a look how you can [add Business Rules to your Process](/get-started/quick-start/decision-automation/).
{{< /note >}}

{{< get-tag repo="camunda-get-started-language-agnostic" tag="Step-4" >}}
