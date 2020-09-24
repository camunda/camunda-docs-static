---

title: 'RPA Orchestration'
weight: 2

menu:
  main:
    name: "RPA Orchestration"
    identifier: "rpa"
    pre: ""

---

Robotic Process Automation (RPA) orchestration is a use case that leverages capabilities from multiple Camunda product modules. It allows for the orchestration of tasks that are automated using RPA technology and unattended bots. To start, Camunda BPM actively supports UiPath but more RPA vendors will be supported in future versions.

## Requirements

Running UiPath including Orchestrator, Studio, and Bots

General understanding of how to execute processes with Camunda

{{< note title="Please note: RPA Orchestration requires a valid Enterprise license." class="info" >}}
You can obtain an <a href="https://camunda.com/download/enterprise/">Enterprise Trial license</a> for testing the RPA Bridge and Cawemo on-premises.
{{< /note >}}

## Installation and Configuration

### UiPath

The Camunda RPA Orchestration works with the UiPath Orchestrator in either the <a href="https://cloud.uipath.com">Cloud</a> or On-Premises (v2019 or v2020.4). For testing purposes we recommend to use the cloud version.

In order to prepare the setup of the RPA Bridge, please

* Open the ‘Admin’ view of the UiPath Orchestrator Portal
* Open the ‘API Access’ overlay for your tenant
* Copy the values for
  * User Key
  * Account Logical Name
  * Tenant Logical Name
  * Client Id


### Camunda BPM Run

Unless you already have a running Camunda BPM installation, please

* <a href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/run/">Download Camunda Run (Enterprise)</a>

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

### RPA Bridge

In order to install the RPA Bridge, please:

* <a href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/camunda-bpm-rpa-bridge">Download the RPA Bridge</a>
* Unzip the archive
* Add your Enterprise license key into a file called `camunda-license.txt` in the same folder as the  `application.yml` file
* When using UiPath Cloud, edit in the config file `application.yml`:
  * account-name: the Account Logical Name from the API Access overlay
  * tenant-name: the Tenant Logical Name from the API Access overlay
  * user: the Client Id from the API Access overlay
  * key: the User Key from the API Access overlay
* When using UiPath On-Premises, edit in the config file `application.yml`:
  * TODO
* Launch the RPA Bridge by

```sh
java -jar camunda-bpm-rpa-bridge.jar
```

You should see a log message like `External Task Listener started ----`

### Cawemo Catalog

{{< note title="Please note: you have the choice of Cawemo SaaS or On-Premises." class="info" >}}
For testing we recommend the use of Cawemo SaaS. Please <a href="https://cawemo.com/signup">sign up</a> and ask for a trial license via the "Provide feedback" form to get started.
{{< /note >}}

When you are using Cawemo SaaS, please open the <a href="https://cawemo.com/settings/">settings page</a> and verify in the "Details" section that your Enterprise license is active.

In order to use Cawemo On-Premises, please follow this <a href="https://docs.camunda.org/cawemo/latest/technical-guide/installation/">on-premises installation guide</a>.

When being logged in to Cawemo:

* Open the settings page
* Create an API Key with a name "RPA Orchestration"
* Save the key hash for later use in the Camunda Modeler
* Open the "User ID / Organization ID" panel to retrieve your User ID (which is not your email address)

### Camunda Modeler

Please use the Camunda Modeler version 4.3 or later. In case you don't have it yet, you can <a href="https://camunda.com/download/modeler/">download the latest version of Camunda Modeler</a>.

* Download the latest version of the <a href="https://camunda.org/enterprise-release/cawemo/cloud-connect-modeler-plugin/">Cloud Connect plugin</a> for Camunda Modeler
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

## Usage

### Creating and deploying a UiPath package

Create a script with IN and OUT arguments, and register this as a package in UiPath Orchestrator

### Adding a template to the Catalog

Create a Catalog project and a UiPath template that matches with the UiPath package

### Modeling and executing a process

Fetch latest templates and model a process using the template. Configure input and output variables

Deploy and run the process
