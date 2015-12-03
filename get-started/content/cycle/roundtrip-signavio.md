---
title: 'BPMN 2.0 Roundtrip with Camunda Cycle and Signavio'
weight: 20

menu:
  main:
    name: "Roundtrip Signavio"
    parent: get-started-cycle
    identifier: "get-started-cycle-roundtrip-signavio"
    pre: "Create a Roundtrip with Camunda Cycle and Signavio."
---

Now you are ready to create a roundtrip with Camunda Cycle and Signavio.


# Creating a Roundtrip

{{< img src="../img/create.png" >}}

In the left box "My Roundtrips", hit "Create" to create a new Roundtrip. Pick a name and hit "OK". In our example, we assume that a new Roundtrip named "invoice" has been created.

We will now add a process model from our BPMN modeler to the roundtrip and create the process model we want to execute out of it. Currently, the roundtrip works best with the Signavio Process Editor, so this is why we describe it in the next section. Further below you can find a general description for other BPMN tools.


# Roundtrip with Signavio

{{< img src="../img/signavio.png" >}}

Signavio is a web based modeler for BPMN 2.0 processes.

## Forward: From Signavio to Camunda Modeler

### Step 1: Set up Signavio Connector

{{< img src="../img/signavio-connector.png" >}}

To access your process models stored in Signavio you must set up a Signavio Connector.

In our example we use Signavio's SaaS edition and provide the credentials globally, meaning that every Cycle user will use the same credentials when using this connector. If you are behind a proxy, you could configure that here as well.

Hit "Test" to check if Cycle can access your Signavio account.

### Step 2: Add Process Model from Signavio

{{< img src="../img/signavio-choose-model.png" >}}

In the left box of your roundtrip click on "Add process Model", pick a name and choose "Signavio SaaS" from the connectors dropdown menu. Cycle now connects with Signavio, so after a short time you can navigate through the tree to select your process model.

After you hit "Add", Cycle will save a link to the process model you selected and offers you a preview image in the left box of your roundtrip. It also says that the process model has not been synchronized yet, which is true.

### Step 3: Create BPMN File for Execution

{{< img src="../img/cycle-create-executable.png" >}}

Hit "Create" and choose the location you want the BPMN 2.0 XML File to be stored to. In our example, we want to store it on our local file system, in a workspace we use with our Eclipse IDE. After hitting "Create", Cycle will connect to Signavio, request the BPMN 2.0 XML and save it to the location you specified.

**Heads up!** If your process model is a collaboration diagram, Cycle will check which pools are flagged as "executable". Only those pools will actually be regarded for the executable process model, so you don't have to bother with huge diagrams describing manual flows while you are only really interested in the technical flows that will be executed by the process engine. We call this feature "Pool Extraction".

### Step 4: Edit BPMN File

{{< img src="../img/signavio-created.png" >}}

Cycle now shows you that your roundtrip consists of the BPMN diagram stored in Signavio (left side) and the BPMN 2.0 File stored in your file repository (right side). You can also see that the two process models are currently in sync, and the date and time since the last sync has been made.

You can now either check out the BPMN 2.0 - XML from your Subversion or open it directly in your local drive. In both cases, you can now edit it inside your Eclipse IDE by using the [Camunda Modeler](https://camunda.org/bpmn/tool/).

## Reverse: From Camunda Modeler to Signavio

### Step 1: Deciding to Sync back in Signavio

{{< img src="../img/cycle-edited.png" >}}

Assuming that you have edited the BPMN 2.0 XML with the [Camunda Modeler](/manual/latest/installation/eclipse-plugin/), e.g. because you enriched it with execution attributes, added objects or removed some, you should bring those changes back into Signavio: First, your Business Analyst probably wants to know about the changes and approve them, and second, if you want to change the BPMN diagram in Signavio, you should synchronize it with the file you have changed in the Camunda Modeler first, so that the next forward engineering sync from Signavio to the Camunda Modeler does not overwrite all the changes you have made.

When you have Edited the BPMN 2.0 XML with the Camunda Modeler, Cycle will you tell you that the two process models are not in sync any more.

### Step 2: Sync back

{{< img src="../img/cycle-synchback.png" >}}

Click on the lower "Sync"-Button to actually re-import the BPMN 2.0 XML you have edited into Signavio. As Signavio supports versioning, this will lead to a new version of the BPMN diagram that is stored there. You can also edit the commit message that Cycle will write when pushing that new version into Signavio.

**Heads up!** If the BPMN diagram in Signavio is a collaboration diagram (i.e. if it consists of multiple pools), Cycle will only overwrite the executable process engine pool.

### Step 3: Compare Revisions

{{< img src="../img/signavio-revision.png" >}}

You can use the "compare revisions"-Feature in Signavio the check the changes.
