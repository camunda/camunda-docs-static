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

* a Camunda engine, where the data is imported from.
* the Optimize back-end, where the data is transformed to a appropriate format for efficient data analysis.
* [Elasticsearch](https://www.elastic.co/guide/index.html), which is the database of Optimize, where the formatted data is persisted to.

The depicts the setup and how the components communicate with each other:

{{< img src="../img/optimize-structure.png" title="Branch Analysis" >}}

The main idea is hereby, that Optimize queries the engine data using the REST-API and transforms the data in such a way that it can be easy and fast queried by Optimize. In order, to prevent the engine from producing to much load from the Optimize queries and on the same time make the import fast, Optimize adapts the amount of queries automatically to the engine's response time.

What is more, one should be aware of what are the general requirements for the data in Optimize:

* Optimize does not own the data of the engine. The Optimize data set can always be removed and reimported or adapted to the needs of Optimize.
* The data is only a near real-time representation of the engine database. That means, Elasticsearch may not contain the data of the most recent time frame, e.g. the last two minutes, but all the data before should be synchronized.

# Import performance overview

This document gives an overview of how fast optimize imports certain data sets to get a feeling of the import speed of Optimize and if it meets certain demands. However, this presumably changes on different data sets and how all involved components are set up. E.g., if you deploy the Camunda platform on a different machine than Optimize and Elasticsearch the process is likely to speed up.

## Setup

The following component were used within the import:

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

As the Optimize configuration were the default settings used, that are described in detail in the [configuration overview](overview-of-the-configuration.md).

All three components were running on a single laptop with the following components:

* Processor: Intel® Core™ i5 (6. Generation),6440HQ Processor,4x 2.60 GHz
* Working Memory: 16 GB (DDR4)
* Storage: 192 SSD (SSD)

## Logistic and transport data set

This is a data set, which is actually used in a logistic and transport company. The set contains the following amount of instances:

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

Here, you can see how the data is distributed over the different process definitions:

{{< img src="../img/Import-performance-diagramms-logistic.png" title="Branch Analysis" >}}

Results:

* **Duration of the import:** ~30 minutes    
* **Speed of the import:** 1500-2000 database rows per seconds 
 

## Sales data set

This is a data set, which is the sales process used in Camunda. The set contains the following amount of instances:

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

Here, you can see how the data is distributed over the different process definitions:

{{< img src="../img/Import-performance-diagramms-sales.png" title="Branch Analysis" >}}

Results:

* **Duration of the import:** ~23 minutes    
* **Speed of the import:** 1700-2200 database rows per seconds 

