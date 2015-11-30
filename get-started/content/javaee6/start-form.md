---

title: 'Start a BPMN Process using a JSF Form'
weight: 50

menu:
  main:
    name: "JSF Start Form"
    parent: "get-started-java-ee"
    identifier: "get-started-java-ee-start-form"
    pre: "Start a BPMN Process using a JSF Form"

---

In this step, we add a start form and configure it in the BPMN 2.0 process, then, re-deploy the application and start the process about the Camunda Tasklist.


# Add a Start Form

Go back to eclipse and add a file named `placeorder.xhtml` to the `src/main/webapp` folder. Add the following content:

```html
<!DOCTYPE HTML>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml"
  xmlns:ui="http://java.sun.com/jsf/facelets"
  xmlns:h="http://java.sun.com/jsf/html"
  xmlns:f="http://java.sun.com/jsf/core">

<f:view>
  <f:metadata>
    <!-- Start a new process instance. The Process Definition Key is read internally from
         request parameters and cached in the CDI conversation scope.
    -->
    <f:event type="preRenderView" listener="#{camundaTaskForm.startProcessInstanceByKeyForm()}" />
  </f:metadata>
  <h:head>
    <title>Place Order</title>
  </h:head>
  <h:body>
    <h1>Select your pizza</h1>
    <h:form id="submitForm">
      <h:panelGrid columns="2">

          <label for="pizza">Pizza</label>
          <h:selectOneMenu id="pizza" value="#{processVariables['pizza']}">
              <f:selectItem itemValue="Margarita" itemLabel="Margarita"/>
              <f:selectItem itemValue="Salami" itemLabel="Salami"/>
              <f:selectItem itemValue="Tonno" itemLabel="Tonno"/>
              <f:selectItem itemValue="Prosciutto" itemLabel="Prosciutto"/>
          </h:selectOneMenu>


          <label for="customer">Customer</label>
          <!-- create process variables using the processVariables map. -->
          <h:inputText id="customer" value="#{processVariables['customer']}" required="true" />


          <label for="address">Address</label>
          <!-- create process variables using the processVariables map. -->
          <h:inputText id="address" value="#{processVariables['address']}" required="true" />

      </h:panelGrid>

      <!-- The button starts a new process instance. This ends the conversation and redirects us to the tasklist.

           NOTE: Syntax is different when working on user task forms, see file "approveLoanRequest.xhtml".
      -->
      <h:commandButton id="submit_button" value="Order Pizza" action="#{camundaTaskForm.completeProcessInstanceForm()}" />

      <h:messages style="color:red;margin:8px;" />
    </h:form>
  </h:body>
</f:view>
</html>
```

The JSF view creates a simple input form for a customer name, address and a pizza selection. Additionally, an event listener is configured which is triggered before the view is rendered. It will call the `camundaTaskForm.startProcessInstanceByKeyForm()` method which extracts the process definition key from the URL and starts a conversation for the start form.

The user input inside the form fields are saved as a map of process variables inside the conversation.

When the form is submitted, the `camundaTaskForm.completeProcessInstanceForm()` method starts a new process instance by the process definition key which was determined by the `startProcessInstanceByKeyForm()` method. Additionally, the process variables set by the user are passed to the process instance.


# Configure the Start Form in the Process

{{< img src="../img/pizza-order-process-start-form.png" >}}

Open the process with Camunda Modeler. Click on the start event. In the properties view, set the `Form Key` property to `app:placeorder.jsf`. This means that we want to use an external JSF form and that the form is loaded from the application.

When you are done, save all resources, refresh the Eclipse project, perform a Maven build, and redeploy the process application.

{{< note title="Hint" class="info" >}}
It is best practice to perform a `clean install` build to make sure all resources are replaced with their newest version.
{{< /note >}}

If you open the Tasklist and start a new process instance for the pizza order process, the JSF form is displayed.

{{< get-tag repo="camunda-get-started-javaee" tag="Step-4" >}}
