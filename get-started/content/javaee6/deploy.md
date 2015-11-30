---

title: 'Deploy the Java EE Process Application'
weight: 40

menu:
  main:
    name: "Deploy"
    parent: "get-started-java-ee"
    identifier: "get-started-java-ee-deploy"
    pre: "Build and deploy the Java EE process application to JBoss AS."

---

The next step consists in building and deploying the process application.


# Deploy the Process Application

To deploy the process application select the `pom.xml` in the Package Explorer, perform a right-click and select `Run As / Maven Install`. This will generate a WAR file named `pizza-order.war` in the `target/` folder of your Maven project.

If the `pizza-order.war` file is not visible after having performed the Maven build, you need to refresh the project (F5) in eclipse.

## Deploy to JBoss AS

To deploy the process application, copy and paste the `pizza-order.war` from your Maven project `target` folder to the `$CAMUNDA_HOME/server/jboss-as-VERSION/standalone/deployments` folder.

Check the log file of the JBoss server. If you see a log message like the following one, the deployment was successful:

<pre class="console">
INFO  [org.camunda.bpm.container.impl.jboss.service.ProcessApplicationDeploymentService]
Deployment summary for process archive 'pizza-order' of process application 'pizza-order':

        pizza-order.bpmn

INFO  [javax.enterprise.resource.webcontainer.jsf.config]
Initializing Mojarra 2.1.18-jbossorg-1 20130205-1414 for context '/pizza-order'
INFO  [org.hibernate.validator.internal.util.Version]
HV000001: Hibernate Validator 4.3.1.Final
INFO  [org.jboss.as.server]
JBAS018559: Deployed "pizza-order.war" (runtime-name : "pizza-order.war")
</pre>
