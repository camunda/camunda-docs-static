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

Be entitled to use Camunda Enterprise

## Installation and Configuration

### UiPath

Read config params

### Camunda BPM

Install and run the platform (using Camunda Run?)

### RPA Bridge

{{< note title="Please note: the RPA Bridge requires a valid Enterprise license." class="info" >}}
You can obtain an <a href="https://camunda.com/download/enterprise/">Enterprise Trial license</a> for testing both the RPA Bridge and Cawemo on-premises.
{{< /note >}}

Install, configure, and run the bridge

### Cawemo Catalog

{{< note title="Please note: the Catalog requires a valid Enterprise license." class="info" >}}
You can obtain an <a href="https://camunda.com/download/enterprise/">Enterprise Trial license</a> for testing both the RPA Bridge and Cawemo on-premises.

If you prefer to use cawemo.com, please <a href="https://cawemo.com/signup">sign up</a> and ask for a trial license via the "Provide feedback" form.
{{< /note >}}

Sign up and get Enterprise license enabled

### Camunda Modeler

Install "Cloud Connect" plugin and configure Cawemo credentials

## Usage

### Creating and deploying a UiPath package

Create a script with IN and OUT arguments, and register this as a package in UiPath Orchestrator

### Adding a template to the Catalog

Create a Catalog project and a UiPath template that matches with the UiPath package

### Modeling and executing a process

Fetch latest templates and model a process using the template. Configure input and output variables

Deploy and run the process
