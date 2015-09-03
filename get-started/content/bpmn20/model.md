---

title: 'Modeling a BPMN 2.0 Process'
weight: 30

menu:
  main:
    name: "Model a Process"
    parent: "get-started-pa"
    identifier: "get-started-pa-model"
    pre: "Learn the basics of handling the Camunda Modeler for Eclipse and learn how to model and configure a fully executable process."
    
---

In this section you learn how to create your first BPMN 2.0 process with the Camunda Modeler.


# Create a new BPMN Diagram

In the eclipse *Package Explorer* select the `src/main/resources` folder. Right-click and select *New > Other ...*.
Go to the folder *BPMN* and select *BPMN 2.0 Diagram*. Click Next.

{{< img src="../img/eclipse-new-bpmn-diagram.png" >}}

On the second page, you must specify the file name of the process. Insert `loan-approval.bpmn`. Click Finish.

# Start with a Simple Process

Start by modeling a simple process. From the Palette on the right hand side of the canvas, drag a *Start Event* onto the canvas.

{{< img src="../img/eclipse-simple-process.png" >}}

Double-click on the Start Event. A text box opens. Type "Loan Request Received".

{{< note title="Hint" class="info" >}}
When editing Labels, you can add line breaks by hitting `Shift + Enter`.
{{< /note >}}

Add a User Task to the process. Name it *Approve Loan*. Add an End Event named *Loan Request Approved*.


# Configure a User Task

{{< img src="../img/eclipse-simple-process-property.png" >}}

Next, Open the properties view. If the properties view is not visible, select it from the menu: *Window / Show View / Other ...* This opens a dialog. From the dialog select *Properties*.

Select the User Task on the canvas. This updates the selection in the Properties View. Scroll to the Property named `Assignee`.
Type *john*.

When you are done, save your changes.


# Configure Properties for Execution

{{< img src="../img/eclipse-simple-process-config.png" >}}

Since we are modeling an executable process, we should give it an ID and set the `isExecutable` property to `true`. Open the properties view and click on a free spot of the modeling canvas. This displays the properties of the process itself.

First, configure an ID for the process. Type *approve-loan* in the property field *Process Id*. The property ID is used by the process engine as identifier for the executable process and it is best practice to set it to a human-readable name.

Second, configure the Name of the process. Type *Loan Approval* in the property field *Name*.

Finally, check the box of the *Is Executable* property. If you do not check this box, the process definition is ignored by the process engine.

When you are done, save your changes.

{{< get-tag repo="camunda-get-started" tag="Step-3" >}}
