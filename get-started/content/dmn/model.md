---

title: 'Create a DMN Decision Table'
weight: 30

menu:
  main:
    name: "Create a Decision Table"
    parent: "get-started-dmn"
    identifier: "get-started-dmn-model"
    pre: "Learn the basics of handling the Camunda Modeler and learn how to create and configure a fully executable decision table."

aliases: [/dmn11/model/]
---

In this section you learn how to create your first DMN [decision table](/manual/latest/reference/dmn11/decision-table/) with the Camunda Modeler. The table will contain the decision logic about the desired dish for a given season and guest count.

Now start up the Camunda Modeler.

# Create a new Decision Table

Create a new DMN table by clicking *File > New File > DMN Table*.

{{< img src="../img/modeler-new-dmn-table.png" >}}


# Start with the Table Header

Start by setting the name of the decision. Click on the top left field and type "Dish" as the [name of the decision](/manual/latest/reference/dmn11/decision-table/#decision-name).

{{< img src="../img/modeler-step1.png" >}}

Next, click on the field below and replace "decision" by "dish" to set the technical [id of the decision](/manual/latest/reference/dmn11/decision-table/#decision-id) which is used to reference the decision inside the process application.

To set the [label of the input](/manual/latest/reference/dmn11/decision-table/input/#input-label) click on the field under "Input" and type "Season" in the "Input Label" field. Same for the [output label](/manual/latest/reference/dmn11/decision-table/output/#output-label), click on the field under "Output" and type "Dish" in the "Output Label" field.

{{< img src="../img/modeler-step2.png" >}}

# Configure the Input Expression and the Output Name

Assuming that the input value for "Season" is provided by a variable with name "season", the [input expression](/manual/latest/reference/dmn11/decision-table/input/#input-expression) should be "season". 

Click on the "Season" field. In the dialog that pops up, set "season" as expression and close it.

{{< img src="../img/modeler-step3.png" >}}

Next, click on the "Dish" field and set "desiredDish" as [output name](/manual/latest/reference/dmn11/decision-table/output/#output-name).

# Configure the Type of the Input and Output

Assuming that the input value for "Season" is provided as String, the [type of the input value](/manual/latest/reference/dmn11/decision-table/input/#input-type-definition) should be "string".

Click on the field under the "Season" field. Open the combo box and choose the type "string" in the dialog that pops up.

{{< img src="../img/modeler-step4.png" >}}

Same for the [output type](/manual/latest/reference/dmn11/decision-table/output/#output-type-definition), click on the field under the "Dish" field and choose "string" as type.

# Add Rules

Now, add the first [rule](/manual/latest/reference/dmn11/decision-table/rule/) that specifies that the desired dish for season "Fall" is "Spareribs".

Click on the "+" button at the bottom of the table or just click anywhere on the last row. In the row that was added, type "Fall" in the input column and "Spareribs" in the output column.

{{< img src="../img/modeler-step5.png" >}}

"Fall" is the condition (i.e., [input entry](/manual/latest/reference/dmn11/decision-table/rule/#input-entry-condition)) of the rule. It is an expression in [FEEL](/manual/latest/reference/dmn11/feel/) which is applied and then checks if the input value (i.e., the variable "season") is equal to "Fall".

"Spareribs" is the conclusion (i.e., [output entry](/manual/latest/reference/dmn11/decision-table/rule/#output-entry-conclusion)) of the rule. It is a simple expression in JUEL and returns the String "Spareribs".

Next, add a second input "How many guests" with the input expression "guestCount" and type "integer". Fill the table with additional rules for the remaining seasons.
 
{{< img src="../img/modeler-step6.png" >}} 
 
# Configure the Hit Policy

Set the [hit policy](/manual/latest/reference/dmn11/decision-table/hit-policy/) to "UNIQUE", which specifies that only one rule can match. Verify that the decision table contains only one rule that can match the inputs.

Click on the field under the id of the decision. In the dialog that pops up, open the combo box and choose the hit policy "UNIQUE".

{{< img src="../img/modeler-step7.png" >}}

{{< note title="Default Hit Policy" class="info" >}}
The default hit policy is "UNIQUE" which is displayed as "U" in the table. If your rules are disjunct so only one rule can match then you don't need to change the hit policy.
{{< /note >}}

# Save the Decision Table

When you are done, save your changes by clicking *File > Save File As..*. In the dialogue that pops up, navigate to the application project directory (by default this is in your Eclipse workspace path). In the project directory, place the model in the `src/main/resources` folder.

{{< img src="../img/modeler-save-dmn-table.png" >}}

Return to Eclipse. Right-click the project folder and click *Refresh*. This synchronizes the new DMN file with Eclipse.

For Eclipse to automatically sychronize the workspace with the filesystem, consider [configuring auto-sync in eclipse][auto-sync] .

{{< get-tag repo="camunda-get-started-dmn" tag="Step-3" >}}

[auto-sync]: /manual/modeler/camunda-modeler/tips/#eclipse-project-synchronization
