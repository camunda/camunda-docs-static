---

title: "Update & Migration"
weight: 50
layout: "section-list"

menu:
  main:
    identifier: "update"
    parent: "technical-guide"

---

Roughly once a month, a new version of Optimize is released. To update to the newest version, you just need to perform the following steps:

* Save the `environment-config.yaml` and the `environment-logback.xml` files from the `environment` folder.
* Delete the old version of Optimize .
* [Download Optimize.]({{< relref "introduction/downloading-camunda.md" >}})
* [Install Optimize.]({{< relref "technical-guide/installation/index.md" >}})
* Add the saved configuration files to the `environment` folder.
* Check that your configuration properties are still aligned with the [latest Optimize configuration version]({{< relref "technical-guide/configuration/index.md" >}}), as they might change from version to version.

Now you just have to wait until the data is imported again. As the data is imported from the engine, you don't lose any productive data by removing Optimize.
