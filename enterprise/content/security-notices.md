---

title: 'Security Notices'
weight: 60

menu:
  main:
    name: "Security Notices"
    identifier: "security-notices"

---

On this page, Camunda publishes security notices _after_ fixes are available.
Fixes are available as patches to the enterprise platform and alpha or minor
releases of the community platform.

# Notices

## Notice 2

**Publication Date: March 5th, 2018**

Camunda support is alerting customers to a potential risk with the Camunda BPM product. A vulnerability exists that can possibly allow an attacker to perform remote execution of code.

Using Camunda's API, it is possible to submit a file as a variable value in serialized form. Inside Camunda, the serialized file is deserialized which allows attackers to exploit a security vulnerability in Apache [Commons-Fileupload](https://blog.akquinet.de/2017/06/15/commons-fileupload-1-3-3-resolves-deserialisation-vulnerability-cve-2016-1000031/) which allows injecting malicious code which is executed upon deserialization.

**How to determine if the installation is affected**

There is one usage scenario which is affected:

- Installation has Apache Commons-Fileupload on the classpath
- AND The attacker has direct network access to the Rest API or a Camunda Webapplication (Cockpit, Admin, Tasklist) 
- AND the attacker is able to authenticate/login with the Camunda Rest API or a Camunda Webapplication (ie. the attacker has a valid username + password).

**Solution**

Camunda has provided the patches v7.8.2, v7.7.7, v7.6.12 which provide one fix:

* [CAM-8728](https://app.camunda.com/jira/browse/CAM-8728): Upgrade Apache Commons-Fileupload to >= 1.3.3
  This fix updates the Apache Commons-Fileupload patch level version to a version which does not exhibit [the vulnerability described in this article](https://blog.akquinet.de/2017/06/15/commons-fileupload-1-3-3-resolves-deserialisation-vulnerability-cve-2016-1000031/).
 

Customers are advised to apply these patches, particularly if they use Camunda in one for the scenarios described above.


## Notice 1

**Publication Date: Feb 2nd, 2018**

Camunda support is alerting customers to a potential risk with the Camunda BPM product. A vulnerability exists that can possibly allow an attacker to perform remote execution of code.

Using Camunda's API, it is possible to submit a Java object value as a variable value in serialized form. Inside Camunda, the object is deserialized which allows attackers to exploit a [security vulnerability in Groovy](https://www.thezdi.com/blog/2017/12/19/apache-groovy-deserialization-a-cunning-exploit-chain-to-bypass-a-patch) which allows injecting malicious code in a groovy serialized object which is executed upon deserialization.

**How to determine if the installation is affected**

There are two usage scenarios which are affected:

Scenario 1:

-  Installation has Groovy on the classpath
-  AND the attacker has direct network access to the Rest API or a Camunda Webapplication (Cockpit, Admin, Tasklist)
-  AND the attacker is able to authenticate/login with the Camunda Rest API or a Camunda Webapplication (ie. the attacker has a valid username + password).

Scenario 2:

- Installation has Groovy on the classpath
- AND Customer has embedded the Camunda Engine (Java Library) in their own application.
- AND the attacker has access to customer application and without prior checks is able to supply a serialized representation of a Java Object to the Customer's application which is passed directly to the process engine without prior inspection.

Note that while this particular vulnerability affects Groovy, java serialization has security issues in general and different exploits are possible. Camunda has also provided a patch which allows users to configure the product such that it prevents submission of Java Objects in serialized form all together (see "Solution").

**Solution**

The following fixes are provided by the patches v7.8.1, v7.7.6, v7.6.11 and the v7.9.0-alpha1 release:

* [CAM-8703](https://app.camunda.com/jira/browse/CAM-8703): Upgrade Groovy to patch version 2.4.13
  This fix updates the Groovy patch level version to a version which does not exhibit [the vulnerability described in this article](https://www.thezdi.com/blog/2017/12/19/apache-groovy-deserialization-a-cunning-exploit-chain-to-bypass-a-patch).

* [CAM-8704](https://app.camunda.com/jira/browse/CAM-8704): Configuration to prevent submission of Java Object values in serialized form.
   This fix allows configuring the process engine in a way that it completely prevents submission of Java Object values in serialized form. [The documentation explains how to use this option](https://docs.camunda.org/manual/7.8/update/patch-level/#7-6-10-to-7-6-11-7-7-5-to-7-7-6-7-8-0-to-7-8-1).
   Note that upcoming version of Camunda (7.9+) will prevent submission of serialized java objects by default (while allowing users to explicitly enable it for backwards compatibility).

Customers are advised to apply these patches, particularly if they use Camunda in one for the scenarios described above.
