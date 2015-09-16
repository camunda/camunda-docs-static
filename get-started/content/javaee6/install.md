---

title: 'Download and Installation'
weight: 10

menu:
  main:
    parent: "get-started-java-ee"
    identifier: "get-started-java-ee-install"
    pre: "Install Camunda BPM Platform and Camunda Modeler on your machine."

---

First you need to setup your development environment and install Camunda BPM Platform and Camunda Modeler.


# Prerequisites

Make sure you have the following set of tools installed:

* Java JDK 1.6+
* Apache Maven (optional, if not installed you can use embedded Maven inside eclipse.)
* A modern Web browser (recent Firefox, Chrome, or Internet Explorer 9+ will work fine)

## Install Camunda BPM platform

First, download a distribution of the Camunda BPM platform. You can choose from different application servers. In this tutorial, we will use the JBoss AS 7 based distribution. Download it [here](http://camunda.org/download/).

After having downloaded the distribution, unpack it inside a directory of your choice. We will call that directory
`$CAMUNDA_HOME`.

After you have successfully unpacked your distribution of the Camunda BPM platform, execute the script named
`start-camunda.bat` for Windows users, respectively `start-camunda.sh` for Unix users.

This script will start the application server and open a welcome screen in your Web browser.
If the page does not open, go to http://localhost:8080/camunda-welcome/index.html.

{{< note title="Getting Help" class="info" >}}
If you have trouble setting up the Camunda BPM platform, you can ask for assistance in the [Forum](http://camunda.org/community/forum.html).
{{< /note >}}

## Install Camunda Modeler

Follow the instructions in the [Camunda Modeler](/manual/latest/installation/eclipse-plugin) section.

{{< get-code repo="camunda-get-started-javaee" >}}
