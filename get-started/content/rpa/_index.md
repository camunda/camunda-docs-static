---

title: 'RPA Orchestration'
weight: 5

menu:
  main:
    name: "RPA Orchestration"
    identifier: "rpa"
    pre: ""

---
{{< note title="Camunda discontinues the maintenance of the Camunda RPA bridge." class="warning" >}}
Camunda Automation Platform 7.19 is the last release maintaining compatibility with the Camunda RPA bridge. Camunda Automation Platform 7.19 and Camunda RPA bridge will be maintained for another 18 months until Oct 2024.

The Camunda RPA Bridge is replaced by RPA [Out-of-the-box Connectors](https://docs.camunda.io/docs/components/connectors/out-of-the-box-connectors/available-connectors-overview/) in Camunda 8.
{{< /note >}}

{{< note title="Enterprise only! RPA Orchestration requires a valid Enterprise license." class="warning" >}}
You can obtain an [Enterprise Trial License](https://camunda.com/download/enterprise/) for testing the RPA Bridge and Cawemo on-premises.
{{< /note >}}

Robotic Process Automation (RPA) orchestration is a use case that leverages capabilities from multiple Camunda product modules. It allows for the orchestration of tasks that are automated using RPA technology and (un)attended bots. Currently, Camunda Platform actively supports UiPath and Automation Anywhere but more RPA vendors will be supported in future versions.

## Architecture Overview

{{< img src="img/RPA-Orchestration-Architecture.svg" title="RPA Orchestration Architecture" >}}
