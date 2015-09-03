---

title: 'Invoking a Java Class from a BPMN 2.0 Service Task'
weight: 50

menu:
  main:
    name: "Java Service Task"
    parent: "get-started-pa"
    identifier: "get-started-pa-java-service-task"
    pre: "Invoke a Java Class from a BPMN 2.0 Service Task."
    
---

In the last section of this tutorial we learn how to invoke a Java Class from a BPMN 2.0 Service Task.


# Add a Service Task to the Process

Use the Camunda modeler plugin in eclipse to add a service task after the user task. The service task can be dropped on a sequence flow (see screenshot).

{{< img src="../img/eclipse-add-service-task.png" >}}

# Add a JavaDelegate Implementation

Now we need to add the actual service task implementation. Add a class named `ProcessRequestDelegate` implementing the `JavaDelegate` interface:

```java
public class ProcessRequestDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");

  public void execute(DelegateExecution execution) throws Exception {
    LOGGER.info("Processing request by '"+execution.getVariable("customerId")+"'...");
  }

}
```
<div class="app-source" data-source-code="ProcessRequestDelegate" annotate="code-annotations"></div>


# Configure the Class in the Process

Use the properties view to reference the Service Task in the process (see screenshot). You need to provide the fully qualified classname of your class in the `class` property field.

{{< img src="../img/eclipse-configure-service.png" >}}

Build, deploy and execute the process. After completing the *Approve Application* step, check the logfile of the Apache Tomcat server:

<pre class="console">
org.camunda.bpm.getstarted.loanapproval.ProcessRequestDelegate execute
INFORMATION: Processing request by 'AC-343422'...
</pre>

{{< note title="Classloading with a shared process engine" >}}
The process engine resolves the ProcessRequestDelegate class from the application classloader. This allows you to

* have a different classloader for each Process Application,
* bundle libraries inside your application,
* (re-)deploy the application at runtime (without stopping / restarting the process engine).

{{< /note >}}

{{< get-tag repo="camunda-get-started" tag="Step-5" >}}
