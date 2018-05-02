---

title: 'Add a User Task to the Process'
weight: 40

menu:
  main:
    name: "Involve Humans"
    parent: "get-started-quick-start"
    identifier: "get-started-quick-start-model"
    pre: "Learn the basics of integrating user tasks into a Process and how to build forms with Camunda."

---

In this section you learn how to involve humans in your process by using BPMN 2.0 *User Tasks*.

# Add a User Task
We want to modify our process so that we can involve humans.

To do so, open the process in the Camunda Modeler.

Next, from its context menu, select the activity shape (rectangle) and drag it to a good position between the Start Event and the Service Task. Name it *Approve Payment*.
{{< img src="../img/modeler-usertask1.png" >}}

Change the activity type to *User Task* by clicking on it and using the wrench button.
{{< img src="../img/modeler-usertask2.png" >}}

# Configure a User Task

Next, Open the properties view. If it is not already visible then click on the label on the right hand side of your screen and the properties view will be displayed.

Select the User Task on the canvas. This updates the selection in the properties view. Scroll to the property named `Assignee`.
Type *demo*.
{{< img src="../img/modeler-usertask3.png" >}}

# Configure a basic form in the User Task
Next, Open the properties view. If it is not already visible then click on the label on the right hand side of your screen and the properties view will be displayed.

Select the User Task on the canvas. This updates the selection in the properties view.

Click on the Tab `Forms` in the properties panel.

Add three form fields by clicking on the `plus` button:

{{< img src="../img/modeler-usertask-add.png" >}}

Field 1:

  * ID: amount
  * Type: long
  * Label: Amount

{{< img src="../img/modeler-usertask4.png" >}}

Field 2:

  * ID: item
  * Type: string
  * Label: Item

{{< img src="../img/modeler-usertask5.png" >}}

Field 3:

  * ID: approved
  * Type: boolean
  * Label: Approved?

{{< img src="../img/modeler-usertask6.png" >}}

# Deploy the Process

Use the `Deploy` Button in the Camunda Modeler for deploying the updated process to Camunda.

# Work on the Task

Go to Tasklist ([http://localhost:8080/camunda/app/tasklist](http://localhost:8080/camunda/app/tasklist)) and log in with the user credentials "demo / demo".
Click on the {{< glyphicon name="list-alt" text=" Start process" >}} button to start a process instance. This opens a dialog where you can select *Payment Retrieval* from the list. Now you can set variables for the process instance using a generic form.

{{< img src="../img/start-form-generic.png" >}}

The generic form can be used whenever you have not added a dedicated form for a User Task or a Start Event.
Click on the *Add a variable* button to get a new row. Fill in the form as shown in the screenshot. When you are done, click *Start*.


Now you see the *Approve Payment* task in your Tasklist. Select the task and click on the *Diagram* tab. This displays the process diagram highlighting the User Task that is waiting for you to work on it.

{{< img src="../img/diagram.png" >}}

To work on the task, select the *Form* tab. Because we have defined the variables in the Form Tab in the Camunda Modeler, the Tasklist has automatically generated form fields for us.

{{< img src="../img/task-form-generated.png" >}}

{{< note title="Next Step" class="info" >}}
Now we should make the process more dynamic and only show a User Task in certain situations. Let's have a look how you can [add Gateways to your Process](/get-started/quick-start/gateway/).
{{< /note >}}

{{< get-tag repo="camunda-get-started-language-agnostic" tag="Step-3" >}}
