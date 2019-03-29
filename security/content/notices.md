---
title: "Security Notices"
weight: 70

menu:
  main:
    name: "Notices"
    identifier: "notices"
---

On this page, Camunda publishes security notices _after_ fixes are available.
Fixes are available as patches to the enterprise platform and alpha or minor
releases of the community platform.

# Notices

## Notice 7

**Publication Date: March 29th, 2019**

In the last months there have been several security audits, which revealed a couple of risks that could allow the theft of a user session in the Camunda extension Optimize. There a cookie is used to handle the user session and following problems were detected:

- The cookie _secure_ flag was not set: This is an option that can be set server-side to make sure that a cookie is only send if the connection is encrypted using HTTPS. Whenever the HTTP connection is disabled in Optimize, this flag is now set. The purpose is to prevent unauthorized access from other parties. Read more about that in the dedicated OWASP [SecureFlag](https://www.owasp.org/index.php/SecureFlag) guide.
- The cookie _httpOnly_ flag was not set: This is an option that prohibits the access through client side scripts if the browser supports this flag. As a result, an attacker cannot obtain the session from the cookie, even if a cross-site scripting (XSS) flaw is present. Read more about that in the dedicated OWASP [HttpOnly](https://www.owasp.org/index.php/HttpOnly) guide.
- The HTTP connection could not be disabled: HTTP is a protocal used to transfer the data. By design, HTTP does not encrypt the data which is being send. This allows unauthorized third parties to intercept the communication and gather data being passed between the two systems. In addition, it is possible to use this protocol to steal the cookie and with it the user session. Hence, it is crucial to be able to disable this insecure commnunication and use it only for easy testing.

Camunda has provided a fix ([OPT-1996](https://app.camunda.com/jira/browse/OPT-1996)) with the Optimize release v2.4.0.

## Notice 6

**Publication Date: March 21st, 2019**

The version of Jackson used by Camunda Spin was vulnerable to object deserialization flaws. Details:

- https://nvd.nist.gov/vuln/search/results?adv_search=true&cpe=cpe%3a%2fa%3afasterxml%3ajackson-databind%3a2.9.7

**How to determine if the installation is affected**

- Camunda Spin is on the classpath
- An attacker is able to access the REST API and has permissions to submit process variables
- One of the following artifacts is on the classpath: axis2-transport-jms, openjpa, jboss-commons-core

**Solution**

Camunda has provided the releases v7.10.3 and 7.11.0-alpha2 which contain a fix.

## Notice 5

**Publication Date: March 21st, 2019**

The version of Apache http-components used by Camunda Connect was vulnerable to denial-of-service and man-in-the-middle attacks. Details:

- https://nvd.nist.gov/vuln/search/results?adv_search=true&cpe=cpe%3a%2fa%3aapache%3ahttpclient%3a4.3.3

**How to determine if the installation is affected**

- Camunda Connect is on the classpath
- Connector service tasks are used in a process

**Solution**

Camunda has provided the releases v7.10.3 and 7.11.0-alpha2 which contain a fix.

## Notice 4

**Publication Date: November 30th, 2018**

The Camunda BPM Platform has obtained a security fix related to XML eXternal Entity (XXE) Processing. A BPMN Model (XML) can be uploaded containing a reference to an external entity. When processed by a weakly configured XML parser, this attack may lead to the disclosure of confidential data, denial of service, server side request forgery etc.

**How to determine if the installation is affected**

There is a single usage scenario which is affected:

- When uploading a BPMN Model (XML) that contains a reference to an external entity, a `ProcessEngineException` will be thrown. The exception message will contain the content of the external entity (ex. `/etc/passwd`).

**Solution**

Camunda has provided the patches v7.10.0, v7.9.7, v7.8.12, v7.7.10 which provide the fix:

- [CAM-9285](https://app.camunda.com/jira/browse/CAM-9285): Prevention of External Entity Processing.
  This fixes the security vulnerability described [here](<https://www.owasp.org/index.php/XML_External_Entity_(XXE)_Processing>). Further configuration options are documented [here](https://docs.camunda.org/manual/latest/reference/deployment-descriptors/tags/process-engine/#configuration-properties).

## Notice 3

**Publication Date: September 19th, 2018**

The Camunda BPM Platform has obtained security fixes related to the prevention of CSRF attacks, and support for providing _whitelist patterns_ for User, Group and Tenant IDs.

Using the Camunda Webapps, it is possible for a user to execute unwanted actions by sumbitting a malicious request (CSRF) provided by an attacker. Furthermore, a Camunda user, with the appropriate permissions, may create new users, groups or tenant IDs with arbitrary values and lengths.

**How to determine if the installation is affected**

There are two usage scenarios which are affected:

- Regarding the CSRF security vulnerability, the HTTP Request Headers of the Camunda Webapps won't provide a custom `X-XSRF-TOKEN` header.
- Regarding the Whitelist Patterns security vulnerability, a user with User/Group/Tenant Create permissions will be able to create users/groups/tenants with arbitrary ID values.

**Solution**

Camunda has provided the patches v7.10.0, v7.9.2, v7.8.8, v7.7.9 which provide two fixes:

- [CAM-9107](https://app.camunda.com/jira/browse/CAM-9107): Prevention of Cross-Site-Request-Forgery
  This fixes the security vulnerability described [here](<https://www.owasp.org/index.php/Cross-Site_Request_Forgery_(CSRF)>). Further configuration options are documented [here](https://docs.camunda.org/manual/latest/update/minor/79-to-710/#support-for-csrf-prevention-in-the-webapps).
- [CAM-9109](https://app.camunda.com/jira/browse/CAM-9109): When a user, group, or tenant is created, the given id is validated against a whitelist.
  This provides support for defining custom regular expression patterns for whitelisting User/Group/Tenant ID values. Further configuration options can be found [here](https://docs.camunda.org/manual/latest/reference/deployment-descriptors/tags/process-engine/#resource-whitelist-pattern-parameters).

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

Camunda has provided the patches v7.9.0, v7.8.2, v7.7.7, v7.6.12 which provide one fix:

- [CAM-8728](https://app.camunda.com/jira/browse/CAM-8728): Upgrade Apache Commons-Fileupload to >= 1.3.3
  This fix updates the Apache Commons-Fileupload patch level version to a version which does not exhibit [the vulnerability described in this article](https://blog.akquinet.de/2017/06/15/commons-fileupload-1-3-3-resolves-deserialisation-vulnerability-cve-2016-1000031/).

Customers are advised to apply these patches, particularly if they use Camunda in one for the scenarios described above.

## Notice 1

**Publication Date: Feb 2nd, 2018**

Camunda support is alerting customers to a potential risk with the Camunda BPM product. A vulnerability exists that can possibly allow an attacker to perform remote execution of code.

Using Camunda's API, it is possible to submit a Java object value as a variable value in serialized form. Inside Camunda, the object is deserialized which allows attackers to exploit a [security vulnerability in Groovy](https://www.thezdi.com/blog/2017/12/19/apache-groovy-deserialization-a-cunning-exploit-chain-to-bypass-a-patch) which allows injecting malicious code in a groovy serialized object which is executed upon deserialization.

**How to determine if the installation is affected**

There are two usage scenarios which are affected:

Scenario 1:

- Installation has Groovy on the classpath
- AND the attacker has direct network access to the Rest API or a Camunda Webapplication (Cockpit, Admin, Tasklist)
- AND the attacker is able to authenticate/login with the Camunda Rest API or a Camunda Webapplication (ie. the attacker has a valid username + password).

Scenario 2:

- Installation has Groovy on the classpath
- AND Customer has embedded the Camunda Engine (Java Library) in their own application.
- AND the attacker has access to customer application and without prior checks is able to supply a serialized representation of a Java Object to the Customer's application which is passed directly to the process engine without prior inspection.

Note that while this particular vulnerability affects Groovy, java serialization has security issues in general and different exploits are possible. Camunda has also provided a patch which allows users to configure the product such that it prevents submission of Java Objects in serialized form all together (see "Solution").

**Solution**

The following fixes are provided by the patches v7.8.1, v7.7.6, v7.6.11 and the v7.9.0-alpha1 release:

- [CAM-8703](https://app.camunda.com/jira/browse/CAM-8703): Upgrade Groovy to patch version 2.4.13
  This fix updates the Groovy patch level version to a version which does not exhibit [the vulnerability described in this article](https://www.thezdi.com/blog/2017/12/19/apache-groovy-deserialization-a-cunning-exploit-chain-to-bypass-a-patch).

- [CAM-8704](https://app.camunda.com/jira/browse/CAM-8704): Configuration to prevent submission of Java Object values in serialized form.
  This fix allows configuring the process engine in a way that it completely prevents submission of Java Object values in serialized form. [The documentation explains how to use this option](https://docs.camunda.org/manual/7.8/update/patch-level/#7-6-10-to-7-6-11-7-7-5-to-7-7-6-7-8-0-to-7-8-1).
  Note that upcoming version of Camunda (7.9+) will prevent submission of serialized java objects by default (while allowing users to explicitly enable it for backwards compatibility).

Customers are advised to apply these patches, particularly if they use Camunda in one for the scenarios described above.
