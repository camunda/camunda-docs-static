---

title: 'Download and Installation'
weight: 10

menu:
  main:
    name: "Download and Installation"
    parent: "get-started-cmmn"
    identifier: "get-started-cmmn-install"
    pre: "Install Camunda BPM Platform on your machine."

---

First you need to set up your development environment and install the Camunda BPM Platform and the Camunda Modeler.


# Prerequisites

Make sure you have the following set of tools installed:

* Java JDK 1.8+,
* Apache Maven (optional, if not installed you can use the embedded Maven inside Eclipse.)
* A modern web browser (recent Firefox, Chrome or Microsoft Edge will work fine)
* Eclipse integrated development environment (IDE)


# Camunda BPM Platform

First, download a distribution of the Camunda BPM platform. You can choose from different distributions for various application servers. In this tutorial, we will use the Apache Tomcat based distribution. Download it on [the download page](https://camunda.com/download/).

After having downloaded the distribution, unpack it inside a directory of your choice. We will call that directory `$CAMUNDA_HOME`.

After you have successfully unpacked your distribution of the Camunda BPM platform, execute the script named `start-camunda.bat` (for Windows users), respectively `start-camunda.sh` (for Unix users).

This script will start the application server and open a welcome screen in your web browser. If the page does not open, go to [http://localhost:8080/camunda-welcome/index.html](http://localhost:8080/camunda-welcome/index.html).

{{< note title="Get Help!" class="info" >}}
If you have trouble setting up the Camunda BPM platform, you can ask for assistance in the [Camunda Users Forum](https://forum.camunda.org/).
{{< /note >}}

# Camunda Modeler

Follow the instructions in the [Camunda Modeler](/manual/latest/installation/camunda-modeler) section.
