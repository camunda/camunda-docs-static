---

title: "Import Overview"
weight: 20

menu:
  main:
    name: "Import Overview"
    identifier: "migration-guide-patch"
    parent: "import-guide"
    pre: "Shows how the import works in general and an example of the import performance."

---

# Architecture Overview

In general, the import assumes the following setup:

* A Camunda engine, where the data is imported from.
* The Optimize back-end, where the data is transformed to an appropriate format for efficient data analysis.
* [Elasticsearch](https://www.elastic.co/guide/index.html), which is the database of Optimize, to where the formatted data is persisted.

The following depicts the setup and how the components communicate with each other:

{{< img src="../img/optimize-structure.png" title="Branch Analysis" >}}

Hereby, the main idea is that Optimize queries the engine data using the REST-API and transforms the data such that it can be quickly and easily queried by Optimize. To prevent the engine from producing too much load from the Optimize queries and at the same time to make the import fast, Optimize adapts the amount of queries automatically to the engine's response time.

Furthermore, one should be aware of what the general requirements for the data in Optimize are:

* Optimize does not own the data of the engine. The Optimize dataset can always be removed and reimported or adapted to the needs of Optimize.
* The data is only a near real-time representation of the engine database. That means, Elasticsearch may not contain the data of the most recent time frame, e.g. the last two minutes, but all the previous data should be synchronized.

If you are interested in the details of the import, have a look at the designated section [Import Procedure]({{< relref "technical-guide/import/import-procedure.md#pagination" >}}).

# Import performance overview

This section gives an overview of how fast Optimize imports certain datasets to get a feeling of the import speed of Optimize and if it meets certain demands. However, this presumably changes on different datasets and onhow all involved components are set up. E.g., if you deploy the Camunda platform on a different machine than Optimize and Elasticsearch the process is likely to speed up.

## Setup

The following components were used within the import:

<table class="table table-striped">
  <tr>
    <th>Component</th>
    <th>Version</th>
  </tr>
  <tr>
    <td>Camunda Platform</td>
    <td>7.7.0 on a Tomcat 8.0.24</td>
  </tr>
  <tr>
    <td>Elasticsearch</td>
    <td>5.4.0</td>
  </tr>
  <tr>
    <td>Optimize</td>
    <td>1.0.0</td>
  </tr>
</table>

The Optimize configuration with the default settings was used, as described in detail in the [configuration overview](overview-of-the-configuration.md).

All three of the following components were running on a single laptop:

* Processor: Intel® Core™ i5 (6. Generation),6440HQ Processor,4x 2.60 GHz
* Working Memory: 16 GB (DDR4)
* Storage: 192 SSD (SSD)

The time was measured from the start of Optimize until the whole import of the data to Optimize was finished.

## Medium size data set

This dataset contains the following amount of instances:

<table class="table table-striped">
  <tr>
    <th>Number of Process Definitions</th>
    <th>Number of Activity Instances</th>
    <th>Number of Process Instances</th>
    <th>Number of Variable Instances</th>
  </tr>
  <tr>
    <td>46</td>
    <td>1 427 384 </td>
    <td>261 106</td>
    <td>1 273 324</td>
  </tr>
</table>

Here you can see how the data is distributed over the different process definitions:

{{< img src="../img/Import-performance-diagramms-logistic.png" title="Branch Analysis" >}}

Results:

* **Duration of importing the whole data set:** ~30 minutes    
* **Speed of the import:** 1500-2000 database rows per second during the import process
 

## Small data set

This dataset contains the following amount of instances:

<table class="table table-striped">
  <tr>
    <th>Number of Process Definitions</th>
    <th>Number of Activity Instances</th>
    <th>Number of Process Instances</th>
    <th>Number of Variable Instances</th>
  </tr>
  <tr>
    <td>10</td>
    <td>663 424</td>
    <td>62 897</td>
    <td>2 034 905</td>
  </tr>
</table>

Here you can see how the data is distributed over the different process definitions:

{{< img src="../img/Import-performance-diagramms-sales.png" title="Branch Analysis" >}}

Results:

* **Duration of importing the whole data set:** ~23 minutes    
* **Speed of the import:** 1700-2200 database rows per second during the import process

