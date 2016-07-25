---

title: 'Creating a new CMMN Case Definition'
weight: 30

menu:
  main:
    name: "Create a new Case Definition"
    parent: "get-started-cmmn"
    identifier: "get-started-cmmn-create-new-case"
    pre: "Create a new CMMN 1.1 file and initialize a Case with a Human Task."

---

In this section you learn how to create your first CMMN 1.1 case. Start up the Camunda Modeler now.

# Create a New CMMN 1.1 Diagram

Select *File / New File / CMMN Diagram* in the top-level menu of the Camunda Modeler

{{< img src="../img/cmmn-0.png" >}}

The Camunda Modeler creates a new CMMN diagram containing a case plan model, the essential part of any CMMN case definition. A plain task is created inside the case plan model.

# Define the Case ID

Since we are modeling an executable case, we should give it an Id. The Id is used by the process engine as identifier for the case. It is best practice to set it to a human-readable name. Click on the case plan model, then open the properties panel if it's not open already. Type `loan_application` into the *Case Id* input field.

{{< img src="../img/cmmn-1.png" >}}

Optionally you can rename the case plan model. Change the name of the case plan model into Loan Application using the *Name* field in the properties panel. You should see that the new name is also visible in the diagram in the top latch of the case plan model.

# Add Human Tasks

As the first part of the case, the loan application should be reviewed for any formal errors.
We therefore need a human task in our case. First click on the plain task, then on the wrench next to it. Select *Human Task* to change the type of the task.

{{< img src="../img/cmmn-2.png" >}}

Double click on the human task to edit its name. Type `Check Application` and hit enter.

Additionally, the customer's creditworthiness has to be assessed. Add a second task to the canvas from the palette at the left hand side. Morph it to a human task like the *Check Application* task. Double click on it and name it `Provide Customer Rating`.

{{< note title="Human Tasks" class="info" >}}
To learn more about human tasks, consider checking the [Human Task section](/manual/latest/reference/cmmn11/tasks/human-task) of our CMMN implementation guide.
{{< /note >}}

## Manual Activation Rule

The next step is to define that the human tasks don't need manual activation. First click on the *Check Application* task, then on the wrench again and on the manual activation rule button.

{{< img src="../img/cmmn-3.png" >}}

The manual activation rule is now active. You can see that a marker has been placed on the human task. Now is a good time to disable manual activation and to enable automatic activation. Go to the properties panel at the right hand side and click on the *Rules* tab at the top of the panel. Then define the condition `${false}` in the *Manual Activation Rule* input field.

{{< img src="../img/cmmn-4.png" >}}

Repeat these steps for the *Provide Customer Rating* task to activate and configure the activation rule as well.

{{< note title="Manual Activation Rule" class="info" >}}
 To learn more about the manual activation rule, consider checking the [Manual Activation Rule section](/manual/latest/reference/cmmn11/markers/manual-activation-rule/) of our CMMN implementation guide.
{{< /note >}}

## User Assignment

We want both tasks to be assigned to the user `demo`, so that they later appear in the *My Tasks* section of the Camunda Tasklist. To assign the user `demo` to a task, click on it and type `demo` into the *Assignee* input field in the properties panel.

{{< img src="../img/cmmn-5.png" >}}

{{< note title="User Assignment" class="info" >}}
To learn more about user assignment, check the [User Assignment section](/manual/latest/reference/cmmn11/tasks/human-task/#user-assignment/) on the human task page of our CMMN implementation guide.
{{< /note >}}

Note that there is no direct relation between the two plan items. There is no sequence flow connecting the two tasks as in BPMN. In CMMN, this expresses that the tasks can be executed concurrently.

# Save the CMMN 1.1 Diagram

When you are done, save your changes by clicking *File > Save File As..*. In the dialog that pops up, navigate to the loan application project directory (by default this is in your Eclipse workspace path). In the project directory, place the model in the `src/main/resources` folder.

Return to Eclipse. Right-click the project folder and click *Refresh*. This synchronizes the new CMMN file with Eclipse.

{{< get-tag repo="camunda-get-started-cmmn" tag="Step-3" >}}
