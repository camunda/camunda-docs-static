---

title: 'Implement a JSF Task Form for a BPMN User Task.'
weight: 70

menu:
  main:
    name: "JSF Task Form"
    parent: "get-started-java-ee"
    identifier: "get-started-java-ee-task-form"
    pre: "Complete a User Task using a JSF Task Form."

---

Now we add a task form and configure it in the BPMN 2.0 process, then, re-deploy the application and go to the Camunda Tasklist to see the JSF form.

{{< img src="../img/approve-order.png" >}}

After the order has been persisted, a user can approve the order. For that, a task form is needed to display the order information and backend logic to fetch and update business objects.

# Add a CDI Controller Bean

To update the persisted entity we use a named CDI Bean `ApproveOrderController`. To gather the persisted order entity, we get the order id from the process variables of the `businessProcess`. With the id we can load the order entity through the order business logic. After the order has been updated, the detached entity state is merged by the order business logic.

```java
package org.camunda.bpm.getstarted.pizza;

import org.camunda.bpm.engine.cdi.BusinessProcess;
import org.camunda.bpm.engine.cdi.jsf.TaskForm;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.IOException;
import java.io.Serializable;

@Named
@ConversationScoped
public class ApproveOrderController implements Serializable {

  private static  final long serialVersionUID = 1L;

  // Inject the BusinessProcess to access the process variables
  @Inject
  private BusinessProcess businessProcess;

  // Inject the EntityManager to access the persisted order
  @PersistenceContext
  private EntityManager entityManager;

  // Inject the OrderBusinessLogic to update the persisted order
  @Inject
  private OrderBusinessLogic orderBusinessLogic;

  // Caches the OrderEntity during the conversation
  private OrderEntity orderEntity;

  public OrderEntity getOrderEntity() {
    if (orderEntity == null) {
      // Load the order entity from the database if not already cached
      orderEntity = orderBusinessLogic.getOrder((Long) businessProcess.getVariable("orderId"));
    }
    return orderEntity;
  }

  public void submitForm() throws IOException {
    // Persist updated order entity and complete task form
    orderBusinessLogic.mergeOrderAndCompleteTask(orderEntity);
  }
}
```

# Extend Order Business Logic

The order business logic is extended to provide a method to load an order entity from the database by order id, to merge a detached order entity and to complete the task form. For that, the task form is injected, which is provided by the Camunda CDI artifact.

Please note that the merging of the detached order entity and the completion of the task form are intentionally placed in one method. This ensures that both operations are executed in a single transaction. An error during that transaction will rollback both changes.

```java
@Stateless
@Named
public class OrderBusinessLogic {

  // ...

  // Inject task form available through the Camunda cdi artifact
  @Inject
  private TaskForm taskForm;

  public void persistOrder(DelegateExecution delegateExecution) {
    // ...
  }

  public OrderEntity getOrder(Long orderId) {
    // Load order entity from database
    return entityManager.find(OrderEntity.class, orderId);
  }

  /*
    Merge updated order entity and complete task form in one transaction. This ensures
    that both changes will rollback if an error occurs during transaction.
   */
  public void mergeOrderAndCompleteTask(OrderEntity orderEntity) {
    // Merge detached order entity with current persisted state
    entityManager.merge(orderEntity);
    try {
      // Complete user task from
      taskForm.completeTask();
    } catch (IOException e) {
      // Rollback both transactions on error
      throw new RuntimeException("Cannot complete task", e);
    }
  }

}
```

# Create a JSF Form Task Form

Add a file named `approveorder.xhtml` to the `src/main/webapp` folder. Add the following content:

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
    <p>Customer: #{approveOrderController.orderEntity.customer}</p>
    <p>Address: #{approveOrderController.orderEntity.address}</p>
    <p>Pizza: #{approveOrderController.orderEntity.pizza}</p>
    <h:form id="submitForm">
      <h:outputLabel>Approve Order?</h:outputLabel>
      <h:selectBooleanCheckbox value="#{approveOrderController.orderEntity.approved}"/><br/>
      <h:commandButton id="submit_button" value="Approve Order" action="#{approveOrderController.submitForm()}" />
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

Open the process with the modeler. Click on the *Approve Order* user task. In the properties view, set the `Form Key` property to `app:approveorder.jsf`. This means that we want to use an external JSF form and that the form is loaded from the application.


# Configure the Conditional Sequence Flows in the Process

{{< img src="../img/pizza-order-process-no.png" >}}

Open the process with the modeler. In the properties view, set the `Condition` property of the conditional sequence flows after the exclusive gateway to `${orderBusinessLogic.getOrder(orderId).approved}` respectively `${not orderBusinessLogic.getOrder(orderId).approved}`.

When you are done, save all resources, [perform a Maven build](../deploy/#build-the-process-application), and [redeploy](../deploy/#deploy-to-wildfly) the process application. Start the process `Order Pizza` in [Tasklist](http://localhost:8080/camunda/app/tasklist). Fill out the emerging form. Select the `All Tasks` element on the left side of Tasklist. An `Approve Order` task should then be listed in the tasklist. Go to the task and press on {{< glyphicon name="user" text=" Claim" >}}. Now you can approve the pizza order.

{{< get-tag repo="camunda-get-started-javaee" tag="Step-6" >}}
