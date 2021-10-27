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
      <version>7.15.0</version>
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
      <version>7.15.0-ee</version>
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
    <version>7.15.0</version>
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
{{< note title="General Info" class="info" >}}
  We have recently migrated from Nexus to Artifactory, see the [blog post](https://camunda.com/blog/2021/09/nexus-to-artifactory-an-infrastructural-digest/) for insights.
{{< /note >}}
### Community Edition
The config in the Camunda Nexus part about the [Community Edition]({{< relref "#community-edition-1" >}}) is still valid due to URL redirects.

An alternative is to directly use the new URL of Artifactory.

```xml
<repositories>
  <repository>
    <id>camunda-bpm-nexus</id>
    <name>camunda-bpm-nexus</name>
    <url>
      https://camunda.jfrog.io/artifactory/public/
    </url>
  </repository>
</repositories>
```


### Enterprise Edition
The config in the Camunda Nexus part about the [Enterprise Edition]({{< relref "#enterprise-edition-1" >}}) is still valid due to URL redirects.

An alternative is to directly use the new URL of Artifactory.

The `private` URL is a virtual repository, which aggregates a multitude of repositories.
Those include customer enterprise artifacts and all public artifacts from `public` to make builds easier if those dependencies are needed.

```xml
<repositories>
  <repository>
    <id>camunda-bpm-nexus-ee</id>
    <name>camunda-bpm-nexus</name>
    <url>
      https://camunda.jfrog.io/artifactory/private/
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
In order to browse the Camunda artifacts, here are the links which can be used.

#### Community Edition
The mentioned link in the Camunda Nexus part about the [Community Edition]({{< relref "#community-edition-2" >}}) is still valid due to URL redirects.

An alternative is to directly use the new URL of Artifactory.

https://camunda.jfrog.io/ui/native/camunda-bpm

#### Enterprise Edition
The mentioned link in the Camunda Nexus part about the [Enterprise Edition]({{< relref "#enterprise-edition-2" >}}) is still valid due to URL redirects.

An alternative is to directly use the new URL of Artifactory.

https://camunda.jfrog.io/ui/native/camunda-bpm-ee

{{< note title="Requires login" class="info" >}}
   Please note that the link will not be accessible if the user didn't login prior.
{{< /note >}}

### Known issues

#### Camunda-bpm-ee URL issue
After migrating away from Nexus, we've got several reports about the "`camunda-bpm-ee`" URL not working.
Therefore, we've been communicating an alternative solution by using the virtual repository "`private`".
This repository is an aggregation of other repositories, including the "`camunda-bpm-ee`" artifacts among other enterprise artifacts and all public artifacts.

The root cause of the issue is that local repositories, in Artifactory, don't request authentication in Maven due to which one has to preemptively send the authentication even though it might not be requested. The advantage of the virtual repository "`private`" is that it allows forcing the authentication.

We see the `camunda-bpm-ee` URL for enterprise artifacts as technical debt. We have provided all public artifacts under the `public` URL for over 6 years but haven't changed to the same for enterprise artifacts. The enterprise products within Camunda have grown over the years, but combining them as aggregated repository was never done, which we now take the time to correct.

Please see the following [additional config]({{< relref "#additional-config-if-used-in-conjunction-with-the-camunda-bpm-ee-url" >}}) for the required adjustments to always send the authentication if continued to be used with the "`camunda-bpm-ee`" URL or permanently switch to https://camunda.jfrog.io/artifactory/private/.

The "[`private`](https://camunda.jfrog.io/artifactory/private/)" repository is here to stay and contains all enterprise customer artifacts and public artifacts.

#### cURL artifacts
The files are hosted in AWS S3, therefore, Artifactory rewrites the requests to S3 and sends a 302 as the first response. For cURL this means to add the "`-L`" or "`--location`" option to follow the response.

Example:
```
curl -LO https://camunda.jfrog.io/artifactory/camunda-bpm/org/camunda/bpm/camunda-engine-rest/7.16.0/camunda-engine-rest-7.16.0.war
```
## (Deprecated) Nexus

{{< note title="Deprecation!" class="danger" >}}
  Please note that, from 15th of October 2021, the Camunda Nexus is deprecated as we've migrated to Artifactory for our new artifact storage.
  Nevertheless, the settings still apply as we rewrite the URLs to the new location.
  The docs will be rewritten in the future and the Nexus part will be removed.
{{< /note >}}

{{< note title="Known camunda-bpm-ee issue" class="info" >}}
  As part of the migration, the URL of "`camunda-bpm-ee`" needs an additional config of preemptively sending the authentication (see [additional config]({{< relref "#additional-config-if-used-in-conjunction-with-the-camunda-bpm-ee-url" >}})).

  Please consider switching to https://camunda.jfrog.io/artifactory/private/ permanently as it doesn't require the additional config.
{{< /note >}}
### Community Edition

```xml
<repositories>
  <repository>
    <id>camunda-bpm-nexus</id>
    <name>camunda-bpm-nexus</name>
    <url>
      https://app.camunda.com/nexus/content/groups/public/
    </url>
  </repository>
</repositories>
```

### Enterprise Edition

The `private` URL is a virtual repository, which aggregates a multitude of repositories.
Those include customer enterprise artifacts and all public artifacts from `public` to make builds easier if those dependencies are needed.

```xml
<repositories>
  <repository>
    <id>camunda-bpm-nexus-ee</id>
    <name>camunda-bpm-nexus</name>
    <url>
      https://app.camunda.com/nexus/content/groups/private/
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

#### Additional config if used in conjunction with the camunda-bpm-ee URL.

##### Maven
```xml
  <servers>
    <server>
      <id>camunda-bpm-nexus-ee</id>
      <username>YOUR_USERNAME</username>
      <password>YOUR_PASSWORD</password>
      <configuration>
        <httpConfiguration>
          <get>
            <usePreemptive>true</usePreemptive>
          </get>
        </httpConfiguration>
    </configuration>
    </server>
  </servers>
```
##### Gradle
```java
repositories {
    maven {
        url "https://camunda.jfrog.io/artifactory/camunda-bpm-ee/"
        credentials {
            username "YOUR_USERNAME"
            password "YOUR_PASSWORD"
        }
        authentication {
            basic(BasicAuthentication)
        }
    }
}
```

### Known issue with Artifactory

Please find below the known issue in Artifactory while configuring Nexus repository as a Maven remote proxy.

While testing the connection in Artifactory, if you get "Connection failed: Error 404: Not Found" message then you can ignore it, and continue to add the repository. The maven build should be able to download dependencies without any issues.

### Browse Camunda Nexus
In order to browse the Camunda Nexus artifacts, here are the links which can be used.

#### Community Edition
This link helps you to browse the artifacts of Camunda Platform community edition.

 https://app.camunda.com/nexus/service/rest/repository/browse/camunda-bpm/

#### Enterprise Edition
This link helps you to browse the artifacts of Camunda Platform enterprise edition. The user needs to login to the nexus repository before accessing the link.

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
