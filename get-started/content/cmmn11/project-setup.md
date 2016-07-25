---

title: 'Setup a Java Project for CMMN 1.1'
weight: 20

menu:
  main:
    name: "Project Setup"
    parent: "get-started-cmmn"
    identifier: "get-started-cmmn-setup"
    pre: "Set up an Apache Maven-based process application inside Eclipse and deploy it."

---

Now you are ready to set up your first process application project in Eclipse.

{{< note title="Terminology - Process vs. Case" class="info" >}}
CMMN is a modeling language for *cases*, whereas BPMN is a language for *processes*. This tutorial is about cases. However, due to Camunda's BPMN-focused heritage, the Java project contains classes and files with names like `ProcessApplication` and `processes.xml`. These are in fact generally applicable and can be used with both processes as well as cases.
{{< /note >}}


# Create a new Maven Project in Eclipse

In Eclipse, go to `File / New / Other ...`. This opens the *New Project Wizard*. In the *New Project Wizard* select `Maven / Maven Project`. Click Next.

{{< img src="../img/eclipse-new-project.png" >}}

On the first page of the *New Maven Project Wizard* select "*Create a simple project (skip archetype selection)*". Click Next.

On the second page (see screenshot), configure the Maven coordinates for the project.

Since we are setting up a WAR Project, make sure to select `Packaging: war`.

When you are done, click Finish. Eclipse sets up a new Maven project. The project appears in the *Project Explorer* view.


# Camunda Maven Dependencies

The next step consists of setting up the Maven dependencies for your new process application. Add the following dependencies to the `pom.xml` file of your project:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>org.camunda.bpm.getstarted</groupId>
  <artifactId>loan-approval-cmmn</artifactId>
  <version>0.1.0-SNAPSHOT</version>
  <packaging>war</packaging>

  <dependencyManagement>
    <dependencies>
      <dependency>
        <groupId>org.camunda.bpm</groupId>
        <artifactId>camunda-bom</artifactId>
        <version>7.5.0</version>
        <scope>import</scope>
        <type>pom</type>
      </dependency>
    </dependencies>
  </dependencyManagement>

  <dependencies>
    <dependency>
      <groupId>org.camunda.bpm</groupId>
      <artifactId>camunda-engine</artifactId>
      <scope>provided</scope>
    </dependency>

    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>3.0.1</version>
      <scope>provided</scope>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-war-plugin</artifactId>
        <version>2.3</version>
        <configuration>
          <failOnMissingWebXml>false</failOnMissingWebXml>
        </configuration>
      </plugin>
    </plugins>
  </build>

</project>
```

Now you can perform the first build. Select the `pom.xml` in the Package Explorer, perform a right-click and select `Run As / Maven Install`

{{< get-tag repo="camunda-get-started-cmmn" tag="Step-1" >}}


# The Process Application Class

Next, you need to create a package, e.g., `org.camunda.bpm.getstarted.cmmn.loanapproval`, and add a Process Application class to it. The Process Application class constitutes the interface between your application and the process engine.

```java
package org.camunda.bpm.getstarted.cmmn.loanapproval;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;

@ProcessApplication("Loan Approval App CMMN")
public class LoanApprovalApplication extends ServletProcessApplication {
  // empty implementation
}
```


# The Deployment Descriptor

The last step to set up the process application is to add the `META-INF/processes.xml` deployment descriptor file. This file allows us to provide a declarative configuration of the deployment(s) this process application makes to the process engine.

This file needs to be added to the `src/main/resources/META-INF` folder of the Maven project.

```xml
<?xml version="1.0" encoding="UTF-8" ?>

<process-application
    xmlns="http://www.camunda.org/schema/1.0/ProcessApplication"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">

  <process-archive name="loan-approval-cmmn">
    <process-engine>default</process-engine>
    <properties>
      <property name="isDeleteUponUndeploy">false</property>
      <property name="isScanForProcessDefinitions">true</property>
    </properties>
  </process-archive>

</process-application>
```

At this point you have successfully set up the process application and you can start creating your first CMMN case.

{{< get-tag repo="camunda-get-started-cmmn" tag="Step-2" >}}
