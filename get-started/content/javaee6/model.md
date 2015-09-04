---

title: 'Modeling a BPMN 2.0 Process'
weight: 40

menu:
  main:
    name: "Model a Process"
    parent: "get-started-java-ee"
    identifier: "get-started-java-ee-model"
    pre: "Learn the basics of handling the Camunda Modeler for Eclipse and learn how to model and configure a fully executable process."

---

In this section we model our sample process with the Camunda Modeler.


# Create a new BPMN 2.0 Diagram

{{< img src="../img/eclipse-new-bpmn-diagram.png" >}}

In the eclipse *Package Explorer* select the `src/main/resources` folder. Right-click and select `New &gt; Other ...`. Go to the folder `Other` and select *BPMN 2.0 Diagram*. Click Next.

On the second page, you must specify the file name of the process. Insert *pizza-order.bpmn*. Click Finish.

## Create the Sample Pizza Order Process

{{< img src="../img/pizza-order-process.png" >}}

The sample process models a pizza order approval. In the first service task, the order should be persisted to our database. The next step is the approval of the order by a user. Based on his decision, the pizza will be prepared or a rejection email is sent.

Since we are modeling an executable process, we should give it an ID, a name and set the `isExecutable` property to `true`. Open the properties view and click on a free spot of the modeling canvas. This displays the properties of the process itself.

## Configure Placeholder Expressions

{{< img src="../img/pizza-order-expression-true.png" >}}

{{< img src="../img/pizza-order-process-conditional-expression.png" >}}

Additionally, you have to configure some placeholder expressions for the service tasks and the conditional sequence flows. Otherwise, you wouldn't be able to deploy this process on the process engine. Please set the `Expression` property of both service tasks to `${true}`. Also set the `Condition` property of the sequence flows after the exclusive gateway to `${true}`, respectively `${false}`.

When you are done, save your changes.

{{< get-tag repo="camunda-get-started-javaee" tag="Step-3" >}}
