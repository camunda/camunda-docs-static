---

title: "Update & Migration"
weight: 50
layout: "section-list"

menu:
  main:
    identifier: "update"
    parent: "technical-guide"

---

About every month a new version of Optimize is released. In order to update to the newest version, you just need to perform the following steps:

* Save the `environment.properties` and the `environment-logback.xml` files in the `environment` folder.
* Delete the old version of Optimize .
* [Download Optimize]({{< relref "introduction/downloading-camunda.md" >}})
* [Install Optimize]({{< relref "technical-guide/installation/index.md" >}})
* Add the saved configuration files to the `environment` folder.

Now, you just have to wait until the data is imported again. As the data imported from the engine, you don't loose any production data by removing Optimize. 
