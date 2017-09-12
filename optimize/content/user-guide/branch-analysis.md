---

title: 'Branch Analysis'
layout: "section-list"
weight: 40

menu:
  main:
    identifier: "branch-analysis"
    parent: "user-guide"
    pre: "Eliminating bottle-necks of your process by finding steps that take longer than a specified target value"
---

If a process contains more than one end-event, it is useful to know which path tokens take when they get to an end event. Camunda Optimize can show you a statistical analysis for a given end event and a gateway. This analysis includes how tokens were split at the gateway in question and how many of the tokens of each branch reached the end event.

Have a look here on how to display the branch analysis view:

{{< video src="../video/branch-analysis.mp4" title="Branch Analysis" >}}
