---

title: 'Download'
weight: 10

menu:
  main:
    identifier: "user-guide-introduction-downloading-camunda"
    parent: "user-guide-introduction"

---


# Prerequisites

Before downloading Optimize, make sure you have a JRE (Java Runtime Environment), or better, a JDK
(Java Development Kit) installed. It is required to install Java version 8.

[Download JDK 8][get-jdk]


# Download the Runtime

Optimize is a flexible framework which can be used in different contexts.

Please note that Optimize is an extension for the Camunda BPM platform that is only available to enterprise customers.


## Full Distribution

Download the full distribution if you want to use Optimize with an embedded Elasticsearch or if you
want to get to know Optimize quickly, without any additional setup or installation steps required.

To install the full distribution, please download the archive with the latest version from the download page:

* [Full Optimize distribution](/enterprise/download/#camunda-optimize)

The full distribution bundles

* Optimize
* The Container / Application Server itself
* Configuration files and plugin folder
* Elasticsearch

See the [Installation Guide]({{< relref "technical-guide/installation/index.md" >}}) for additional details.


## Standalone Web Application Distribution

You can download the fat jar, which contains all the required files to startup Camunda Optimize, and configure it to connect to your pre-installed Elasticsearch instance.

Get the standalone application from the Camunda Nexus Repository:

* [Standalone Optimize distribution](/enterprise/download/#camunda-optimize)

The standalone distribution bundles

* Optimize
* Container / Application Server itself
* Configuration files and plugin folder

See the [Installation Guide]({{< relref "technical-guide/installation/index.md#standalone-application" >}}) for additional details.

[get-jdk]: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
[enterprise-download-page]: /enterprise/download
