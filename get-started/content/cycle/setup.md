---
title: 'Setup Camunda Cycle'
weight: 10

menu:
  main:
    name: "Setup"
    parent: "get-started-cycle"
    identifier: "get-started-cycle-setup"
    pre: "Download and configure Camunda Cycle."
---

First you need to setup your development environment and install Camunda Cycle.


# Setup

You can download Cycle from the [Download Area](http://camunda.org/download/cycle/). After starting the server, a webpage where you have to create an initial user should open automatically. You can also open http://localhost:8180/cycle and create a new user.
Since your process models will be stored in certain repositories, you should set up the respective connectors. In the upper right menu, navigate to "Connectors". Hit the "New"-Button, and follow the steps below depending on what kind of connector you want to set up.

## File Connector

{{< img src="../img/file.png" >}}

Here is a typical configuration to set up a connector to your local File System. The variable "${user.home}" in this example points to the directory of your user in your Operating System, so if your user is "horst" and you are a Windows-User, this would mean "C:\Users\horst". You can also choose an absolute path like "C:\MyFolder".

Hit "Test" to check if Cycle can find the folder you specified.

## Subversion (SVN) Connector

{{< img src="../img/svn.png" >}}

When connecting to a Subversion repository, you must specify the URL (including subfolders, if you want to directly point to a certain folder in the Subversion repository). If user credentials are mandatory, you can provide them either globally or individually for each Cycle user. In this example, we assume that every Cycle user will use the same credentials when using this connector, which is why we provide them in this dialog.

Hit "Test" to check if Cycle can connect to the SVN repository with the credentials you provided.
