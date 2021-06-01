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

## Notice 44

**Publication Date: June 1st, 2021**

**Product affected:**

Cawemo On-Premises

**Impact:**

The versions of the dependencies io.netty:netty-codec-http2 and net.minidev:json-smart shipped with cawemo-restapi were affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2021-21409
- https://nvd.nist.gov/vuln/detail/CVE-2021-27568

The dependencies jose, lodash and browserslist shipped with cawemo-webapp were affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2021-29443
- https://nvd.nist.gov/vuln/detail/CVE-2021-23337
- https://nvd.nist.gov/vuln/detail/CVE-2021-23364

**How to determine if the installation is affected**

- Cawemo On-Premises 1.6.2 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.6.3 releases for the cawemo-restapi and cawemo-webapp Docker images which contain fixes for the above-mentioned CVE.


## Notice 43

**Publication Date: April 13th, 2021**

**Product affected:**

Camunda Platform

**Impact:**

The version of Apache Tomcat shipped with the Camunda distributions and transitively pulled in by the Camunda Spring Boot starter was vulnerable to requests getting a response belonging to a different request and contained an incomplete fix for a previously addressed vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2021-25122
- https://nvd.nist.gov/vuln/detail/CVE-2021-25329

**How to determine if the installation is affected**

- Camunda Platform Tomcat is used *or* Camunda Platform Run is used *or* Camunda Platform Spring Boot Starter is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided the releases 7.15.0, 7.14.6, 7.13.12, 7.12.19 which contain a fix. 

The Camunda Spring Boot starter versions 7.13 and 3.4 work with Spring Boot 2.2, for which no patch is available that resolves this problem. We recommend to either update the Tomcat dependencies manually or moving to a higher version of Spring Boot in accordance with [Camunda's compatibility matrix](https://docs.camunda.org/manual/7.15/user-guide/spring-boot-integration/version-compatibility/).

Other solutions:

- Tomcat and Spring Boot can be updated independently of Camunda to the latest patch level


## Notice 42

**Publication Date: March 9th, 2021**

**Product affected:**

Camunda Platform

**Impact:**

The solution to [Notice 39](#notice-39) was not applied to the web application artifacts of the Camunda enterprise edition, meaning that they contained a vulnerable version of Apache Commons Codec.

**How to determine if the installation is affected**

- The Camunda Platform web applications are used
- Camunda Enterprise edition is used

**Solution**

Camunda has provided the releases 7.15.0-alpha4, 7.14.5, 7.13.11, 7.12.18 which contain a fix.

## Notice 41

**Publication Date: February 9th, 2021**

**Product affected:**

Camunda Platform

**Impact:**

The version of the MySQL JDBC driver used by the Camunda Platform Docker container was vulnerable to various attacks. Details:

- https://nvd.nist.gov/vuln/detail/CVE-2017-3523
- https://nvd.nist.gov/vuln/detail/CVE-2017-3589
- https://nvd.nist.gov/vuln/detail/CVE-2018-3258

**How to determine if the installation is affected**

- The Camunda Platform Docker container is used
- MySQL is used

**Solution**

Camunda has provided the releases 7.15.0-alpha3, 7.14.4, 7.13.10, 7.12.17 which contain a fix. 

Please have a look at the patch update guide for the potential implications of using a higher version of the MySQL JDBC driver: https://docs.camunda.org/manual/7.14/update/patch-level/#update-of-mysql-jdbc-driver-in-camunda-docker-images.

## Notice 40

**Publication Date: February 9th, 2021**

**Product affected:**

Camunda Platform

**Impact:**

The version of Jackson used by Camunda Spin was vulnerable to XML external entity (XXE) attacks. Details:

- https://nvd.nist.gov/vuln/detail/CVE-2020-25649

**How to determine if the installation is affected**

- Camunda Spin is on the classpath
  - Camunda distributions are used (e.g. Run, Tomcat, Wildfly)
  - Spin is used as a project dependency
- An attacker is able to access the REST API or web applications and has permissions to submit process variables
- The recommended configuration for type whitelisting is not applied: https://docs.camunda.org/manual/7.14/user-guide/security/#variable-values-from-untrusted-sources

**Solution**

Camunda has provided the releases 7.15.0-alpha3, 7.14.4, 7.13.10, 7.12.17 which contain a fix.

## Notice 39

**Publication Date: February 9th, 2021**

**Product affected:**

Camunda Platform

**Impact:**

The version of Apache Commons Codec used by Camunda Connect was vulnerable to improper input validation. Details:

- https://issues.apache.org/jira/browse/CODEC-134

**How to determine if the installation is affected**

- The process engine is used

**Solution**

Camunda has provided the releases 7.15.0-alpha3, 7.14.4, 7.13.10, 7.12.17 which contain a fix.

## Notice 38

**Publication Date: February 9th, 2021**

**Product affected:**

Camunda Platform

**Impact:**

The version of Apache HTTP Client used by Camunda Connect was vulnerable to an attack that a malformed request URL was interpreted incorrectly, which could lead the client to make a request against a different host. Details:

- https://nvd.nist.gov/vuln/detail/CVE-2020-13956

**How to determine if the installation is affected**

- The process engine is used
- Connector service tasks are used in a process and an attacker can manipulate the request URL
- Telemetry is used and an attacker can manipulate the request URL

**Solution**

Camunda has provided the releases 7.15.0-alpha3, 7.14.4, 7.13.10, 7.12.17 which contain a fix.


## Notice 37

**Publication Date: February 9th, 2021**

**Product affected:**

Camunda Platform

**Impact:**

The version of Resteasy used by the Camunda Tomcat distributions was vulnerable to an attack that an illegal header could be injected into the HTTP response with a crafted request. Details:

- https://nvd.nist.gov/vuln/detail/CVE-2020-1695

**How to determine if the installation is affected**

- The Camunda Tomcat distribution is used (Camunda Run is not affected)

**Solution**

Camunda has provided the releases 7.15.0-alpha3, 7.14.4, 7.13.10, 7.12.17 which contain a fix.

## Notice 36

**Publication Date: February 9th, 2021**

**Product affected:**

Camunda Platform

**Impact:**

The version of Apache Tomcat shipped with the Camunda distributions and transitively pulled in by the Camunda Spring Boot starter was vulnerable to unauthorized exposure of file resources and information leaks between HTTP requests:

- https://nvd.nist.gov/vuln/detail/CVE-2020-17527
- https://nvd.nist.gov/vuln/detail/CVE-2021-24122

**How to determine if the installation is affected**

- Camunda Platform Tomcat is used *or* Camunda Platform Run is used *or* Camunda Platform Spring Boot Starter is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided the releases 7.15.0-alpha3, 7.14.4, 7.13.10, 7.12.17 which contain a fix.

Other solutions:

- Tomcat and Spring Boot can be updated independently of Camunda to the latest patch level


## Notice 35

**Publication Date: September 29th, 2020**

**Product affected:**

Camunda Platform

**Impact:**

It was possible to submit requests to the Camunda REST API that result in errors that disclose SQL statements. Attackers can learn about the database schema and vendor in use and can focus further attacking attempts accordingly.

**How to determine if the installation is affected**

- You are using the Camunda Platform REST API or web applications
- An attacker has access to the system as an authenticated user

**Solution**

Camunda has provided the releases 7.14.0-alpha4, 7.13.5, 7.12.11, 7.11.18 which contain a fix. With these versions, Camunda returns a generic error message for any persistence-related errors.

## Notice 34

**Publication Date: August 13th, 2020**

**Product affected:**

Camunda Platform

**Impact:**

It was possible to deploy BPMN XML models with `ELEMENT` and `ENTITY` declarations successfully. When querying for or starting the corresponding process definitions, a validation exception was raised. This enables a partial denial of service attack for these functions.

**How to determine if the installation is affected**

- You are using the Camunda Platform process engine
- An attacker is able to deploy BPMN models

**Solution**

Camunda has provided the releases 7.14.0-alpha2, 7.13.2, 7.12.8, 7.11.15 which contain a fix. With these versions, BPMN models with the characteristics described in the *Impact* section are rejected during deployment.

## Notice 33

**Publication Date: July 20th, 2020**

**Product affected:**

Camunda Platform

**Impact:**

The version of Angular JS shipped with the Camunda web applications was vulnerable to cross-site-scripting attacks:

- https://nvd.nist.gov/vuln/detail/CVE-2020-7676

The vulnerability does not affect the Camunda web applications (Cockpit, Tasklist, Admin) directly because they do not use the vulnerable functionality. However, custom tasklist forms or web application plugins may be affected.

**How to determine if the installation is affected**

- You are using the Camunda Platform web applications (Cockpit, Tasklist, Admin)
- You have embedded task forms or web application plugins
- See the NIST link above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided the releases 7.14.0-alpha1, 7.13.2, 7.12.8, 7.11.15 which contain a fix.

## Notice 32

**Publication Date: July 14th, 2020**

**Product affected:**

Camunda Optimize

**Impact:**

It was possible to collect valid usernames by interacting with the "Add User to Collection" modal of Optimize, which displayed all available Optimize users. This vulnerability could have been used to increase the efficiency of brute force attacks.

**How to determine if the installation is affected**

- Camunda Optimize 3.0.0 or lower is used

**Solution**

Camunda Optimize 3.1.0 has been released which contains a fix. Optimize 3.1.0 now ensures that user and group related permissions are taken into account when displaying user information in Optimize. This way only information which the current user is authorized to see is being revealed.

## Notice 31

**Publication Date: July 14th, 2020**

**Product affected:**

Camunda Optimize

**Impact:**

Over time, various client-side security mechanisms have been developed to protect web applications from various attacks. Some of these security mechanisms are only activated if the web application sends the corresponding HTTP headers in its server responses to activate these security mechanisms. So far, Optimize did not make use of all these features. Not using these mechanisms does not in itself pose a security risk but may encourage the exploitation of other (previously undetected) vulnerabilities.

Headers added to the request responses:

* X-XSS-Protection (Additional protection against Cross-Site Scripting attacks; Header field: X-XSS Protection)
 * HTTP Strict Transport Security (Additional protection against man-in-the-middle attacks; Header field: Strict-Transport-Security)
 * Content Security Policy (Additional protection against Cross-Site Scripting attacks and clickjacking attacks; Header field: Content-Security-Policy)
 * X-Content-Type-Options (Protection against attacks based on mix-ups of MIME types; Header field: X-Content-Type-Options)

**How to determine if the installation is affected**

-  Camunda Optimize 3.0.0 or lower is used

**Solution**

Camunda Optimize 3.1.0 has been released which contains a fix.

## Notice 30

**Publication Date: July 6th, 2020**

**Product affected:**

Camunda Platform

**Impact:**

The version of Apache Tomcat shipped with the Camunda distributions and transitively pulled in by the Camunda Spring Boot starter was vulnerable to denial-of-service attacks and remote code execution:

- https://nvd.nist.gov/vuln/detail/CVE-2020-11996
- https://nvd.nist.gov/vuln/detail/CVE-2020-9484

**How to determine if the installation is affected**

- Camunda Platform Tomcat is used *or* Camunda Platform Run is used *or* Camunda Platform Spring Boot Starter is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided the releases 7.14.0-alpha1, 7.13.1, 7.12.7, 7.11.14, Spring Boot Starter 3.4.4, Spring Boot Starter 3.3.10 which contain a fix.

Other solutions:

- Tomcat and Spring Boot can be updated independently of Camunda to the latest patch level

## Notice 29

**Publication Date: June 2nd, 2020**

**Product affected:**

Camunda Platform

**Impact:**

In the case where [variable-specific permissions](https://docs.camunda.org/manual/7.12/user-guide/process-engine/authorization-service/#default-read-variable-permissions) were enabled, it was possible for a user to access historic variable details having only the `READ_HISTORY` permission. The check for `READ_HISTORY_VARIABLE` was not enforced.

**How to determine if the installation is affected**

- Camunda Platform is used with enabled authorization check and enabled variable-specific permissions (configuration flag `enforceSpecificVariablePermission` set to `true`)
- An attacker is a known user in the system that has the `READ_HISTORY` permission on a process definition.

**Solution**

Camunda has provided the releases 7.13.0, 7.12.5, 7.11.12 which contain a fix.

## Notice 28

**Publication Date: April 6th, 2020**

**Product affected:**

Camunda Platform

**Impact:**

The version of Apache Tomcat shipped with the Camunda distributions for Tomcat and transitively pulled in by the Camunda Spring Boot starter was vulnerable to remote code execution:

- https://nvd.nist.gov/vuln/detail/CVE-2020-1938

**How to determine if the installation is affected**

- Camunda Platform Tomcat is used *or* Camunda Platform Spring Boot Starter is used
- The Tomcat AJP connector is enabled (this is the default configuration in Tomcat)
- An attacker is able to access the AJP endpoint

**Solution**

Camunda has provided the releases 7.13.0-alpha3, 7.12.4, 7.11.11, 7.10.17, Spring Boot Starter 3.4.2, Spring Boot Starter 3.3.8, Spring Boot Starter 3.2.10 which contain a fix.

Other solutions:

- Tomcat and Spring Boot can be updated independently of Camunda to the latest patch level
- The AJP connector in Tomcat can be disabled in the `server.xml` configuration file. See also https://tomcat.apache.org/tomcat-9.0-doc/security-howto.html.

## Notice 27

**Publication Date: April 6th, 2020**

**Product affected:**

Camunda Platform

**Impact:**

Camunda Optimize is a product module that uses a separate REST API to fetch data from the Camunda Platform runtime platform for export. Using this API, it was possible for a user to access history data of tenants they are not permitted to access.

**How to determine if the installation is affected**

- Camunda REST API is used.
- An attacker is a known user in the system that has full history read permission on decision and process definitions but not on tenants.

**Solution**

Camunda has provided the releases 7.13.0-alpha3, 7.12.4, 7.11.11, 7.10.17 which contain a fix.

## Notice 26

**Publication Date: March 3rd, 2020**

**Product affected:**

Camunda Platform

**Impact:**

When declaring a Maven dependency to a Camunda Platform artifact, it was possible that its dependencies would be resolved from a remote repository via HTTP protocol. HTTP is susceptible to man in the middle attacks that would allow an attacker to intercept the request and manipulate the delivered artifact, potentially leading to remote code execution in your build system. Details of this vulnerability can be found at https://medium.com/bugbountywriteup/want-to-take-over-the-java-ecosystem-all-you-need-is-a-mitm-1fc329d898fb.

**How to determine if the installation is affected**

- The Camunda artifacts are used as a dependency in your own Java project (e.g. Maven)
- The build attempts to resolve a dependency from the repository http://repository.springsource.com/maven/bundles/external
- An attacker is able to intercept this request

Note: For example, you are not affected by this problem if your company uses a mirror for all Maven artifacts and you access the mirror safely (e.g. via HTTPS).

**Solution**

Camunda has provided the releases 7.13.0-alpha2, 7.12.3, 7.11.10, 7.10.16 which contain a fix.

## Notice 25

**Publication Date: December 9th, 2019**

**Product affected:**

Camunda Platform

**Impact:**

Camunda Platform's APIs are susceptible to object deserialization vulnerabilities. If an attacker can submit a serialized variable of type Object, they can exploit so-called *serialization gadgets*, i.e. classes that run vulnerable code during deserialization. For details, see [OWASP's description of Deserialization of untrusted data](https://www.owasp.org/index.php/Deserialization_of_untrusted_data).

**How to determine if the installation is affected**

- Camunda REST API or web applications are used
- An attacker has access to the REST API or web applications to submit variables

**Solution**

Camunda has provided the releases v7.12.0, v7.11.7, v7.10.13 and 7.9.19 which contain a feature to whitelist allowed classes for object values.

We strongly recommend to activate whitelisting in any Camunda installation that is accessible by untrusted parties. See the user guide for details: https://docs.camunda.org/manual/7.12/user-guide/security/#variable-values-from-untrusted-sources

## Notice 24

**Publication Date: December 9th, 2019**

**Product affected:**

Camunda Platform

**Impact:**

A user could send an unlimited query to the Camunda REST API or web applications which loads the entire result data into main memory. This can exhaust the server's resources if the query result is large, resulting in a denial of service scenario.

**How to determine if the installation is affected**

- Camunda REST API or web applications are used
- An attacker has access and permissions to load a large number of Camunda entities (e.g. tasks)

**Solution**

Camunda has provided the releases v7.12.0, v7.11.7, v7.10.13 and 7.9.19 which contain a feature to enforce pagination of queries.

We strongly recommend to activate the pagination limit in any Camunda installation that is accessible by untrusted parties. See the user guide for details: https://docs.camunda.org/manual/7.12/user-guide/security/#maximum-results-limit-in-queries

## Notice 23

**Publication Date: December 9th, 2019**

**Product affected:**

Camunda Platform

**Impact:**

The version of Jackson shipped with the Camunda EAR for Websphere was vulnerable to object deserialization flaws. Details:

- https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&search_type=all&cpe_vendor=cpe%3A%2F%3Afasterxml&cpe_product=cpe%3A%2F%3A%3Ajackson-databind&cpe_version=cpe%3A%2F%3Afasterxml%3Ajackson-databind%3A2.6.3

**How to determine if the installation is affected**

- Camunda is used on IBM Websphere 8.5 or 9
- The Camunda EAR is installed
- An attacker is able to access the REST API or web applications and has permissions to submit process variables

**Solution**

Camunda has provided the releases v7.12.0, v7.11.7 and v7.10.13 which contain a fix.

## Notice 22

**Publication Date: December 9th, 2019**

**Product affected:**

Camunda Platform

**Impact:**

The login endpoint of the Camunda web applications (Cockpit, Tasklist, Admin) did not require a valid CSRF token. This allowed an attacker to trick a user to log into these applications without their knowing.

**How to determine if the installation is affected**

- An attacker cann access the Camunda web applications

**Solution**

Camunda has provided the releases v7.12.0, v7.11.5, v7.10.11 and 7.9.17, as well as Spring Boot Starter 3.4.0, 3.3.6, 3.2.8, 3.1.8, 3.0.8 which contain a fix.

## Notice 21

**Publication Date: November 4th, 2019**

**Product affected:**

Camunda Platform and Spring Boot Starter

**Impact:**

The version of Jackson used by Camunda Spin was vulnerable to object deserialization flaws. Details:

- https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&search_type=all&cpe_vendor=cpe%3A%2F%3Afasterxml&cpe_product=cpe%3A%2F%3A%3Ajackson-databind&cpe_version=cpe%3A%2F%3Afasterxml%3Ajackson-databind%3A2.9.9.3

**How to determine if the installation is affected**

- Camunda Spin is on the classpath
- An attacker is able to access the REST API or web applications and has permissions to submit process variables
- One of the following artifacts is on the classpath: `com.zaxxer:HikariCP`, `com.zaxxer:HikariCP-java6`, `commons-dbcp:commons-dbcp`, `p6spy:p6spy`, `org.ehcache:ehcache`, `log4j:apache-log4j-extra`

**Solution**

Camunda has provided the releases v7.11.5, v7.10.11, v7.9.17 and 7.12.0-alpha5 which contain a fix.

For users of the Camunda Spring Boot Starter, we recommend to explicitly override the version of `com.fasterxml.jackson.core:jackson-databind` to the latest.

**Update 9th of November**: For the Camunda Spring Boot Starter, Camunda has provided the releases 3.4.0, 3.3.5 and 3.2.7 which contain a fix.

## Notice 20

**Publication Date: November 4th, 2019**

**Product affected:**

Camunda Platform and Spring Boot Starter

**Impact:**

If a  user's password is incorrectly entered multiple times, the user account is locked for a period of time before another login attempt can be made. The error message in the Camunda web applications described this situation, confirming that the user exists. This behavior is a [username enumeration vulnerability](https://www.gnucitizen.org/blog/username-enumeration-vulnerabilities/), allowing an attacker to learn which user names are valid and focussing password cracking attempts accordingly.

**How to determine if the installation is affected**

- The Camunda Platform web applications (Cockpit, Tasklist, Admin) are used
- An attacker is able to access the applications' login screen
- Users are managed in the Camunda database tables (i.e. setups using LDAP-managed users are not affected)

**Solution**

Camunda has provided the releases v7.11.5, v7.10.11, v7.9.17 and 7.12.0-alpha5 which contain a fix.


## Notice 19

**Publication Date: September 30th, 2019**

**Product affected:**

Camunda Platform

**Impact:**

The version of Tomcat used by the Camunda Platform Tomcat distribution is subject to various vulnerabilities. Details:

- Camunda 7.11 with Tomcat 9.0.19: https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&search_type=all&cpe_vendor=cpe%3A%2F%3Aapache&cpe_product=cpe%3A%2F%3Aapache%3Atomcat&cpe_version=cpe%3A%2F%3Aapache%3Atomcat%3A9.0.19
- Camunda 7.10 with Tomcat 9.0.12: https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&search_type=all&cpe_vendor=cpe%3A%2F%3Aapache&cpe_product=cpe%3A%2F%3Aapache%3Atomcat&cpe_version=cpe%3A%2F%3Aapache%3Atomcat%3A9.0.12
- Camunda 7.9 with Tomcat 9.0.5: https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&search_type=all&cpe_vendor=cpe%3A%2F%3Aapache&cpe_product=cpe%3A%2F%3Aapache%3Atomcat&cpe_version=cpe%3A%2F%3Aapache%3Atomcat%3A9.0.5

**How to determine if the installation is affected**

- The Camunda Platform Tomcat distribution is used

**Solution**

Camunda has provided the releases v7.11.4, v7.10.10, v7.9.16 and 7.12.0-alpha4 which contain a fix.

In addition, users can update their Tomcat installation to the latest version.


## Notice 18

**Publication Date: September 2nd, 2019**

**Product affected:**

Camunda Platform and Spring Boot Starter

**Impact:**

The version of Jackson used by Camunda Spin was vulnerable to object deserialization flaws. Details:

- https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&search_type=all&cpe_vendor=cpe%3A%2F%3Afasterxml&cpe_product=cpe%3A%2F%3A%3Ajackson-databind&cpe_version=cpe%3A%2F%3Afasterxml%3Ajackson-databind%3A2.9.9.1

**How to determine if the installation is affected**

- Camunda Spin is on the classpath
- An attacker is able to access the REST API or web applications and has permissions to submit process variables
- One of the following artifacts is on the classpath: `net.sf.ehcache:ehcache`, `ch.qos.logback:logback-core`

**Solution**

Camunda has provided the releases v7.11.3, v7.10.9, v7.9.15 and 7.12.0-alpha3 which contain a fix.

For users of the Camunda Spring Boot Starter, we recommend to explicitly override the version of `com.fasterxml.jackson.core:jackson-databind` to the latest, as there currently is no Spring Boot release available yet that provides the latest Jackson version.

## Notice 17

**Publication Date: August 6th, 2019**

**Product affected:**

Camunda Platform

**Impact:**

Java's [Secure-Processing Feature](https://docs.oracle.com/javase/tutorial/jaxp/properties/backgnd.html) for XML documents was not activated in the process engine's XML parsers, meaning that no default resource limits were applied during parsing (e.g. regarding the number of attributes an XML element may have). With default JVM configurations, this allowed an attacker to deploy XML documents of arbitrary size as a denial-of-service attack.

**How to determine if the installation is affected**

- An attacker has access to a process deployment endpoint (e.g. REST API or Camunda web applications)
- An attacker is authorized to perform deployments

**Solution**

Camunda has provided the releases v7.11.2, v7.10.8, v7.9.14 and 7.12.0-alpha2 which contain a fix.

Note that with older versions, XML processing limits can already be enforced via system properties in the JVM, see https://docs.oracle.com/javase/tutorial/jaxp/limits/limits.html and https://docs.oracle.com/javase/tutorial/jaxp/properties/properties.html.

**Related Documentation**

* [Security Instructions for XML Processing](https://docs.camunda.org/manual/7.11/user-guide/security/#xml-security)

## Notice 16

**Publication Date: August 6th, 2019**

**Product affected:**

Camunda Platform

**Impact:**

In some cases of server-side exceptions in the Camunda REST API and Camunda Platform web applications, a stacktrace could be disclosed to the client. This allows an attacker to gain insights about the structure and source code of server-side components.

**How to determine if the installation is affected**

- Camunda Web Applications or REST API are used

**Solution**

Camunda has provided the releases v7.11.2, v7.10.8, v7.9.14 and 7.12.0-alpha2 which contain a fix.


## Notice 15

**Publication Date: August 6th, 2019**

**Product affected:**

Camunda Platform

**Impact:**

The version of dmn-js used by Camunda Platform was vulnerable to HTML Injection / Cross-site scripting flaws. Details:

- https://bpmn.io/blog/posts/2019-html-injection-vulnerabilities-fixed.html

**How to determine if the installation is affected**

- Camunda Cockpit and DMN Live Editing is used
- An attacker is able to trick a victim to paste crafted input into the DMN editor

**Solution**

Camunda has provided the releases v7.11.2, v7.10.8, v7.9.14 and 7.12.0-alpha2 which contain a fix.


## Notice 14

**Publication Date: August 6th, 2019**

**Product affected:**

Camunda Platform and Spring Boot Starter

**Impact:**

The version of Jackson used by Camunda Spin was vulnerable to object deserialization flaws. Details:

- https://nvd.nist.gov/vuln/search/results?form_type=Advanced&results_type=overview&search_type=all&cpe_vendor=cpe%3A%2F%3Afasterxml&cpe_product=cpe%3A%2F%3A%3Ajackson-databind&cpe_version=cpe%3A%2F%3Afasterxml%3Ajackson-databind%3A2.9.8

**How to determine if the installation is affected**

- Camunda Spin is on the classpath
- An attacker is able to access the REST API or web applications and has permissions to submit process variables
- One of the following artifacts is on the classpath: `mysql:mysql-connector-java` (8.0.14 or earlier), `org.jdom:jdom`, `org.jdom:jdom2`, `ch.qos.logback:logback-core`

**Solution**

Camunda has provided the releases v7.11.2, v7.10.8, v7.9.14 and 7.12.0-alpha2 which contain a fix.

For users of the Camunda Spring Boot Starter, we recommend to explicitly override the version of `com.fasterxml.jackson.core:jackson-databind` to the latest, as there currently is no Spring Boot release available yet that provides the latest Jackson version.


## Notice 13

**Publication Date: July 1st, 2019**

**Product affected:**

Camunda Platform and Spring Boot Starter

**Impact:**

Previous Camunda releases have no possibility to enable the cookie flags [Secure and HttpOnly](https://developer.mozilla.org/en-US/docs/Web/HTTP/Cookies#Secure_and_HttpOnly_cookies) for the session and CSRF cookies that the Camunda web applications use. This in itself is not a vulnerability, however can increase the impact of other vulnerabilities. For example in combination with a cross-site scripting vulnerability, the absence of those flags would allow an attacker to obtain a user's session id. We therefore recommend to apply the solution explained below.

**How to determine if the installation is affected**

- The Camunda web applications (Cockpit, Tasklist, Admin) are used

**Solution**

Camunda has provided the following releases which contain a fix:

- Camunda Platform 7.12.0-alpha1, 7.11.1, 7.10.7, 7.9.13
- Camunda Spring Boot Starter 3.3.2, 3.2.4, 3.1.4, 3.0.4

Please see the [Cookie Security documentation](https://docs.camunda.org/manual/7.11/webapps/shared-options/cookie-security/) for details and configuration required to activate both flags.

## Notice 12

**Publication Date: May 31st, 2019**

**Product affected:**

Camunda Platform Spring Boot Starter

**Impact:**

When using the Camunda web applications via the Camunda Spring Boot Starter, no CSRF token was required for modifying requests (HTTP POST, PUT, DELETE). This made Camunda's defense against [Cross-site request forgery](https://en.wikipedia.org/wiki/Cross-site_request_forgery) attacks ineffective.

**How to determine if the installation is affected**

- The application uses Camunda Spring Boot Starter
- The application uses the dependency `camunda-bpm-spring-boot-starter-webapp` or `camunda-bpm-spring-boot-starter-webapp-ee`

**Solution**

Camunda has provided the releases 3.3.1, 3.2.3, 3.1.3, 3.0.3 and 2.3.2 of the Spring Boot Starter which contain a fix. Note that for Spring Boot Starter 2.3 and 3.0, this requires to use Camunda versions >= 7.8.8 or >= 7.9.2.

## Notice 11

**Publication Date: May 31st, 2019**

**Product affected:**

Camunda Platform

**Impact:**

No authorizations were required to submit a license key or to read a license key's metadata (not the key itself) via Camunda Admin.

**How to determine if the installation is affected**

- Camunda Platform enterprise edition is used
- Camunda Admin is used

**Solution**

Camunda has provided the releases 7.11.0, 7.10.6, 7.9.12 and 7.8.14 which contain a fix.

## Notice 10

**Publication Date: May 31st, 2019**

**Product affected:**

Camunda Platform

**Impact:**

A [cross-site scripting](https://en.wikipedia.org/wiki/Cross-site_scripting) vulnerability in Camunda Tasklist was resolved that would allow an attacker to run arbitrary Javascript in the victim's browser.

**How to determine if the installation is affected**

- Camunda Tasklist is used
- One of the following applies:
  - An attacker is able to make a deployment
  - A BPMN process or CMMN case uses an expression in a user task name and an attacker can control the expression's result

**Solution**

Camunda has provided the releases 7.11.0, 7.10.6, 7.9.12 and 7.8.14 which contain a fix.

## Notice 9

**Publication Date: May 31st, 2019**

**Product affected:**

Camunda Platform

**Impact:**

A [cross-site scripting](https://en.wikipedia.org/wiki/Cross-site_scripting) vulnerability in Camunda Cockpit was resolved that would allow an attacker to run arbitrary Javascript in the victim's browser.

**How to determine if the installation is affected**

- Camunda Cockpit is used
- An attacker is able to deploy a BPMN process or CMMN case

**Solution**

Camunda has provided the releases 7.11.0, 7.10.6, 7.9.12 and 7.8.14 which contain a fix.

## Notice 8

**Publication Date: May 3rd, 2019**

Optimize stores a users session token in a cookie to maintain the session. While this approach simplifies user session handling, it is also vulnerable to [cross-site request forgery](https://en.wikipedia.org/wiki/Cross-site_request_forgery) attacks. To mitigate this problem, Optimize will set the [SameSite](https://www.owasp.org/index.php/SameSite) cookie flag to reduce the risk of cross-origin information leakage. Read all the details about the attack and how the cookie flag prevents it from happening in the article [Using the SameSite Cookie Attribute to Prevent CSRF Attacks](https://dzone.com/articles/using-the-same-site-cookie-attribute-to-prevent-cs).

Camunda has provided a fix ([OPT-2105](https://app.camunda.com/jira/browse/OPT-2105)) with the Optimize release v2.5.0, which will be release end of June 2019.

## Notice 7

**Publication Date: March 29th, 2019**

In the last months there have been several security audits, which revealed a couple of risks that could allow the theft of a user session in the Camunda extension Optimize. There a cookie is used to handle the user session and following problems were detected:

- The cookie _secure_ flag was not set: This is an option that can be set server-side to make sure that a cookie is only send if the connection is encrypted using HTTPS. Whenever the HTTP connection is disabled in Optimize, this flag is now set. The purpose is to prevent unauthorized access from other parties. Read more about that in the dedicated OWASP [SecureFlag](https://www.owasp.org/index.php/SecureFlag) guide.
- The cookie _httpOnly_ flag was not set: This is an option that prohibits the access through client side scripts if the browser supports this flag. As a result, an attacker cannot obtain the session from the cookie, even if a cross-site scripting (XSS) flaw is present. Read more about that in the dedicated OWASP [HttpOnly](https://www.owasp.org/index.php/HttpOnly) guide.
- The HTTP connection could not be disabled: HTTP is the protocol used to transfer data between the browser and the server. By design, HTTP does not encrypt the data which is being sent. This allows unauthorized third parties to intercept the communication (Man-in-the-middle attack) to gather data that is being passed between the two systems. This could among exposure of sensible data allow an attacker to steal the user session. Hence, it is crucial to be able to disable this insecure communication and use it only for testing. In production environments only HTTPS should be used.

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

The Camunda Platform has obtained a security fix related to XML eXternal Entity (XXE) Processing. A BPMN Model (XML) can be uploaded containing a reference to an external entity. When processed by a weakly configured XML parser, this attack may lead to the disclosure of confidential data, denial of service, server side request forgery etc.

**How to determine if the installation is affected**

There is a single usage scenario which is affected:

- When uploading a BPMN Model (XML) that contains a reference to an external entity, a `ProcessEngineException` will be thrown. The exception message will contain the content of the external entity (ex. `/etc/passwd`).

**Solution**

Camunda has provided the patches v7.10.0, v7.9.7, v7.8.12, v7.7.10 which provide the fix:

- [CAM-9285](https://app.camunda.com/jira/browse/CAM-9285): Prevention of External Entity Processing.
  This fixes the security vulnerability described [here](<https://www.owasp.org/index.php/XML_External_Entity_(XXE)_Processing>). Further configuration options are documented [here](https://docs.camunda.org/manual/latest/reference/deployment-descriptors/tags/process-engine/#configuration-properties).

## Notice 3

**Publication Date: September 19th, 2018**

The Camunda Platform has obtained security fixes related to the prevention of CSRF attacks, and support for providing _whitelist patterns_ for User, Group and Tenant IDs.

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

Camunda support is alerting customers to a potential risk with the Camunda Platform product. A vulnerability exists that can possibly allow an attacker to perform remote execution of code.

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

Camunda support is alerting customers to a potential risk with the Camunda Platform product. A vulnerability exists that can possibly allow an attacker to perform remote execution of code.

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
