---

title: '2) Installation & Configuration'
weight: 20

menu:
  main:
    name: "2) Installation & Configuration"
    parent: "rpa"
    identifier: "rpa-installation"
    pre: ""

---

<a href="/get-started/rpa/orchestrating-bots" style="float:right;">3) Orchestrating RPA Bots --&gt;</a>

[&lt;-- 1) Requirements](/get-started/rpa/requirements)

<div style="clear:both;"></div>

## RPA Bot Configuration

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

### Automation Anywhere

TODO: describe where users get Bridge config params from automation anywhere

## Camunda Platform Run

Unless you already have a running Camunda Platform 7.14 or later installation, please

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

Learn more about <a target="_blank" href="https://docs.camunda.org/manual/latest/installation/">installing Camunda Platform</a>.

## RPA Bridge

In order to install the RPA Bridge, please:

* <a href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.0/1.0.0/camunda-bpm-rpa-bridge-1.0.0.zip">Download the RPA Bridge</a>
* Unzip the archive
* Add your Enterprise license key into a file called `license.txt` in the same folder as the `application.yml` file
* When using UiPath Cloud, edit in the config file `application.yml`:
  * `license-file`: remove the comment character such that the value is `file:///${user.dir}/license.txt`
  * `uipath-api.url`: set to `https://platform.uipath.com/`
  * `account-name`: the Account Logical Name from the API Access overlay
  * `tenant-name`: the Tenant Logical Name from the API Access overlay
  * `organization-unit-id`: see above how to <a href="#uipath">retrieve your organization unit id</a>
  * `auth-url`: switch to `https://account.uipath.com/oauth/token`
  * `user`: the Client Id from the API Access overlay
  * `key`: the User Key from the API Access overlay
  * `status-update-method`: set to `polling`
  * `webhook`: add `#` to the beginning of each line with a webhook config property to ignore the line
* When using UiPath On-Premises, please follow the instructions in the config file
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

## Cawemo Catalog

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

## Camunda Modeler

Please use the Camunda Modeler version 4.3 or later. In case you don't have it yet, you can <a href="https://camunda.com/download/modeler/">download the latest version of Camunda Modeler</a>.

* Download version 3.0 or later of the <a href="https://downloads.camunda.cloud/enterprise-release/cawemo/cloud-connect-modeler-plugin/cloud-connect-3.0.0.zip">Cloud Connect plugin</a> for Camunda Modeler
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
