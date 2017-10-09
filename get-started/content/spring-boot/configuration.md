---

title: 'Configure a Spring Boot Project'
weight: 20

menu:
  main:
    name: "Configuration"
    parent: "get-started-spring-boot"
    identifier: "get-started-spring-boot-congiguration"
    pre: "Configure your Camunda Spring Boot application"

---

Camunda Spring Boot Application created in previous step uses default and best practice configuration, embedded in starter. 
There are several ways to customize or override configuration. The easiest is to provide set of parameters in `application.yaml` (or `application.properties`) file. 
The full list of supported configuration parameters can be found [here](https://stage.docs.camunda.org/manual/develop/user-guide/spring-boot-integration/configuration/#camunda-engine-properties).

## Customize configuration

Let's create `application.yaml` file in `src/main/resources` folder with the following content:
```yaml
camunda.bpm:
  admin-user:
    id: kermit
    password: superSecret
    firstName: Kermit
  filter:
    create: All tasks
```

This configuration will end up in the following:

1. Admin user "kermit" with provided password and first name will be created.
2. Default filter with the name "All tasks" will be created for Tasklist.

## Build and run

Now you can rebuild and rerun the application again. Don't forget to call `mvn clean` before calling `mvn install` again.
Now when you open `http://localhost:8080/` in you browser, it does not ask you for admin user creation, but asks for login and password. 
You can use "kermit/superSecret", which we configured before, to reach Camunda web applications.
  
After you logged in, you can go to Tasklist and see, that there is a filter "All tasks" created. though it does not contain any tasks so far.

{{< get-tag repo="camunda-get-started-spring-boot" tag="Step-2" >}}
