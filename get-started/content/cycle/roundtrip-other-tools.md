---
title: 'BPMN 2.0 Roundtrip with Camunda Cycle and other Tools'
weight: 30

menu:
  main:
    name: "Roundtrip other Tools"
    parent: "get-started-cycle"
    identifier: "get-started-cycle-roundtrip-other-tools"
    pre: "Create a Roundtrip with Camunda Cycle and other tools."
---

In this section we learn how to use another BPMN 2.0 modeler and Camunda Cycle.


# Roundtrip with other Tools

If you want to use another BPMN 2.0 modeler, that modeler **must** comply with the following requirements:

* Complete support of the BPMN 2.0 notation
* Export/Serialization of Process Diagrams in valid BPMN 2.0 XML

These are the minimum requirements for Forward Engineering. If you want to use the same modeler for a complete roundtrip, it **must** also allow:

* Import/Deserialization of BPMN 2.0 XML into Process Diagrams
* Import and Storage of BPMN 2.0 execution attributes
* Import and Storage of additional execution attributes (according to the <a href="http://www.omg.org/spec/BPMN/2.0/">BPMN 2.0 Specification</a>, you are allowed to extend the BPMN 2.0 XML with additional attributes, which Camunda BPM does to simplify process application development)

These are the minimum requirements for Roundtrip Engineering. If your modeler complies with them, you can use it on a simple file base, meaning that you would just use the File or Subversion Connector in Camunda Cycle to add the BPMN 2.0 Files exported from your modeler to the roundtrip. This is of course less convenient than what we have just described using Signavio. Unfortunately, none of the other BPMN 2.0 tools we know currently offer an API that Cycle could connect with (if you are a Tool Vendor, please see [this section]({{< relref "cycle/additional-information.md#information-for-tool-vendors" >}})).

Here is an overview of BPMN 2.0 modelers we know, and the requirements they comply with (information given without any warranty):

<table class="table table-responsive table-striped table-hover">
  <tr>
    <th>Product</th>
    <th>Version</th>
    <th>License</th>
    <th class="center">BPMN 2.0</th>
    <th class="center">Export</th>
    <th class="center">Import **incl. Attributes <br/>(see above)**</th>
    <th class="center">API</th><th>Cycle ready?</th>
  </tr>
  <tr>
    <td><a href="http://www.softwareag.com/de/products/az/aris/default.asp">ARIS</a></td>
    <td></td>
    <td>commercial</td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"></td>
    <td></td>
    <td></td>
    <td class="center">no</td>
  </tr>
  <tr>
    <td><a href="http://www.bizagi.com/en/products/bizagi-process-modeler/">BizAgi Process Modeler</a></td>
    <td>2.0</td>
    <td>freeware</td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"></td>
    <td></td>
    <td></td>
    <td class="center">no</td>
  </tr>
  <tr>
    <td><a href="http://www.boc-group.com/de/produkte/adonis/">BOC Adonis</a></td>
    <td>5.0</td>
    <td>commercial</td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td></td>
    <td></td>
    <td class="center">only forward</td>
  </tr>
  <tr>
    <td><a href="http://www.businessprocessincubator.com/bpmn-2-0-modeler-for-visio.html">BPMN 2.0 modeler for Visio</a></td>
    <td>3.0</td>
    <td>commercial</td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td></td>
    <td></td>
    <td class="center">only forward</td>
  </tr>
  <tr>
    <td><a href="http://www.visual-paradigm.com/product/bpva/">Business Process Visual Architect</a></td>
    <td>3.0</td>
    <td>commercial</td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td></td>
    <td></td>
    <td class="center">only forward</td>
  </tr>
  <tr>
    <td><a href="http://www.sparxsystems.com.au/">Enterprise Architect</a></td>
    <td>10</td>
    <td>commercial</td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td></td>
    <td class="center">only forward</td>
  </tr>
  <tr>
    <td><a href="http://www.ibo.de/software/ibo-prometheus-prozessmanagement-software/62.html">ibo Prometheus</a></td>
    <td>3.2</td>
    <td>commercial</td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center">yes</td>
  </tr>
  <tr>
    <td><a href="http://www.igrafx.de/">iGrafx</a></td>
    <td>2015</td>
    <td>commercial</td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td></td>
    <td></td>
    <td class="center">no</td>
  </tr>
  <tr>
    <td><a href="http://www.signavio.com/">Signavio Process Editor</a></td>
    <td>7</td>
    <td>commercial</td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center">yes</td>
  </tr>
  <tr>
    <td><a href="http://sourceforge.net/projects/bpmn/">Yaoqiang</a></td>
    <td>2.0</td><td>open source</td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td></td>
    <td class="center">yes</td>
  </tr>
  <tr>
    <td><a href="http://www.businessprocessincubator.com/">Trisotech Business Process Incubator</a></td>
    <td>2.0</td><td>commercial</td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center"><i class="glyphicon glyphicon-ok"></i></td>
    <td class="center">yes</td>
  </tr>
</table>

If this overview is in any way incorrect or outdated, please [send us a mail](mailto:community@camunda.org)!
