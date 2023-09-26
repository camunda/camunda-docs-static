---

title: 'Error Handling'
weight: 40

menu:
  main:
    name: "Error Handling"
    parent: "rpa"
    identifier: "rpa-error-handling"
    pre: "Handle errors from RPA bots in the process model with the help of BPMN Errors."

---

Now that we can [Orchestrate RPA Bots](../orchestrating-bots) let's have a look at how to react to a failing RPA bot or - generally speaking - how to handle the result of a bot as a BPMN error. Please note that the features presented here only work with a Camunda Platform 7.15 or later.

# Scenarios

As mentioned already, we can generally react to the result of an RPA bot execution by throwing a BPMN error. There are two main use cases for this:

* Business Error: In case an RPA bot completes as expected, its output parameters might indicate that -- from a business perspective -- the execution should be treated as an exceptional case.
* Technical Error: An RPA bot fails with a specific error message and stack trace, indicating a technical error that should be treated as an exceptional business case that can be handled in a structured way in the process model.

# Configuration

To be able to properly react to failures of RPA bots, we recommend enabling the following properties in your Camunda engine instance (e.g. an instance of Camunda Run):

* `skipOutputMappingOnCanceledActivities`: Enabling this flag will ensure that output mappings created for your service tasks will not be evaluated if the task is canceled. Since the failure of an RPA bot will cancel the service task through the RPA Bridge, this will ensure that your service tasks will be properly handled even if the RPA bot does not deliver expected output parameters on failure.
* `enableExceptionsAfterUnhandledBpmnError`: Enabling this flag will lead to an exception after throwing uncaught BPMN errors from your service task. We will get to how to throw such an error in a minute. In general, we recommend catching all BPMN Errors that can be thrown in a process. Enabling this flag will lead to processes not ending unexpectedly but rather failing with exceptions that can be observed in system logs -- this can come in handy while developing the process.

# Throwing BPMN Errors

To throw BPMN errors from your service tasks, add an error definition to your template in the Catalog in Cawemo.

{{< img src="../img/template-error-definition.png" title="Cawemo Template Error Definition" >}}

Edit the template under `BPMN Errors` as follows:

* Name: human-readable name for your error
* Code: this value is used to match the thrown error to an Error Catch event
* Message: add further details if applicable
* Throw Expression for Business Error
  * You can access Output Parameters from the bot, like `${outputParameter.startsWith("something")}` or `${outputParameter > 3000}`
  * You can refer to the Output Parameters as they are named in the Output Parameter section.
* Throw Expression for Technical Error
  * You can access the error details from the service task instance, like `${externalTask.getErrorDetails() != null}` or `${externalTask.getErrorDetails().contains("Application not available")}`
  * Don't rely on Output Parameters to be available in such cases, as those might not be returned on failure by the bot.

The first Throw Expression that matches will be applied. Any following expressions will not be evaluated.

Please remember, before the template can be used in the Camunda Modeler, it needs to be published once by clicking the “Publish” button in the upper right corner.
After publishing the template, you can synchronize it in the Camunda Modeler and update the template there at your service task.
You can now adjust the error definition details if necessary.

# Catching BPMN Errors

To handle the BPMN error that we just defined, we need to create a Boundary Error Event at the service task. This boundary event can now reference the error definition we created with the template to properly catch it.

Alternatively to catching the error directly at the service task itself, you can also catch it with

* a boundary error event on a surrounding subprocess
* an event subprocess with an error start event
* a parent process that calls this process via a Call Activity

Catching the error concludes the handling of business errors for this guide.
