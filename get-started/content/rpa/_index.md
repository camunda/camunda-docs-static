---

title: 'RPA Orchestration'
weight: 2

menu:
  main:
    name: "RPA Orchestration"
    identifier: "rpa"
    pre: ""

---

{{< note title="Enterprise only! RPA Orchestration requires a valid Enterprise license." class="warning" >}}
You can obtain an <a href="https://camunda.com/download/enterprise/">Enterprise Trial license</a> for testing the RPA Bridge and Cawemo on-premises.
{{< /note >}}

Robotic Process Automation (RPA) orchestration is a use case that leverages capabilities from multiple Camunda product modules. It allows for the orchestration of tasks that are automated using RPA technology and unattended bots. To start, Camunda BPM actively supports UiPath but more RPA vendors will be supported in future versions.

## Requirements

### Knowledge Requirements

In order to succeed with this getting started guide, we expect that you already know

* how to run UiPath robots and trigger them from the UiPath Orchestrator
* how to model and execute BPMN process diagrams with the Camunda stack
* how to work with process variables as part of JUEL expressions

In case you never executed a process model with the Camunda engine, then we recommend to start with the <a href="https://docs.camunda.org/get-started/quick-start/">Quick Start Guide</a> first.

### Hardware Requirements

UiPath only works with Microsoft Windows. If you don't have a dedicated Windows environment, we recommend to use a Windows virtual machine, e.g. using <a href="https://www.virtualbox.org/">Virtualbox</a>.

Since this guide asks you to install and use several components, we recommend to have a computer with sufficient resources to be able to run everything in parallel. Alternatively, we encourage you to use the hosted SaaS options where available.

## Installation and Configuration

### UiPath

The Camunda RPA Orchestration works with the UiPath Orchestrator in either the <a target="_blank" href="https://cloud.uipath.com">Cloud</a> or On-Premises (v2019 or v2020.4). For testing purposes we recommend to use the cloud version.

In order to prepare the setup of the RPA Bridge, please

* Open the ‘Admin’ view of the UiPath Orchestrator Portal
* Open the ‘API Access’ overlay for your tenant
* Copy the values for
  * User Key
  * Account Logical Name
  * Tenant Logical Name
  * Client Id

The API of UiPath Orchestrator requires a parameter called ‘organization unit id’ that you can obtain as follows:

* Open your organization's dashboard (this does not work for the ‘Admin’ view)
* Open your browser's developer tools
* Open the network tab and select a request, e.g. `GetCountStats` XHR request
* Navigate to the Request Header section of that request
* Read the request header `x-uipath-organizationunitid`, which contains the id as a number

Learn more about <a target="_blank" href="https://docs.uipath.com/orchestrator">UiPath Orchestrator</a> or visit the <a target="_blank" href="https://forum.uipath.com/">UiPath Forum</a>.

### Camunda BPM Run

Unless you already have a running Camunda BPM 7.14 or later installation, please

* <a href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/run/7.14/7.14.0/camunda-bpm-run-ee-7.14.0-ee.zip">Download Camunda Run (Enterprise)</a>

You will be asked for a username and password that you have obtained together with your Enterprise license key.

Once you have downloaded Camunda Run, please

* Unzip the archive
* Launch the platform by executing

```sh
# Windows
start.bat

# Mac OS or Linux
./start.sh
```

Learn more about <a target="_blank" href="https://docs.camunda.org/manual/latest/installation/">installing Camunda BPM</a>.

### RPA Bridge

In order to install the RPA Bridge, please:

* <a href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.0.0/camunda-bpm-rpa-bridge-1.0.0.zip">Download the RPA Bridge</a>
* Unzip the archive
* Add your Enterprise license key into a file called `license.txt` in the same folder as the `application.yml` file
* When using UiPath Cloud, edit in the config file `application.yml`:
  * `license-file`: remove the comment character such that the value is `file:///${user.dir}/license.txt`
  * `url`: set to `https://platform.uipath.com/`
  * `account-name`: the Account Logical Name from the API Access overlay
  * `tenant-name`: the Tenant Logical Name from the API Access overlay
  * `organization-unit-id`: see above how to <a href="#uipath">retrieve your organization unit id</a>
  * `auth-url`: switch to `https://account.uipath.com/oauth/token`
  * `user`: the Client Id from the API Access overlay
  * `key`: the User Key from the API Access overlay
  * `status-update-method`: set to `polling`
  * `webhook`: add `#` to the beginning of each line with a webhook config property to ignore the line
* When using UiPath On-Premises, please follow the instructions in the config file `application.yml`
* We recommend to enable simple logging by adding this as the last line to `application.yml`:
  * `logging.level.org.camunda.bpm.rpa.bridge.externaltask: DEBUG`
* Launch the RPA Bridge by

```sh
java -jar camunda-bpm-rpa-bridge.jar
```

You should see a log message like `External Task Listener started ----`

For trouble shooting, you can switch to extensive logging by adding this as the last line to `application.yml`:

* `logging.level.org.camunda.bpm.rpa.bridge: DEBUG`


Learn more about <a target="_blank" href="https://docs.camunda.org/manual/latest/user-guide/camunda-bpm-rpa-bridge/">configuring the RPA Bridge</a>.

### Cawemo Catalog

{{< note title="Please note: you have the choice of Cawemo SaaS or On-Premises." class="info" >}}
For testing we recommend the use of Cawemo SaaS. Please <a href="https://cawemo.com/signup">sign up</a> and ask for a trial license via the "Provide feedback" form to get started.
{{< /note >}}

When you are using Cawemo SaaS, please open the <a href="https://cawemo.com/settings/">settings page</a> and verify in the "Details" section that your Enterprise license is active.

In order to use Cawemo On-Premises (version 1.4 or later), please follow this <a href="https://docs.camunda.org/cawemo/latest/technical-guide/installation/">on-premises installation guide</a>.

When being logged in to Cawemo:

* Open the settings page
* Create an API Key with a name "RPA Orchestration"
* Save the key hash for later use in the Camunda Modeler
* Open the "User ID / Organization ID" panel to retrieve your User ID (which is not your email address)

### Camunda Modeler

Please use the Camunda Modeler version 4.3 or later. In case you don't have it yet, you can <a href="https://camunda.com/download/modeler/">download the latest version of Camunda Modeler</a>.

* Download version 2.0 or later of the <a href="https://downloads.camunda.cloud/enterprise-release/cawemo/cloud-connect-modeler-plugin/cloud-connect-2.0.0.zip">Cloud Connect plugin</a> for Camunda Modeler
* Extract the archive and move it to the plugins folder

```sh
# Windows
%APPDATA%\camunda-modeler\plugins

# Mac OS
~/Library/Application Support/camunda-modeler/plugins

# Linux
~/.config/camunda-modeler/plugins
```

* Restart the Modeler and verify that the Plugins menu contains an entry "Cloud Connect"
* Open the configuration of the Cloud Connect plugin via the menu
* Add the following settings
  * User ID: from the Cawemo settings page
  * API Key: from the Cawemo settings page
  * Sync Catalog Projects: set to `enabled`
* Save the configuration dialog

In the upper right corner of the Modeler window you should see "Connected to Cawemo", indicating a successful connection.

Learn more about <a target="_blank" href="https://docs.camunda.org/cawemo/latest/technical-guide/integrations/modeler/">connecting Camunda Modeler with Cawemo</a>.

## Usage

### Creating and deploying a UiPath package

In order to orchestrate your RPA bots and the tasks that they automate, you need to create a UiPath package that contains the scripts that the RPA bots should execute. In UiPath these scripts are called "Process".

The data that these scripts need as input should be configured as IN arguments in UiPath Studio. The RPA Bridge will then pass the Camunda task input parameters via the UiPath Orchestrator into the UiPath Robot. In a similar way will the OUT arguments of UiPath be returned back into the Camunda engine as task output parameters. The names of these IN and OUT arguments will be used in the Cawemo Catalog.

Once the UiPath script works as expected, it needs to be deployed into the UiPath Orchestrator as a new package. The name of this package will be used in the Cawemo Catalog.

Please make sure that the UiPath Orchestrator can successfully trigger a UiPath Robot to execute the given package.

In case you have trouble setting up and running your UiPath scripts via the UiPath Orchestrator please refer to the <a target="_blank" href="https://docs.uipath.com/">UiPath documentation</a>.

### Adding a template to the Catalog

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

### Modeling and executing a process

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
