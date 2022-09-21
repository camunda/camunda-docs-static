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
  <dependencies>
    <dependency>
      <groupId>org.camunda.bpm</groupId>
      <artifactId>camunda-bom</artifactId>
      <version>7.17.0</version>
      <scope>import</scope>
      <type>pom</type>
    </dependency>
  </dependencies>
</dependencyManagement>
```

## Enterprise Edition

To use the Enterprise Edition dependencies, you have to add the [Enterprise Edition Maven Repository](#enterprise-edition-1) to your project.

```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>org.camunda.bpm</groupId>
      <artifactId>camunda-bom</artifactId>
      <version>7.17.0-ee</version>
      <scope>import</scope>
      <type>pom</type>
    </dependency>
  </dependencies>
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
This BOM allows to use the DMN engine standalone without the BPMN engine and the rest of the Camunda Platform.

```xml
<dependencyManagement>
  <dependency>
    <groupId>org.camunda.bpm.dmn</groupId>
    <artifactId>camunda-engine-dmn-bom</artifactId>
    <version>7.17.0</version>
    <type>pom</type>
    <scope>import</scope>
  </dependency>
</dependencyManagement>
```

# Camunda DMN
This dependency allows to use DMN engine standalone without the BPMN engine and the rest of the Camunda Platform.
It is not needed when using `camunda-engine` because that already contains the DMN engine.

```xml
<dependency>
  <groupId>org.camunda.bpm.dmn</groupId>
  <artifactId>camunda-engine-dmn</artifactId>
</dependency>
```

# Process Application EJB Client

```xml
<dependency>
  <groupId>org.camunda.bpm.javaee</groupId>
  <artifactId>camunda-ejb-client</artifactId>
</dependency>
```

# Camunda Artifact Storage

## Artifactory
{{< note title="Important" class="danger" >}}
  Please make sure to switch the Artifactory domain name by the 30th of September 2022. Otherwise you won't be able to retrieve artifacts anymore.
  See the [blog post](https://camunda.com/blog/2022/03/a-new-domain-name-for-camunda-artifactory/) for insights.
{{< /note >}}

Camunda relies on JFrog Artifactory to provide Camunda artifacts to users at [artifacts.camunda.com](https://artifacts.camunda.com/). The artifact data is stored in [Amazon S3](https://aws.amazon.com/s3/) storage and gets served by [artifacts.camunda.com](https://artifacts.camunda.com/) via redirects to AWS S3. Users must be able to connect to both endpoints for artifact retrieval.

### Community Edition

```xml
<repositories>
  <repository>
    <id>camunda-bpm-nexus</id>
    <name>camunda-bpm-nexus</name>
    <url>
      https://artifacts.camunda.com/artifactory/public/
    </url>
  </repository>
</repositories>
```


### Enterprise Edition
The [private](https://artifacts.camunda.com/artifactory/private/) URL is a virtual repository, which aggregates a multitude of repositories.
Those include customer enterprise artifacts and all public artifacts from [public](https://artifacts.camunda.com/artifactory/public/) to make builds easier if you need those dependencies.

```xml
<repositories>
  <repository>
    <id>camunda-bpm-nexus-ee</id>
    <name>camunda-bpm-nexus</name>
    <url>
      https://artifacts.camunda.com/artifactory/private/
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

### Browse Camunda Artifact Storage
In order to browse the Camunda artifacts, here are the links which you can use.

#### Community Edition
This link helps you to browse the artifacts of Camunda Platform community edition.

https://artifacts.camunda.com/ui/native/camunda-bpm

#### Enterprise Edition
This link helps you to browse the artifacts of Camunda Platform enterprise edition. The user needs to login before accessing the link.

https://artifacts.camunda.com/ui/native/camunda-bpm-ee

{{< note title="Requires login" class="info" >}}
   Please note that the link will not be accessible if the user didn't login prior.
{{< /note >}}

### Known issues

#### cURL artifacts
The files are hosted in AWS S3, therefore, Artifactory rewrites the requests to S3 and sends a 302 as the first response. For cURL this means to add the "`-L`" or "`--location`" option to follow the response.

Example:
```
curl -LO https://artifacts.camunda.com/artifactory/camunda-bpm/org/camunda/bpm/camunda-engine-rest/7.16.0/camunda-engine-rest-7.16.0.war
```

# Other Camunda Modules:

* [DMN Engine](/manual/latest/user-guide/dmn-engine/embed/#maven-coordinates)
* [Camunda Spin](/manual/latest/reference/spin)
* [Camunda Connect](/manual/latest/reference/connect/#maven-coordinates)
* [Templating Engines](/manual/latest/user-guide/process-engine/templating/#install-a-template-engine-for-an-embedded-process-engine)
* [Spring Boot Integration](/manual/latest/user-guide/spring-boot-integration/)
