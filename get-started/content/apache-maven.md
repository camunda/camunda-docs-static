---

title: 'Apache Maven Coordinates'
weight: 13

menu:
  main:
    name: "Maven Coordinates"
    identifier: "get-started-maven"
    pre: "The most commonly used Apache Maven Coordinates for Camunda."

---

This page lists the most commonly used Apache Maven Coordinates for Camunda.

Most Camunda artifacts are pushed to [maven central](http://search.maven.org/#browse%7C-1675593179).


# Camunda BOM (Bill of Materials)

## Community Edition

```xml
<dependencyManagement>
  <dependency>
    <groupId>org.camunda.bpm</groupId>
    <artifactId>camunda-bom</artifactId>
    <version>7.10.0</version>
    <scope>import</scope>
    <type>pom</type>
  </dependency>
</dependencyManagement>
```

## Enterprise Edition

To use the Enterprise Edition dependencies, you have to add the [Enterprise Edition Maven Repository](#enterprise-edition-1) to your project.

```xml
<dependencyManagement>
  <dependency>
    <groupId>org.camunda.bpm</groupId>
    <artifactId>camunda-bom</artifactId>
    <version>7.10.0-ee</version>
    <scope>import</scope>
    <type>pom</type>
  </dependency>
</dependencyManagement>
```

{{< note title="Use the BOM!" class="info" >}}
  Please import the Camunda BOM if you use multiple Camunda projects. The BOM defines versions for all Camunda projects. This way it is ensured that no incompatible versions are imported.
{{< /note >}}


# Camunda Engine

```xml
<dependency>
  <groupId>org.camunda.bpm</groupId>
  <artifactId>camunda-engine</artifactId>
</dependency>
```


# Camunda Engine Spring Integration

```xml
<dependency>
  <groupId>org.camunda.bpm</groupId>
  <artifactId>camunda-engine-spring</artifactId>
</dependency>
```


# Camunda Engine CDI Integration

```xml
<dependency>
  <groupId>org.camunda.bpm</groupId>
  <artifactId>camunda-engine-cdi</artifactId>
</dependency>
```

# Camunda DMN Engine BOM (Bill of Materials)
This BOM allows to use the DMN engine standalone without the BPMN engine and the rest of the Camunda BPM platform.

```xml
<dependencyManagement>
  <dependency>
    <groupId>org.camunda.bpm.dmn</groupId>
    <artifactId>camunda-engine-dmn-bom</artifactId>
    <version>7.10.0</version>
    <type>pom</type>
    <scope>import</scope>
  </dependency>
</dependencyManagement>
```

# Camunda DMN
This dependency allows to use DMN engine standalone without the BPMN engine and the rest of the Camunda BPM platform.
It is not needed when using `camunda-engine` because that already contains the DMN engine.

```xml
<dependency>
  <groupId>org.camunda.bpm.dmn</groupId>
  <artifactId>camunda-engine-dmn</artifactId>
</dependency>
```

# Process Aplication EJB Client

```xml
<dependency>
  <groupId>org.camunda.bpm.javaee</groupId>
  <artifactId>camunda-ejb-client</artifactId>
</dependency>
```


# Camunda Nexus

## Community Edition

```xml
<repositories>
  <repository>
    <id>camunda-bpm-nexus</id>
    <name>camunda-bpm-nexus</name>
    <url>
      https://app.camunda.com/nexus/content/groups/public
    </url>
  </repository>
</repositories>
```

## Enterprise Edition

```xml
<repositories>
  <repository>
    <id>camunda-bpm-nexus-ee</id>
    <name>camunda-bpm-nexus</name>
    <url>
      https://app.camunda.com/nexus/content/repositories/camunda-bpm-ee
    </url>
  </repository>
</repositories>
```

Using the Enterprise Edition repository requires credentials in your Maven settings `~/.m2/settings.xml`:
```xml
  <servers>
    <server>
      <id>camunda-bpm-nexus-ee</id>
      <username>YOUR_USERNAME</username>
      <password>YOUR_PASSWORD</password>
    </server>
  </servers>
```
## Browse Camunda Nexus
In order to browse the Camunda Nexus artifacts, here are the links which can be used.

### Community Edition
This link helps you to browse the artifacts of Camunda bpm community edition.

 https://app.camunda.com/nexus/service/rest/repository/browse/camunda-bpm/

### Enterprise Edition
This link helps you to browse the artifacts of Camunda bpm enterprise edition. The user needs to login to the nexus repository before accessing the link.

 https://app.camunda.com/nexus/service/rest/repository/browse/camunda-bpm-ee/

{{< note title="Requires login" class="info" >}}
   Please note that the link will not be accessible if the user didn't login beforehand.
{{< /note >}}

# Other Camunda Modules:

* [DMN Engine](/manual/latest/user-guide/dmn-engine/embed/#maven-coordinates)
* [Camunda Spin](/manual/latest/reference/spin)
* [Camunda Connect](/manual/latest/reference/connect/#maven-coordinates)
* [Templating Engines](/manual/latest/user-guide/process-engine/templating/#install-a-template-engine-for-an-embedded-process-engine)
* [Spring Boot Integration](/manual/latest/user-guide/spring-boot-integration/)
