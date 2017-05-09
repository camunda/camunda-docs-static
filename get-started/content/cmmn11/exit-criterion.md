---

title: 'Using a CMMN Sentry as Exit Criterion'
weight: 50

menu:
  main:
    name: "Exit Criterion"
    parent: "get-started-cmmn"
    identifier: "get-started-cmmn-exit"
    pre: "Use a sentry to decide when a task can be skipped / cancelled."

---

When a loan application is not sufficient, for example because it has formal errors, there is no need to provide a customer rating any longer. We can express this in CMMN by adding a sentry which acts as exit criterion.

# Add an Exit Sentry

In the modeler, click on the *Check Application* task to open the context pad, then click on *Append Criterion*. Move the criterion to the top edge of the *Provide Customer Rating* task and attach it there. Click on the entry criterion and open the replace menu by clicking on the wrench icon {{< glyphicon name="wrench" >}}. Now click on *Exit Criterion* to morph the sentry.

Keep the exit criterion selected and configure the *If Part Condition* using the properties panel. Insert the following into the text input field: `${!applicationSufficient}`

{{< img src="../img/cmmn-10.png" >}}

Save the changes in the modeler before continuing.

# Re-build and Deploy

Again, [rebuild](../instantiate-test/#build-the-web-application-with-maven) and [redeploy](../instantiate-test/#deploy-to-apache-tomcat) the project.

{{< img src="../img/tasklist-check-application-variable-unchecked.png" >}}

Go to Tasklist and access the `demo` user's tasks. As before, check the task *Check Application*. To trigger the sentry, add the variable `applicationSufficient` of type `Boolean`, but this time make sure to leave the check box unchecked. Click {{< button name="primary" text="Complete" >}}.

You will notice that the task *Provide Customer Rating* has disappeared from the Tasklist. That is because the sentry has been triggered and the task's exit criterion has been fulfilled. Also, you can check the Tomcat console. This time, there is no log entry for the milestone.

{{< note title="Sentries" class="info" >}}
To learn more about sentries, consider checking the [Sentries section](/manual/latest/reference/cmmn11/sentry) in our CMMN implementation guide.
{{< /note >}}

{{< get-tag repo="camunda-get-started-cmmn" tag="Step-6" >}}
