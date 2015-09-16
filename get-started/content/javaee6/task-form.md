---

title: 'Implement a JSF Task Form for a BPMN User Task.'
weight: 60

menu:
  main:
    name: "JSF Task Form"
    parent: "get-started-java-ee"
    identifier: "get-started-java-ee-task-form"
    pre: "Complete a User Task using a JSF Task Form."

---

Now we add a task form and configure it in the BPMN 2.0 process, then, re-deploy the application and go to the Camunda Tasklist to see the JSF form.


# Create the JSF Form Task Form

Go back to eclipse and add a file named `approveorder.xhtml` to the `src/main/webapp` folder. Add the following content:

```html
<!DOCTYPE HTML>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml"
xmlns:ui="http://java.sun.com/jsf/facelets"
xmlns:h="http://java.sun.com/jsf/html"
xmlns:f="http://java.sun.com/jsf/core">

<f:view>
<f:metadata>
  <!-- Start working on a task. Task Id is read internally from
       request parameters and cached in the CDI conversation scope.
  -->

  <f:event type="preRenderView" listener="#{camundaTaskForm.startTaskForm()}" />
</f:metadata>
<h:head>
  <title>Approve Order</title>
</h:head>
<h:body>
  <h1>Order:</h1>
  Customer: #{approveOrderController.orderEntity.customer}
  Address: #{approveOrderController.orderEntity.address}
  Pizza: #{approveOrderController.orderEntity.pizza}
  <h:form id="submitForm">
    <h:outputLabel>Approve Order?</h:outputLabel>
    <h:selectBooleanCheckbox value="#{approveOrderController.orderEntity.approved}"/><br/>
    <h:commandButton id="submit_button" value="Approve Order" action="#{approveOrderController.submitForm()}" />
  </h:form>
</h:body>
</f:view>
</html>
</script>

<script type="text/html" id="preparepizza.xhtml">
<!DOCTYPE HTML>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml"
  xmlns:ui="http://java.sun.com/jsf/facelets"
  xmlns:h="http://java.sun.com/jsf/html"
  xmlns:f="http://java.sun.com/jsf/core">

<f:view>
  <f:metadata>
    <!-- Start working on a task. Task Id is read internally from
         request parameters and cached in the CDI conversation scope.
    -->

    <f:event type="preRenderView" listener="#{camundaTaskForm.startTaskForm()}" />
  </f:metadata>
  <h:head>
    <title>Prepare Pizza</title>
  </h:head>
  <h:body>
    <h1>Please prepare pizza</h1>
    <h:form id="submitForm">
      <h:commandButton id="submit_button" value="Done" action="#{camundaTaskForm.completeTask()}" />
    </h:form>
  </h:body>
</f:view>
</html>
```

The JSF view displays the order properties and provides a checkbox to approve the order on submit. Additionally, an event listener is configured which is triggered before the view is rendered. It will call the `camundaTaskForm.startTaskForm()` method which extracts the task id from the URL and starts a conversation for the task form.

When the user approves or disapproves the order, it is directly set on the cached order entity.

On form submit, the `approveOrderController.submitForm()` method calls the EJB `mergeOrderAndCompleteTask` method with the cached order entity. The EJB will merge the updated order entity if necessary and completes the task form.


# Configure the Task Form in the Process

{{< img src="../img/pizza-order-process-task-form.png" >}}

Open the process with the modeler plugin. Click on the approve order user task. In the properties view, set the `Form Key` property to `app:approveorder.jsf`. This means that we want to use an external JSF form and that the form is loaded from the `app` location.


# Configure the Conditional Sequence Flows in the Process

{{< img src="../img/pizza-order-yes.png" >}}

{{< img src="../img/pizza-order-no.png" >}}

Open the process with the modeler plugin. In the properties view, set the `Condition` property of the conditional sequence flows after the exclusive gateway to `${orderBusinessLogic.getOrder(orderId).approved}` respectively `${not orderBusinessLogic.getOrder(orderId).approved}`.

When you are done, save all resources, perform a Maven build and redeploy the process application. You can now approve the pizza order from the tasklist.

{{< get-tag repo="camunda-get-started-javaee" tag="Step-6" >}}
