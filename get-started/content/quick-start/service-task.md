---

title: 'Executing automated steps'
weight: 20

menu:
  main:
    name: "Executable Process"
    parent: "get-started-quick-start"
    identifier: "get-started-quick-start-java-service-task"
    pre: "Learn the basics of handling the Camunda Modeler, learn how to model and configure a fully executable process and learn how to integrate your own business logic."

---

In this section you learn how to create your first BPMN 2.0 process with the Camunda Modeler and how to execute automated steps. Start up the Camunda Modeler now.

# Create a new BPMN Diagram

Create a new BPMN diagram by clicking *File > New File > BPMN Diagram*.

{{< img src="../img/modeler-new-bpmn-diagram.png" >}}


## Start with a Simple Process
Start by modeling a simple process.

{{< img src="../img/modeler-step1.png" >}}

Double-click on the Start Event. A text box opens. Type "Payment Retrieval Requested".

{{< note title="Hint" class="info" >}}
When editing Labels, you can add line breaks by hitting `Shift + Enter`.
{{< /note >}}

Click on the start event. From its context menu, select the activity shape (rectangle). It will be placed automatically on the canvas. Alternatively, you can also drag it to a good position. Name it *Charge Credit Card*. Change the activity type to *Service Task* by clicking on it and using the wrench button.

{{< img src="../img/modeler-step2.png" >}}

Add an End Event named *Payment Received*.

{{< img src="../img/modeler-step3.png" >}}


## Configure the Service Task

There are different ways of [executing service tasks](https://docs.camunda.org/manual/latest/user-guide/process-engine/external-tasks/) using Camunda BPM. In this guide we will make use of the external task pattern.
Open the Properties Panel within the Camunda Modeler and click on the Service Task you just created. Change the Implementation to `External` and use `charge-card` as the Topic.

{{< img src="../img/modeler-step4.png" >}}

## Configure Properties for Execution

{{< img src="../img/modeler-step5.png" >}}

Since we are modeling an executable process, we should give it an *ID* and set the `isExecutable` property to `true`. On the right hand side of the canvas, you find the properties panel. Click on a free spot of the modeling canvas. This displays the properties of the process itself.

First, configure an ID for the process. Type *payment-retrieval* in the property field *Id*. The property ID is used by the process engine as identifier for the executable process and it is best practice to set it to a human-readable name.

Second, configure the Name of the process. Type *Payment Retrieval* in the property field *Name*.

Finally, check the box of the *Executable* property. If you do not check this box, the process definition is ignored by the process engine.

## Save the BPMN Diagram

{{< img src="../img/modeler-save-diagram.png" >}}

When you are done, save your changes by clicking *File > Save File As..* or using the *Save Button*. In the dialogue that pops up, navigate to any folder and save the diagram as e.g. `payment.bpmn`.

{{< get-tag repo="camunda-get-started-language-agnostic" tag="Step-1" >}}

# Implement an external task worker

After modeling the process, we want to execute some business logic.

Camunda BPM is build in a way that your business logic can be implemented in different languages.
You have the choice which language suits your project best.

## a) Using Java

In this section you will learn how to implement an external task worker in Java.

### Prerequisites

Make sure you have the following set of tools installed:

* JDK 1.8
* Editor for Java projects (e.g. [Eclipse](https://eclipse.org/))

### Create a new Maven project

Start by creating a new maven project in your Editor. If you are using Eclipse you can follow the next steps:

In Eclipse, go to File / New / Other .... This opens the New Project Wizard. In the New Project Wizard select Maven / Maven Project. Click Next.

On the first page of the New Maven Project Wizard select Create a simple project (skip archetype selection). Click Next.

On the second page (see screenshot), configure the Maven coordinates for the project. Since we are setting up a JAR Project, make sure to select Packaging: jar.

{{< img src="../img/eclipse-new-project.png" >}}

When you are done, click Finish. Eclipse sets up a new Maven project. The project appears in the Project Explorer View.

### Add Camunda External Task Client Dependency

The next step consists of setting up the Maven dependency to the external task client for your new process application.
Your pom.xml file of your project should look like this:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>org.camunda.bpm.getstarted</groupId>
	<artifactId>charge-card-worker</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<dependencies>
		<dependency>
			<groupId>org.camunda.bpm</groupId>
			<artifactId>camunda-external-task-client</artifactId>
			<version>0.1.0-alpha1</version>
		</dependency>
	</dependencies>
</project>
```

### Add the Java class

Next, we will create a new ExternalTaskClient which subscribes to the `charge-card` topic.

When the process engine encounters a service task that is configured to be externally handled, it creates an external task instance on which our handler will react.
We are using [Long Polling](https://docs.camunda.org/manual/latest/user-guide/process-engine/external-tasks/#long-polling-to-fetch-and-lock-external-tasks) in the ExternalTaskClient to make the communication more efficient.

To do so, you need to create a package, e.g., *org.camunda.bpm.getstarted.chargecard* and add a Java class, e.g. *ChargeCardWorker*, to it.

```java
package org.camunda.bpm.getstarted.chargecard;

import java.util.logging.Logger;

import org.camunda.bpm.client.ExternalTaskClient;

public class ChargeCardWorker {
  private final static Logger LOGGER = Logger.getLogger(ChargeCardWorker.class.getName());

  public static void main(String[] args) {
    ExternalTaskClient client = ExternalTaskClient.create()
        .baseUrl("http://localhost:8080/engine-rest")
        .build();

    // subscribe to an external task topic as specified in the process
    client.subscribe("charge-card")
        .lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
        .handler((externalTask, externalTaskService) -> {
          // Put your business logic here

          // Get a process variable
          String item = (String) externalTask.getVariable("item");
          Integer amount = (Integer) externalTask.getVariable("amount");
          LOGGER.info("Charging credit card with an amount of '" + amount + "'€ for the item '" + item + "'...");

          // Complete the task
          externalTaskService.complete(externalTask);
        })
        .open();
  }
}
```

### Run the worker

You can run the Java application by right clicking on the class `ChargeCardWorker` and choose `Run as Java`.

{{< note title="Next Step" class="info" >}}
Once your worker is running, you can [continue to deploy your process and start some instances](/get-started/quick-start/deploy/).
{{< /note >}}

{{< get-tag rexepo="camunda-get-started-language-agnostic" tag="Step-2a" >}}

## b) Using NodeJS

In this section you will learn how to implement an external task worker in NodeJS.

### Prerequisites

Make sure you have the following set of tools installed:

* NodeJS >= v8.9.4
* Editor for JavaScript files (e.g. [Atom](https://atom.io/))

### Create a new NodeJS project

```sh
mkdir charge-card-worker
cd ./charge-card-worker
npm init charge-card-worker -y
```

### Add Camunda External Task Client JS library

```sh
npm install -s camunda-external-task-client-js
```

### Implement the NodeJS script

Next, we will create a new ExternalTaskClient which subscribes to the `charge-card` topic.

When the process engine encounters a service task that is configured to be externally handled, it creates an external task instance on which our handler will react.
We are using [Long Polling](https://docs.camunda.org/manual/latest/user-guide/process-engine/external-tasks/#long-polling-to-fetch-and-lock-external-tasks) in the ExternalTaskClient to make the communication more efficient.

To do so, you need to create a new JavaScript file, e.g. `worker.js`, that looks like this:

```javascript
const { Client, logger } = require('camunda-external-task-client-js');

// configuration for the Client:
//  - 'baseUrl': url to the Process Engine
//  - 'logger': utility to automatically log important events
const config = { baseUrl: 'http://localhost:8080/engine-rest', use: logger };

// create a Client instance with custom configuration
const client = new Client(config);

// susbscribe to the topic: 'charge-card'
client.subscribe('charge-card', async function({ task, taskService }) {
  // Put your business logic here

  // Get a process variable
  const amount = task.variables.get('amount');
  const item = task.variables.get('item');

  console.log(`Charging credit card with an amount of ${amount}€ for the item '${item}'...`);

  // Complete the task
  await taskService.complete(task);
});

```

### Run the NodeJS script

You can run the NodeJS script by using:

```sh
npm run ./worker.js
```
{{< note title="Next Step" class="info" >}}
Once your worker is running, you can [continue to deploy your process and start some instances](/get-started/quick-start/deploy/).
{{< /note >}}

{{< get-tag repo="camunda-get-started-language-agnostic" tag="Step-2b" >}}
