---

title: 'Complete the BPMN 2.0 Process'
weight: 70

menu:
  main:
    name: "Complete Process"
    parent: "get-started-java-ee"
    identifier: "get-started-java-ee-complete-process"
    pre: "Learn how to complete the BPMN 2.0 Process in this Java EE process application."

---

In the last section of this tutorial we learn how to complete the BPMN 2.0 Process.


# Complete the Process

## Add Prepare Pizza Task Form

{{< img src="../img/prepare-pizza.png" >}}

If the user approves the pizza order the pizza has to be prepared. So we add a user task form in which the user can confirm that preparation of the pizza has been completed.

Go back to eclipse and add a file named `preparepizza.xhtml` to the `src/main/webapp` folder. Add the following content:

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

A new conversation is started again before the view is rendered and the task is completed after the form has been submitted. The form only contains a single button.

{{< img src="../img/pizza-order-prepare-pizza.png" >}}

Open the process with the modeler plugin. Click on the prepare pizza user task. In the properties view, set the `Form Key` property to `app:preparepizza.jsf`.

When you are done, save all resources, perform a Maven build and redeploy the process application.

{{< get-tag repo="camunda-get-started-javaee" tag="Step-7" >}}

## Add Send Rejection Email Service Task

If the user disapproves the pizza order an email is sent to inform the customer. This will be simulated by a simple log output.

The EJB is extended with a method which logs an informative message for the rejection of the order.

```html
 @Stateless
@Named
public class OrderBusinessLogic {

  // ..

  private static Logger LOGGER = Logger.getLogger(OrderBusinessLogic.class.getName());

  public void persistOrder(DelegateExecution delegateExecution) {
    // ...
  }

  public OrderEntity getOrder(Long orderId) {
    // ...
  }

  public void mergeOrderAndCompleteTask(OrderEntity orderEntity) {
    // ...
  }

  public void rejectOrder(DelegateExecution delegateExecution) {
    OrderEntity order = getOrder((Long) delegateExecution.getVariable("orderId"));
    LOGGER.log(Level.INFO, "\n\n\nSending Email:\nDear {0}, your order {1} of a {2} pizza has been rejected.\n\n\n", new String[]{order.getCustomer(), String.valueOf(order.getId()), order.getPizza()});
  }

}
```

{{< img src="../img/pizza-order-process-send-rejection-email.png" >}}

Open the process with the modeler plugin. Click on the reject email service task. In the properties view, set the `Expression` property to `${orderBusinessLogic.rejectOrder(execution)}`.

When you are done, save all resources, perform a Maven build and redeploy the process application.

{{< get-tag repo="camunda-get-started-javaee" tag="Step-8" >}}
