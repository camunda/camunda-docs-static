---

title: "User Access Management"
weight: 50
layout: "section-list"

menu:
  main:
    identifier: "user-management"
    parent: "technical-guide"

---

In Optimize you have several possibilities to define users, which can access/log in into Optimize:

* [Define a default user](#define-a-default-user)
* [Use the user credentials from the engine](#utilize-engine-users)
* [Manually handle users](#manually-handle-users)

# Define A Default User

The simplest option to create an Optimize user is by specifying a user name and password for the following properties in the [configuration file]({{< relref "technical-guide/configuration/index.md" >}}):
```json
"auth": {
  "defaultAuthentication": {
    /*
    Default password that is automatically added the first time
    optimize is started.
    */
    "password": "YOUR_USER_PASSWORD",
    /*
    Default user name that is automatically added the first time
    optimize is started.
    */
    "user": "YOUR_USER_NAME"
  }
}
```

By default the values are set to:
```json
"auth": {
  "defaultAuthentication": {
    /*
    Default password that is automatically added the first time
    optimize is started.
    */
    "password": "admin",
    /*
    Default user name that is automatically added the first time
    optimize is started.
    */
    "user": "admin"
  }
}
```

If you want to disable the default Optimize user creation, set the following property:
```json
"auth": {
  "defaultAuthentication": {
    /*
    Enables the creation of the default Optimize user. If you're using
    Optimize in production, you should disable this property,
    so you just use the users from the engine.
    */
    "creationEnabled": true
  }
}
```

# Utilize Engine Users

From Engine Version 7.7 onwards, you can use the user credentials from the engine to access Optimize. This behavior is enabled by default. However, you might want to restrict which engine users should be able to access Optimize. For that, create an engine group with a name of your choice, which dedicated for the Optimize access. Now you can add the group id to the following property _$.engines.${engineAlias}.authentication.accessGroup_:
```json
"engines": {
  /*
  an alias of the engine, which will be used for internal purposes like
  logging
  */
  "sales": {  
    "authentication": {
      /*
      With the specified group id, only engine users that are part of the
      group can access optimize.
      */
      "accessGroup": ""
    }
  }
}
```
With this defined, only users that are members of the provided group, can access Optimize.

# Manually handle users

You can also manually handle users by accessing elasticsearch directly.

In order to add a new user just perform a POST-request on ``/optimize/users/YOUR_USER_ID`` with the body:
```json
{
  "username" : "YOUR_USER_NAME",
  "password" : "YOUR_USER_PASSWORD"
}
```

If you want to delete a user, perform a DELETE-request on ``/optimize/users/YOUR_USER_ID``.
