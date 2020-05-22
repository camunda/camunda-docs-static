---

title: 'Download and Installation'
weight: 10

menu:
  main:
    parent: "get-started-java-ee"
    identifier: "get-started-java-ee-install"
    pre: "Install Camunda BPM Platform and Camunda Modeler on your machine."

---

First you need to set up your development environment and install the Camunda BPM Platform and the Camunda Modeler.


# Prerequisites

Make sure you have the following set of tools installed:

* Java JDK 1.8+
* Apache Maven (optional, if not installed you can use embedded Maven inside Eclipse.)
* A modern web browser (recent Firefox, Chrome or Microsoft Edge will work fine)
* Eclipse integrated development environment (IDE)

# Install Camunda BPM platform

First, download a distribution of the Camunda BPM platform. You can choose from different application servers. In this tutorial, we will use the wildfly 18 based distribution. Download it from [the download page](https://camunda.com/download/).

After having downloaded the distribution, unpack it inside a directory of your choice. We will call that directory
`$CAMUNDA_HOME`.

After you have successfully unpacked your distribution of the Camunda BPM platform, execute the script named
`start-camunda.bat` for Windows users, respectively `start-camunda.sh` for Unix users.

This script will start the application server and open a welcome screen in your Web browser.
If the page does not open, go to http://localhost:8080/camunda-welcome/index.html.

{{< note title="Getting Help" class="info" >}}
If you have trouble setting up the Camunda BPM platform, you can ask for assistance in the [Forum](https://forum.camunda.org/).
{{< /note >}}

# Install Camunda Modeler

Follow the instructions in the [Camunda Modeler](/manual/latest/installation/camunda-modeler) section.

{{< get-code repo="camunda-get-started-javaee" >}}
