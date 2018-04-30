---

title: 'Deploy the Process'
weight: 30

menu:
  main:
    name: "Deploy the Process"
    parent: "get-started-quick-start"
    identifier: "get-started-quick-start-deploy"
    pre: "Deploy the Process to Camunda and start your first process instances."

---

The next step consists of deploying the Process and starting a new instance to see that your simple process is working correctly.

# Use the Camunda Modeler for Deploying the Process

In order to deploy the Process click on the deploy button in the Camunda Modeler, then give it a Deployment Name "Payment Retrieval" and hit the Deploy button.
{{< img src="../img/modeler-deploy1.png" >}}
{{< img src="../img/modeler-deploy2.png" >}}
You should see a success message in the Camunda Modeler:
{{< img src="../img/modeler-deploy3.png" >}}

# Verify the Deployment with Cockpit

Now use Cockpit to check if the process is successfully deployed. Go to [http://localhost:8080/camunda/app/cockpit](http://localhost:8080/camunda/app/cockpit). Log in with demo / demo. Your process *Payment Retrieval* is visible on the dashboard.

{{< img src="../img/cockpit-payment-retrieval.png" >}}


# Start a Process Instance

In Camunda there are different ways of starting new process instances.
You can leverage the Camunda REST API to start a new process instance by sending a POST Request.

## a) curl / wget

```sh
curl -H "Content-Type: application/json" -X POST -d '{"variables": {"amount": {"value":555}, "item": {"value":"item-xyz"} } }' http://localhost:8080/engine-rest/process-definition/key/payment-retrieval/start
```

In your worker you should now see the output in your console.
This means you have successfully started and executed your first simple process.

## b) Rest Client

If you don't feel comfortable using curl for the REST request, you can also make use of any Rest Client.

You should make a POST request to the following endpoint:
`http://localhost:8080/engine-rest/process-definition/key/payment-retrieval/start`

The JSON Body should look like this:
```JSON
{
	"variables": {
		"amount": {
			"value":555
		},
		"item": {
			"value": "item-xyz"
		}
	}
}
```

*Hint:* Make sure you are setting the headers correctly to `Content-Type: application/json`


In Postman the request could look like this:
{{< img src="../img/postman-start-instance.png" >}}

In your worker you should now see the output in your console.
This means you have successfully started and executed your first simple process.

{{< note title="Hint" class="info" >}}
If you are running on Camunda Enterprise Edition, you can also check out your completed process instance in the Camunda Cockpit.
{{< /note >}}

{{< note title="Next Step" class="info" >}}
It could be that in edge cases, we want to involve humans in our process, [continue to learn how you can involve humans in your process](nextpage).
{{< /note >}}
