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

# Configuration

TODO: describe how to enable the skipOutputMappingOnCanceledActivities

# Scenarios

* Business Error: Bot completes as expected
  * analyze the output parameters to raise BPMN Errors based on their values
* Technical Error: Bot does not complete as expected
  * if you want to prevent such failures to raise an incident, use BPMN Errors to handle them in a structured way as part of the process

# Throwing BPMN Errors

add a BPMN Error to your template in the Catalog

* Error Details:
  * Name: human readable name for your error
  * Code: this value is used to match the thrown error to an Error Catch event
  * Message: add further details if applicable
* Throw Expression for business errors
  * ${outputParameter.startsWith("something")}
  * refer to the Output Parameters as they are named in the Output Parameter section
* Throw Expression for technical errors
  * ${externalTask.getErrorDetails() != null}
  * don't expect the Output Parameters to be available

The first Throw Expression that matches will be applied, following expressions will not be evaluated.

# Catching BPMN Errors

apply template in your BPMN process model

adjust error details if necessary

ensure you catch each error code in a Boundary Error Event at the task

Alternative ways to catch the error:

* Boundary event on surrounding subprocess
* Event subprocess with Error start event
* In parent process that calls this process via a Call Activity
