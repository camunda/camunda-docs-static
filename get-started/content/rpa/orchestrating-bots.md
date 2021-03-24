---

title: '3) Orchestrating RPA Bots'
weight: 30

menu:
  main:
    name: "3) Orchestrating RPA Bots"
    parent: "rpa"
    identifier: "rpa-orchestrating-bots"
    pre: ""

---

<a href="/get-started/rpa/error-handling" style="float:right;">4) Error Handling --&gt;</a>

[&lt;-- 2) Installation & Configuration](/get-started/rpa/installation)

<div style="clear:both;"></div>

## Creating and deploying a Bot

### UiPath

In order to orchestrate your RPA bots and the tasks that they automate, you need to create a UiPath package that contains the scripts that the RPA bots should execute. In UiPath these scripts are called "Process".

The data that these scripts need as input should be configured as IN arguments in UiPath Studio. The RPA Bridge will then pass the Camunda task input parameters via the UiPath Orchestrator into the UiPath Robot. In a similar way will the OUT arguments of UiPath be returned back into the Camunda engine as task output parameters. The names of these IN and OUT arguments will be used in the Cawemo Catalog.

Once the UiPath script works as expected, it needs to be deployed into the UiPath Orchestrator as a new package. The name of this package will be used in the Cawemo Catalog.

Please make sure that the UiPath Orchestrator can successfully trigger a UiPath Robot to execute the given package.

In case you have trouble setting up and running your UiPath scripts via the UiPath Orchestrator please refer to the <a target="_blank" href="https://docs.uipath.com/">UiPath documentation</a>.

### Automation Anywhere

## Adding a template to the Catalog

For each UiPath package that should be orchestrated, there needs to be a corresponding template in the Cawemo Catalog.

In order to create a new template, you need to

* Open the "Home" view of Cawemo
* Create a new "Catalog Project" using the split button and give it a name
* Inside this Catalog Project, create a new UiPath Template (please note: for Cawemo On-Premises 1.4 there is only the raw JSON editing of templates available and the button is called "New template")
* Edit the template as follows:
  * Template name: Define a human readable name, such that users will understand which UiPath package this template refers to
  * Service task label: leave empty if you do not want to give a defaul label to the BPMN service task
  * UiPath package name: add the package name that you defined in UiPath Orchestrator
  * Input parameter: for each UiPath IN argument add one entry with the matching name
  * Output parameter: for each UiPath OUT argument add one entry with the matching name
  * Descriptions: In order to provide details on how to use the template, explain what the UiPath package does or what values each parameter expects. The descriptions will be shown in the Camunda Modeler when the template is being used.

Templates are saved automatically and will be available immediately to the Camunda Modeler. Versioning and publishing of templates is already planned to be added soon.

Learn more about <a target="_blank" href="https://docs.camunda.org/manual/latest/modeler/element-templates/">advanced configuration options of templates</a>.

## Modeling and executing a process

The Camunda Modeler updates the list of available templates when being launched. In order to enforce a synchronization of the templates, click on the Cawemo logo in the upper right corner and save the configuration dialog again. You will see a notification about the templates that have been synched.

In order to trigger the UiPath package from Camunda, create a new BPMN process as follows:

* Create new BPMN process diagram
* Append a new Task to the Start Event and turn it into a Service Task (remember to use the Wrench icon next to the task for changing its type)

Use templates:

* Click on "Catalog" in the Property Panel and you will see an overlay with a list of your templates
* Select one template and click Apply. With the template being applied, you see a simplified Property Panel
* For any Input Parameter:
  * Define the value that should be passed to UiPath
  * Variable Assignment Value can be a String constant or a process variable that is passed via an Expression
* For any Output Parameter:
  * Define the name of a process variable that this output value should be assigned to

Enhance your process diagram:

* Complete your BPMN process diagram with further elements as you see fit (e.g. User Tasks)
* Finish the diagram with an End Event

Execute the process:

* Click the Run icon in the toolbar ("Start Current Diagram") and confirm the dialogs. This will deploy the process diagram and trigger a new process instance
* In the success notification click on "Open in Camunda Cockpit". You will see the running process instance with its current state

With the process instance running, you may observe in UiPath Orchestrator the new Job that was added by the RPA Bridge and the UiPath Robot executing the previously defined package.

In case of an error with the UiPath Robot, you will see a new incident for the process instance in Camunda Cockpit. You may retry to execute the Service Task and trigger UiPath again to resolve the incident.
