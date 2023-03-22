---

title: 'Modeling a BPMN 2.0 Process'
weight: 30

menu:
  main:
    name: "Model a Process"
    parent: "get-started-java-ee"
    identifier: "get-started-java-ee-model"
    pre: "Learn the basics of handling the Camunda Modeler and learn how to model and configure a fully executable process."

---

In this section we model our sample process with the Camunda Modeler.


# Create a new BPMN 2.0 Diagram

{{< img src="../img/modeler-new-bpmn-diagram.png" >}}

Open Camunda Modeler and create a new BPMN diagram by Clicking *File > New File > BPMN Diagram*.

## Create the Sample Pizza Order Process

{{< img src="../img/pizza-order-process.png" >}}

The sample process models a pizza order approval. In the first service task, the order should be persisted to our database. The next step is the approval of the order by a user. Based on his decision, the pizza will be prepared or a rejection email is sent.

Since we are modeling an executable process, we should give it an ID, a name and set the `isExecutable` property to `true`. Click on a free spot of the modeling canvas. This displays the properties of the process itself.

## Configure Placeholder Expressions

{{< img src="../img/pizza-order-process-expression.png" >}}

{{< img src="../img/pizza-order-process-condition-expression.png" >}}

Additionally, you have to configure some placeholder expressions for the service tasks and the conditional sequence flows. Otherwise, you wouldn't be able to deploy this process on the process engine. Please set the `Expression` property of both service tasks to `${true}`. Also set the `Condition` property of the sequence flows after the exclusive gateway to `${true}`, respectively `${false}`.

When you are done, save the BPMN diagram by selecting *File > Save File As..* in the top-level menu. Name the file `pizza-order.bpmn` and save it in the `src/main/resources` folder of your Eclipse project. Switch back to Eclipse. In order to reflect the changes in Eclipse, make sure to manually refresh the project by right-clicking on the project and selecting *Refresh*.

{{< get-tag repo="camunda-get-started-javaee" tag="Step-3" >}}
