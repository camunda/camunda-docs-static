---

title: 'Requirements'
weight: 10

menu:
  main:
    name: "Requirements"
    parent: "rpa"
    identifier: "rpa-requirements"
    pre: "Learn about the necessary preconditions to start with RPA Orchestration."

---

Several components are involved in setting up proper RPA Orchestration in this guide. 
Therefore, a couple of requirements should be fulfilled before starting with this guide. 
You can also jump ahead to the [Installation & Configuration](../installation) if you are familiar
with the requirements already.

# Knowledge Requirements

In order to succeed with this getting started guide, we expect that you already know

* how to create and trigger robots with your RPA vendor (UiPath or AutomationAnywhere)
* how to model and execute BPMN process diagrams with the Camunda stack
* how to work with process variables as part of JUEL expressions

In case you never executed a process model with the Camunda engine, then we recommend to start with the [Quick Start Guide](../../quick-start) first.

# Hardware Requirements

Since this guide asks you to install and use several components, we recommend to use a system with sufficient resources to be able to run everything in parallel. Alternatively, we encourage you to use the hosted SaaS options where available.

## UiPath
UiPath only works with Microsoft Windows. If you don't have a dedicated Windows environment, we recommend to use a Windows virtual machine, e.g. using [Virtualbox](https://www.virtualbox.org/).

You can consult UiPath' [Orchestrator Requirements](https://docs.uipath.com/installation-and-upgrade/docs/orchestrator-hardware-requirements) for further details.

## Automation Anywhere

Automation Anywhere components can be set up on a variety of environments, please consult the [On-Premises Installation Guide](https://docs.automationanywhere.com/bundle/enterprise-v2019/page/enterprise-cloud/topics/deployment-planning/on-prem-install/cloud-on-prem-install.html).