---

title: 'Download and Installation'
weight: 10

menu:
  main:
    name: "Download and Installation"
    parent: "get-started-quick-start"
    identifier: "get-started-quick-start-install"
    pre: "Install the Camunda BPM Platform and Camunda Modeler on your machine."

---

First, you need to install the Camunda BPM Platform and the Camunda Modeler.

In the following section, we'll describe how to install the Camunda BPM Platform locally on your machine.

{{< note title="Hint" class="info" >}}
If you prefer, you can also run the Camunda BPM Platform with Docker:

```sh
docker pull camunda/camunda-bpm-platform:latest
docker run -d --name camunda -p 8080:8080 camunda/camunda-bpm-platform:latest
```

Afterwards, you can [install the Camunda Modeler](#camunda-modeler).
{{< /note >}}


# Prerequisites

Please make sure you have the following installed:

* Java Runtime Environment 1.8+

You can verify this by using your terminal, shell, or command line:

```sh
java -version
```
If you need to install Java Runtime Environment, you can [find the download from Oracle here](https://www.oracle.com/technetwork/java/javase/downloads/index.html).

# Camunda BPM Platform

First, download a distribution of the Camunda BPM platform. You can choose from different distributions for [various application servers](/manual/latest/installation/full/). In this tutorial, we'll use the Apache Tomcat-based distribution. Download it from [the download page](https://camunda.com/download).

After downloading the distribution, unpack it inside a directory of your choice.

After you've successfully unpacked your distribution of the Camunda BPM platform, execute the script named `start-camunda.bat` (for Windows users) or `start-camunda.sh` (for Unix users).

This script will start the application server and open a welcome screen in your web browser. If the page does not open on its own, go to [http://localhost:8080/camunda-welcome/index.html](http://localhost:8080/camunda-welcome/index.html).


# Camunda Modeler

Download the Camunda Modeler from [the download page](https://camunda.com/download/modeler/).

After downloading the Modeler, simply unzip the download in a folder of your choice.

After you have successfully unpacked the zip, run `camunda-modeler.exe` (for Windows users), `camunda-modeler.app` (for Mac users), or `camunda-modeler.sh` (for Linux users).

{{< note title="Next Step" class="info" >}}
Once you've installed the Camunda Platform and the Camunda Modeler, you can move to the next step to [model and execute your first process](/get-started/quick-start/service-task/).
{{< /note >}}
