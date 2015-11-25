---

title: 'Setup a Spring Web Application Project'
weight: 10

menu:
  main:
    name: "Project Setup"
    parent: "get-started-spring"
    identifier: "get-started-spring-project-setup"
    pre: "Setup Spring web application as an Apache Maven Project inside eclipse."

---

Now you are ready to set up your first process application project in eclipse.


# Set Up a Java Project

We will start by setting up a Spring web application as an Apache Maven Project inside eclipse. This consists of four steps:

1. Create a new Maven Project in Eclipse
2. Add the Camunda & Spring framework dependencies
3. Add the web.xml file for bootstrapping the Spring container
4. Add a Spring application context XML configuration file

In the following sections, we go through this process step by step.

## Create a new Maven Project in Eclipse

First, we set up a new Apache Maven based project in eclipse. Let's call it *loanapproval-spring*. The screenshot to the left illustrates the settings we choose. As we are deploying a web application, make sure to select `Packaging: war`.

{{< img src="../img/eclipse-new-project.png" >}}

{{< note title="Hint" class="info" >}}
If you are unfamiliar with setting up a Maven project, read the [Set up your Project]({{< relref "bpmn20/project-setup.md" >}}) section of the BPMN 2.0 tutorial.
{{< /note >}}

When you are done, click Finish. Eclipse sets up a new Maven project. The project appears in the *Project Explorer* view.

## Add Camunda BPM & Spring Framework Dependencies

The next step consists of setting up the Maven dependencies for the new project. Maven dependencies need to be added to the `pom.xml` file of the project. We add both the Camunda BPM and the Spring Framework dependencies:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>org.camunda.bpm.getstarted</groupId>
  <artifactId>loanapproval-spring</artifactId>
  <version>0.1.0-SNAPSHOT</version>
  <packaging>war</packaging>

  <properties>
    <camunda.version>7.4.0</camunda.version>
    <spring.version>3.1.2.RELEASE</spring.version>
  </properties>

  <!-- import Camunda BOM to ensure correct versions of Camunda projects -->
  <dependencyManagement>
    <dependencies>
      <dependency>
        <groupId>org.camunda.bpm</groupId>
        <artifactId>camunda-bom</artifactId>
        <version>${camunda.version}</version>
        <scope>import</scope>
        <type>pom</type>
      </dependency>
    </dependencies>
  </dependencyManagement>

  <dependencies>
    <dependency>
      <groupId>org.camunda.bpm</groupId>
      <artifactId>camunda-engine</artifactId>
    </dependency>
    <dependency>
      <groupId>org.camunda.bpm</groupId>
      <artifactId>camunda-engine-spring</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-web</artifactId>
      <version>${spring.version}</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-jdbc</artifactId>
      <version>${spring.version}</version>
    </dependency>
    <dependency>
      <groupId>com.h2database</groupId>
      <artifactId>h2</artifactId>
      <version>1.3.171</version>
    </dependency>
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-jdk14</artifactId>
      <version>1.7.13</version>
    </dependency>
  </dependencies>

</project>
```

## Add web.xml File for Bootstrapping the Spring Container

Next, we add a `web.xml` file for bootstrapping the spring container. In order to do so, first add a folder named `WEB-INF` to the (preexisting) `src/main/webapp` folder of your Maven project. Inside this folder, add a file named `web.xml`:

```xml
<web-app xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee
                    http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd" version="3.0">

  <context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/applicationContext.xml</param-value>
  </context-param>

  <listener>
    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
  </listener>

</web-app>
```

Now you can perform the first build. Select the `pom.xml` in the Package Explorer, perform a right-click and select `Run As / Maven Install`

## Add a Spring Application Context XML Configuration File

Next, we add a Spring ApplicationContext XML file to the same `src/main/webapp/WEB-INF` folder. The file must be named `applicationContext.xml`. We start with an empty file:

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                         http://www.springframework.org/schema/beans/spring-beans.xsd">
</beans>
```

Congratulations, you have completed the project setup. Your project should now look as depicted in the screenshot to the left.

{{< img src="../img/project-layout-after-setup.png" >}}

You can now perform a full Maven build and deploy the project to a vanilla Apache Tomcat server. You should see the following log output:

<pre class="console">
INFO org.apache.catalina.startup.HostConfig.deployWAR
Deploying web application archive ..\webapps\loanapproval-spring-0.1.0-SNAPSHOT.war
INFOorg.springframework.web.context.ContextLoader.initWebApplicationContext
Root WebApplicationContext: initialization started
INFO org.springframework.context.support.AbstractApplicationContext.prepareRefresh
Refreshing Root WebApplicationContext: startup date [DATE]; root of context hierarchy
INFO org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions
Loading XML bean definitions from ServletContext resource [/WEB-INF/applicationContext.xml]
INFO org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons
Pre-instantiating singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@19930f2a: defining beans []; root of factory hierarchy
INFO org.springframework.web.context.ContextLoader.initWebApplicationContext
Root WebApplicationContext: initialization completed in 247 ms
INFO org.apache.catalina.startup.HostConfig.deployWAR
Deployment of web application archive ..\webapps\loanapproval-spring-0.1.0-SNAPSHOT.war has finished in 1,740 ms
</pre>

This means that you have set up your Spring web application correctly.

{{< get-tag repo="camunda-get-started-spring" tag="Step-1" >}}
