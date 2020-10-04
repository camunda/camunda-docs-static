---

title: 'Adding HTML Start and Task Forms to a BPMN 2.0 Process'
weight: 50

menu:
  main:
    name: "HTML Forms"
    parent: "get-started-pa"
    identifier: "get-started-pa-forms"
    pre: "Add simple HTML based Forms to the Process."

---

In the next step, we want to add an HTML based task form to the application.


# Add a Start Form

Go back to Eclipse and add a folder named `src/main/webapp/forms`. Inside this folder, add a file named `request-loan.html`. Add the following content:

```html
<form name="requestLoan">
  <div class="form-group">
    <label for="customerId">Customer ID</label>
    <input class="form-control"
           cam-variable-type="String"
           cam-variable-name="customerId"
           name="customerId" />
  </div>
  <div class="form-group">
    <label for="amount">Amount</label>
    <input class="form-control"
           cam-variable-type="Double"
           cam-variable-name="amount"
           name="amount" />
  </div>
</form>
```

Open the process with the modeler. Click on the start event. In the properties view, click on the `Forms` tab and insert `embedded:app:forms/request-loan.html` into the `Form Key` property field. This means that we want to use an `embedded` form inside the Tasklist and that the form is loaded from the application. Save the diagram and refresh the Eclipse project.

{{< img src="../img/modeler-start-form.png" >}}


# Add a Task Form

The task form can be added and configured the same way. Add a file named `approve-loan.html` to the `src/main/webapp/forms` directory and add the following content:

```html
<form name="approveLoan">
  <div class="form-group">
    <label for="customerId">Customer ID</label>
    <input class="form-control"
           cam-variable-type="String"
           cam-variable-name="customerId"
           name="customerId"
           readonly="true" />
  </div>
  <div class="form-group">
    <label for="amount">Amount</label>
    <input class="form-control"
           cam-variable-type="Double"
           cam-variable-name="amount"
           name ="amount" />
  </div>
</form>
```

After that, open the process with the modeler again. Click on the user task. In the properties view, click on the `Forms` tab and insert `embedded:app:forms/approve-loan.html` into the `Form Key` property field.


# Re-Build and Deploy

When you are done, save all resources, [perform a Maven build](../deploy/#build-the-web-application-with-maven) and [redeploy](../deploy/#deploy-to-apache-tomcat) the process application.

{{< note title="Maven" class="info" >}}
Before selecting the pom.xml in the Package Explorer of Eclipse and performing a right-click and select Run As / Maven Install, it is best practice to perform a right-click and select Run As / Maven Clean to make sure all resources are replaced with their newest version.
{{< /note >}}

Now you go to [Tasklist](http://localhost:8080/camunda/app/tasklist) and start a new process instance for the loan approval process. You will notice that the custom form is displayed.

{{< img src="../img/start-form-embedded.png" >}}

After starting a new process instance a new task `Approve Loan` is assigned to john. To work on the task, select the task inside the list of tasks and you will also notice that the custom form is displayed.

{{< img src="../img/task-form-embedded.png" >}}

{{< get-tag repo="camunda-get-started-java" tag="Step-4" >}}
