---

title: 'Invoke an EJB from a BPMN 2.0 Service Task'
weight: 50

menu:
  main:
    name: "EJB Service Task"
    parent: "get-started-java-ee"
    identifier: "get-started-java-ee-service-task"
    pre: "Invoke an EJB from a BPMN 2.0 Service Task."

---

In this section we learn how to call an EJB from a BPMN 2.0 Service Task.


# Add EJB Service Task

After the process has been started with the new order as process variables, we want to persist the order to the database and only save the newly generated order id as process variable.

## Add an Entity Bean to the Process Application

To persist the entity with JPA, we add an entity bean to our process application. The entity class has to be annotated with `@Entity` and needs an `@Id` field. We also add a `@Version` field to the entity bean. This enables optimistic locking and ensures integrity during merges.

```java
package org.camunda.bpm.getstarted.pizza;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import java.io.Serializable;

@Entity
public class OrderEntity implements Serializable {

  private static  final long serialVersionUID = 1L;

  @Id
  @GeneratedValue
  protected Long id;

  @Version
  protected long version;

  protected String customer;
  protected String address;
  protected String pizza;
  protected boolean approved;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public long getVersion() {
    return version;
  }

  public void setVersion(long version) {
    this.version = version;
  }

  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPizza() {
    return pizza;
  }

  public void setPizza(String pizza) {
    this.pizza = pizza;
  }

  public boolean isApproved() {
    return approved;
  }

  public void setApproved(boolean approved) {
    this.approved = approved;
  }
}
```

## Add an EJB to the Process Application

The next step is to add a stateless EJB to the process application which is called by the process. In this EJB we inject the entity manager. It is used to manage our persistent objects during the session.

In the method `persistOrder`, a new instance of the order entity is created and the order instance will be initialized with the values which are currently saved as process variables. After the newly created instance is flushed to the database, its order id is set and the other process variables are no longer needed, so we remove the order properties and only add the order id as a process variable.

```java
package org.camunda.bpm.getstarted.pizza;

import org.camunda.bpm.engine.delegate.DelegateExecution;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Map;

@Stateless
@Named
public class OrderBusinessLogic {

  // Inject the entity manager
  @PersistenceContext
  private EntityManager entityManager;

  public void persistOrder(DelegateExecution delegateExecution) {
    // Create new order instance
    OrderEntity orderEntity = new OrderEntity();

    // Get all process variables
    Map<String, Object> variables = delegateExecution.getVariables();

    // Set order attributes
    orderEntity.setCustomer((String) variables.get("customer"));
    orderEntity.setAddress((String) variables.get("address"));
    orderEntity.setPizza((String) variables.get("pizza"));

    /*
      Persist order instance and flush. After the flush the
      id of the order instance is set.
    */
    entityManager.persist(orderEntity);
    entityManager.flush();

    // Remove no longer needed process variables
    delegateExecution.removeVariables(variables.keySet());

    // Add newly created order id as process variable
    delegateExecution.setVariable("orderId", orderEntity.getId());
  }

}
```

## Configure the EJB in the Process

{{< img src="../img/pizza-order-process-service-task-expression.png" >}}

Use the properties view of the Persist Service Task in the process (see screenshot). You need to enter `${orderBusinessLogic.persistOrder(execution)}` as the `Expression` property. This will call the `persistOrder` method of the named EJB with the current execution as parameter.

Build, deploy and execute the process. After completing the *Persist Order* step, check the logfile of the JBoss AS server. It will show an insert for the new order entity:

<pre class="console">
11:36:11,659 INFO  [stdout] (http-/127.0.0.1:8080-1) Hibernate: insert into OrderEntity (address, approved, customer, pizza, version, id) values (?, ?, ?, ?, ?, ?)
</pre>

{{< get-tag repo="camunda-get-started-javaee" tag="Step-5" >}}


# Add JSF Task Form

{{< img src="../img/approve-order.png" >}}

After the order has been persisted, a user can approve the order. For that, a task form is needed to display the order information.

## Add a CDI Controller Bean

To update the persisted entity we use a named CDI Bean `ApproveOrderController`. To gather the persisted order entity, we get the order id from the process variables of the `businessProcess`. With the id we can load the order entity trough the order business logic. After the order has been updated, the detached entity state is merged by the order business logic.

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

## Extend Order Business Logic

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
