---

title: 'Setup a Spring Boot Project'
weight: 10

menu:
  main:
    name: "Project Setup"
    parent: "get-started-spring-boot"
    identifier: "get-started-spring-boot-project-setup"
    pre: "Set up Spring Boot application as an Apache Maven Project inside Eclipse."

---

Now you are ready to set up your first process application project in Eclipse.

# Set Up a Java Project

We will start by setting up a Spring Boot application as an Apache Maven Project inside Eclipse. This consists of three steps:

1. Create a new Maven Project in Eclipse
2. Add the Camunda & Spring Boot dependencies
3. Add main class as an entry point for launching Spring Boot application.

In the following sections, we go through this process step by step.

## Create a new Maven Project in Eclipse

First, we set up a new Apache Maven based project in Eclipse. Let's call it *loan-approval-spring-boot*. The screenshot below illustrates the settings we choose.

{{< img src="../img/eclipse-new-project.png" >}}

{{< note title="Hint" class="info" >}}
If you are unfamiliar with setting up a Maven project, read the [Set up your Project]({{< relref "bpmn20/project-setup.md" >}}) section of the BPMN 2.0 tutorial.
{{< /note >}}

When you are done, click Finish. Eclipse sets up a new Maven project. The project appears in the *Project Explorer* view.

## Add Camunda BPM & Spring Boot Dependencies

The next step consists of setting up the Maven dependencies for the new project. Maven dependencies need to be added to the `pom.xml` file of the project. 
We add Spring Boot BOM in "dependency management" section and Camunda Spring Boot Starter for Webapps, which will automatically include Camunda engine and webapps in the app.
We also use `spring-boot-maven-plugin`, which does all the magic for packaging Spring Boot application content together.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>org.camunda.bpm.getstarted</groupId>
  <artifactId>loan-approval-spring-boot</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  
  <dependencyManagement>
    <dependencies>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-dependencies</artifactId>
        <version>1.5.7.RELEASE</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
    </dependencies>
  </dependencyManagement>
  
  <dependencies>
    <dependency>
      <groupId>org.camunda.bpm.springboot</groupId>
      <artifactId>camunda-bpm-spring-boot-starter-webapp</artifactId>
      <version>2.3.0-alpha1</version>
    </dependency>
    <dependency>
      <groupId>com.h2database</groupId>
      <artifactId>h2</artifactId>
    </dependency>
  </dependencies>
  
   <build>
    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <configuration>
          <layout>ZIP</layout>
        </configuration>
        <executions>
          <execution>
            <goals>
              <goal>repackage</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
    </plugins>
  </build>
  
</project>
```

## Add main class to our Spring Boot application

Next, we add an application class with main method, that will be the entry point for launching Spring Boot application. The class has annotation `@SpringBootApplication` on it,
which implicitly adds several convenient features (autoconfiguration, component scan etc. - see Spring Boot docs).
The class is added in `src/main/java` folder in `org.camunda.bpm.getstarted.loanapproval` package.

```java
package org.camunda.bpm.getstarted.loanapproval;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebappExampleProcessApplication {
	public static void main(String... args) {
		SpringApplication.run(WebappExampleProcessApplication.class, args);
	}
}
```

## Build and run

Now you can perform the first build. Select the `pom.xml` in the Package Explorer, perform a right-click and select `Run As / Maven Install`.

Our first Camunda Spring Boot application is ready now. As a result of build you will have a JAR-file in your `target` folder. This JAR is a Spring Boot application, 
which embed inside Tomcat as a web container, Camunda engine and Camunda Web applications resources.
When started, it will use in-memory H2 database for Camunda Engine needs.

You can run the application by right-clicking on `WebappExampleProcessApplication` class and choosing `Run as / Java application`.
Wait till you see similar line in console:
```text
Started WebappExampleProcessApplication in 10.584 seconds
```
Then go to [http://localhost:8080/](http://localhost:8080/) in your browser and enjoy the Camunda webapps.

Another way to run the app is simply run the JAR-file with `java -jar` command.

{{< get-tag repo="camunda-get-started-spring-boot" tag="Step-1" >}}
