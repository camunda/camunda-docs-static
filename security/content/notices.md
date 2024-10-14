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

## Notice 119

**Publication Date: October 14th, 2024**

**Product affected**

Camunda 7

**Impact**

The version of Apache Tomcat shipped with the Camunda Tomcat distribution, Camunda Run, and transitively pulled in by the Camunda Spring Boot starter had the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-38286

**How to determine if the installation is affected**

- Camunda 7 Tomcat is used or Camunda 7 Run is used or Camunda 7 Spring Boot Starter is used.
- See the NIST link above for detailed description of the circumstances required to exploit the vulnerability.

**Solution**

Camunda has provided the releases 7.19.15, 7.20.8, 7.21.4, 7.22.0-alpha5 which contain a fix.

## Notice 118

**Publication Date: October 7th, 2024**

**Product affected:**

Cawemo On-Premises

**Impact:**

The versions of `libcrypto3`, `libssl3`, and `openssl` shipped with `cawemo-restapi` were affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-6119

The version of `spring-webmvc` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-38816

The version of `path-to-regexp` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://github.com/pillarjs/path-to-regexp/security/advisories/GHSA-9wv6-86v2-598j

The version of `@sentry/browser` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://github.com/getsentry/sentry-javascript/security/advisories/GHSA-593m-55hh-j8gv

The version of `@cookie` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://github.com/jshttp/cookie/security/advisories/GHSA-pxg6-pf52-xh8x

The versions of `libcrypto3`, `libssl3`, and `openssl` shipped with `cawemo-websockets` were affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-6119

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.20 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.21 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 117

**Publication Date: September 16th, 2024**

**Product affected**

Camunda 7

**Impact**

The version of Apache Tomcat shipped with the Camunda Tomcat distribution, Camunda Run, and transitively pulled in by the Camunda Spring Boot starter had the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-34750

**How to determine if the installation is affected**

- Camunda 7 Tomcat is used or Camunda 7 Run is used or Camunda 7 Spring Boot Starter is used.
- See the NIST link above for detailed description of the circumstances required to exploit the vulnerability.

**Solution**

Camunda has provided the releases 7.22.0-alpha5, 7.21.4, 7.20.8, 7.19.15 which contain a fix.

## Notice 116

**Publication Date: August 30th, 2024**

**Product affected:**

Cawemo On-Premises

**Impact:**

The version of the Java runtime shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-21147

The version of `spring-security-core` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-38810

The version of `axios` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-39338

The version of `libcurl` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-7264

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.19 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.20 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 115

**Publication Date: August 6th, 2024**

**Product affected:**

Cawemo On-Premises

**Impact:**

The versions of `libcrypto3` and `libssl3` shipped with `cawemo-restapi`, `cawemo-webapp` and `cawemo-websockets` were affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-5535

The version of `openssl` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-5535

The version of `libcurl` shipped with `cawemo-websockets` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2024-6197
- https://nvd.nist.gov/vuln/detail/CVE-2024-6874

The version of `spring-web` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2016-1000027

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.18 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.19 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 114

**Publication Date: July 1st, 2024**

**Product affected**

Camunda 7

**Impact:**

The version of `angular-translate`, included in the Camunda web applications, had a cross-site scripting (XSS) vulnerability:

https://nvd.nist.gov/vuln/detail/CVE-2024-33665

**How to determine if the installation is affected**

- You use the Camunda 7 web applications.
- You use a custom plugin that introduces custom translation strings.
- An attacker can provide forged input to the custom plugin that passes it to the `angular-translate` library.

**Solution**

Camunda has provided the releases 7.22.0-alpha3, 7.21.3, 7.20.7, 7.19.14 which contain a fix.

## Notice 113

**Publication Date: July 1st, 2024**

**Product affected**

Camunda 7

**Impact**

The version of Apache Tomcat shipped with the Camunda Tomcat distribution, Camunda Run, and transitively pulled in by the Camunda Spring Boot starter had the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2024-23672
- https://nvd.nist.gov/vuln/detail/CVE-2024-24549

**How to determine if the installation is affected**

- Camunda 7 Tomcat is used or Camunda 7 Run is used or Camunda 7 Spring Boot Starter is used.
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities.

**Solution**

Camunda has provided the releases 7.22.0-alpha3, 7.21.3, 7.20.7, 7.19.14 which contain a fix.

## Notice 112

**Publication Date: June 28th, 2024**

**Product affected:**

Cawemo On-Premises

**Impact:**

The versions of `libcrypto3` and `libssl3` shipped with `cawemo-restapi`, `cawemo-webapp` and `cawemo-websockets` were affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-4603

The versions of `busybox`, `busybox-binsh` and `ssl_client` shipped with `cawemo-restapi`, `cawemo-webapp` and `cawemo-websockets` were affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-42363
- https://nvd.nist.gov/vuln/detail/CVE-2023-42364
- https://nvd.nist.gov/vuln/detail/CVE-2023-42365
- https://nvd.nist.gov/vuln/detail/CVE-2023-42366

The version of `undertow-core` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-6162

The version of `libxml2` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-34459

The version of `openssl` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-4603

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.17 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.18 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 111

**Publication Date: June 12th, 2024**

**Product affected:**

Camunda 7

**Impact:**

Camunda [Forms](https://docs.camunda.io/docs/guides/utilizing-forms/) contained a Regular Expression Denial of Service (ReDoS) vulnerability, which could render the page unresponsive.

**How to determine if the installation is affected**

- You are using Camunda [Forms](https://docs.camunda.io/docs/guides/utilizing-forms/).
- An attacker can deploy a specially crafted Camunda Form.

**Solution**

Camunda has provided the following releases, which contain a fix:
Camunda 7.19.13, 7.20.6, 7.21.2, 7.22.0-alpha2.

## Notice 110

**Publication Date: May 14th, 2024**

**Product affected:**

Camunda 7

**Impact:**

The version of the MySQL JDBC connector included in the Camunda 7 Docker images had a vulnerability:

https://nvd.nist.gov/vuln/detail/CVE-2023-22102

**How to determine if the installation is affected**

- The Camunda Platform 7 Docker containers are used.
- MySQL is used for the database connection.

**Solution**

Camunda has provided the following releases which contain a fix:
Camunda 7.19.12, 7.20.5, 7.21.1, 7.22.0-alpha1

## Notice 109

**Publication Date: May 13th, 2024**

**Product affected:**

Cawemo On-Premises

**Impact:**

The versions of `libcrypto3` and `libssl3` shipped with `cawemo-restapi`, `cawemo-webapp` and `cawemo-websockets` were affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-2511

The version of `undertow-core` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-1459

The version of `spring-web` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-22262

The version of `xnio-api` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-5685

The version of `formidable` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-29622

The version of `openssl` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-2511

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.16 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.17 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 108

**Publication Date: May 3rd, 2024**

**Product affected:**

Camunda 7

**Impact:**

The version of AngularJS, included in the Camunda web applications, had a backtracking vulnerability:

https://nvd.nist.gov/vuln/detail/CVE-2024-21490

**How to determine if the installation is affected**

- You use the Camunda 7 web applications.
- You use a custom plugin that utilizes the AngularJS `ng-srcset` directive.
- An attacker can provide forged input to the custom plugin that passes it to the `ng-srcset` directive.

**Solution**

Camunda has provided the following releases which contain a fix:
Camunda 7.19.12, 7.20.5, 7.21.0-alpha3.

## Notice 107

**Publication Date: May 3rd, 2024**

**Product affected:**

Camunda 7

**Impact:**

The version of the PostgreSQL JDBC driver used in the Camunda Platform 7 Docker images had a vulnerability:

https://nvd.nist.gov/vuln/detail/CVE-2024-1597

**How to determine if the installation is affected**

* You use the Camunda 7 Docker images.
* You connect to a PostgreSQL database.

**Solution**

Camunda has provided the following releases which contain a fix:
Camunda 7.19.12, 7.20.5, 7.21.0-alpha4

## Notice 106

**Publication Date: April 08th, 2024**

**Product affected:**

Cawemo On-Premises

**Impact:**

The version of `netty-coded-http` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-29025

The version of `spring-web` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-22259

The version of `spring-security-core` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-22257

The version of `c-ares` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-25629

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.15 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.16 releases for the `cawemo-restapi`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 105

**Publication Date: March 15th, 2024**

**Product affected:**

Cawemo On-Premises

**Impact:**

The version of `spring-web` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-22243

The version of `postgresql` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-1597

The version of `jose` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-28176

The version of `follow-redirects` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-28849

The version of `libxml2` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2024-25062

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.14 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.15 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 104

**Publication Date: March 1st, 2024**

**Product affected**

Camunda 7

**Impact**

The version of `follow-redirects`, included in the Camunda Run SwaggerUI had an Improper Input Validation vulnerability:

https://nvd.nist.gov/vuln/detail/CVE-2023-26159

**How to determine if the installation is affected**

You expose Camunda Run SwaggerUI publicly by operating it without the `--production` flag or in combination with the `--swaggerui` flag.

**Solution**

Camunda has provided the releases 7.21.0-alpha3, 7.20.4, 7.19.11, 7.18.15, which contain a fix.

## Notice 103

**Publication Date: February 12th, 2024**

**Product affected:**

Cawemo On-Premises

**Impact:**

The versions of `libcrypto3` and `libssl3` shipped with `cawemo-restapi` were affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-6129
- CVE-2023-6237

The versions of `libcrypto3` and `libssl3` shipped with `cawemo-webapp` were affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-6129
- CVE-2023-6237

The version of `follow-redirects` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-26159

The versions of `libcrypto3` and `libssl3` shipped with `cawemo-websockets` were affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-6129
- CVE-2023-6237


**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.12 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.13 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 102

**Publication Date: February 12th, 2024**

**Product affected**

Camunda 7

**Impact**

The version of Logback shipped with Camunda Run, Camunda RPA Bridge, and transitively pulled in by the Camunda Spring Boot Starter had a denial-of-service vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-6378

Logback versions 1.3.12 and 1.4.12 already tried to fix `CVE-2023-6378` but were still affected by:

- https://nvd.nist.gov/vuln/detail/CVE-2023-6481

The Camunda releases listed under the **Solution** section fix both CVEs `CVE-2023-6378` as well as `CVE-2023-6481`.

**How to determine if the installation is affected**

- Camunda RPA Bridge, Camunda Run or Camunda Spring Boot Starter is used **AND** the `logback-receiver` component is enabled and also reachable by the attacker.
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities.

**Solution**

Camunda has provided the releases 7.21.0-alpha3, 7.20.3, 7.19.10, 7.18.14, and RPA Bridge 1.1.11, which contain a fix.

## Notice 101

**Publication Date: January 3rd, 2024**

**Product affected:**

Cawemo On-Premises

**Impact:**

The versions of `ch.qos.logback:logback-classic` and `ch.qos.logback:logback-core` shipped with `cawemo-restapi` were affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-6378

The version of `ch.qos.logback:logback-core` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-6481

The version of `org.springframework.boot:spring-boot` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-34055

The version of `libcurl` shipped with `cawemo-websockets` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-46218
- https://nvd.nist.gov/vuln/detail/CVE-2023-46219


**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.11 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.12 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 100

**Publication Date: December 11th, 2023**

**Product affected**

Camunda Platform 7

**Impact**

The version of `axios`, included in the Camunda Run SwaggerUI, had a Cross-Site Request Forgery (CSRF) vulnerability:

https://nvd.nist.gov/vuln/detail/CVE-2023-45857

**How to determine if the installation is affected**

You expose Camunda Run SwaggerUI publicly by operating it without the `--production` flag or in combination with the `--swaggerui` flag.

**Solution**

Camunda has provided the releases 7.21.0-alpha2, 7.20.2, 7.19.9, 7.18.13 which contain a fix.

## Notice 99

**Publication Date: December 11th, 2023**

**Product affected**

Camunda Platform 7

**Impact**

Camunda Spring Boot Starter and Camunda Run had an [Insertion of Sensitive Information into Log File](https://cwe.mitre.org/data/definitions/532.html) vulnerability that allowed an attacker, for example, to read information about the admin user (user id, first name, last name, and email) which could lead to a targeted brute-force attack to guess the password of the admin user or to send phishing emails to the admin user.

**How to determine if the installation is affected**

* You use Camunda Spring Boot Starter or Camunda Run.
* Your application logs logging statements on severity `INFO`.
* An attacker has access to your application logs.

**Solution**

Camunda has provided the releases 7.21.0-alpha2, 7.20.2, 7.19.9, 7.18.13 which contain a fix.

## Notice 98

**Publication Date: November 14th, 2023**

**Product affected:**

Cawemo On-Premises

**Impact:**

The versions of `libcrypto3` and `libssl3` shipped with `cawemo-restapi`, `cawemo-webapp` and `cawemo-websockets` were affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-5363
- https://nvd.nist.gov/vuln/detail/CVE-2023-5678

The version of `openssl` shipped with `cawemo-websockets` was affected by the following vulnerabilities:
- https://nvd.nist.gov/vuln/detail/CVE-2023-5363
- https://nvd.nist.gov/vuln/detail/CVE-2023-5678

The version of `libcurl` shipped with `cawemo-websockets` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-38039
- https://nvd.nist.gov/vuln/detail/CVE-2023-38545
- https://nvd.nist.gov/vuln/detail/CVE-2023-38546

The version of `nghttp2-libs` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-44487

The version of `zod` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-4316

The version of `axios` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-45857

The version of `@babel/traverse` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-45133


**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.10 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.11 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 97

**Publication Date: November 13th, 2023**

**Product affected**

Camunda Platform 7

**Impact**

The version of Apache Tomcat shipped with the Camunda Tomcat distribution, Camunda Run, and transitively pulled in by the Camunda Spring Boot starter had the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-41080
- https://nvd.nist.gov/vuln/detail/CVE-2023-45648
- https://nvd.nist.gov/vuln/detail/CVE-2023-44487
- https://nvd.nist.gov/vuln/detail/CVE-2023-42795
- https://nvd.nist.gov/vuln/detail/CVE-2023-42794

**How to determine if the installation is affected**

- Camunda Platform Tomcat is used or Camunda Platform Run is used or Camunda Platform Spring Boot Starter is used.
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities.

**Solution**

Camunda has provided the releases 7.21.0-alpha1, 7.20.1, 7.19.8, 7.18.12, and RPA Bridge 1.1.10 which contain a fix.

## Notice 96

**Publication Date: October 3rd, 2023**

**Product affected:**

Camunda Desktop Modeler

**Impact:**

The version of `libwebp` shipped with Camunda Desktop Modeler was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-4863

**How to determine if the installation is affected**

- Camunda Modeler 5.15.1 or lower is used

**Solution**

Camunda has provided the following release which contains a fix:

- [Camunda Desktop Modeler 5.15.2](https://downloads.camunda.cloud/release/camunda-modeler/5.15.2/)

## Notice 95

**Publication Date: September 14th, 2023**

**Product affected:**

Cawemo On-Premises

**Impact:**

The version of `libcrypto3` and `libssl3` shipped with `cawemo-restapi`, `cawemo-webapp` and `cawemo-websockets` were affected by the following vulnerability:

- https://avd.aquasec.com/nvd/cve-2023-3817

The version of `busybox`, `busybox-binsh` and `ssl_client` shipped with `cawemo-restapi` and `cawemo-websockets` were affected by the following vulnerability:

- https://avd.aquasec.com/nvd/cve-2022-48174

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.9 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.10 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 94

**Publication Date: August 8th, 2023**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of Swagger UI included in Camunda Platform Run had a number of third-party library vulnerabilities:

* https://nvd.nist.gov/vuln/detail/CVE-2020-15168
* https://nvd.nist.gov/vuln/detail/CVE-2021-3664
* https://nvd.nist.gov/vuln/detail/CVE-2021-3801
* https://nvd.nist.gov/vuln/detail/CVE-2021-23648
* https://nvd.nist.gov/vuln/detail/CVE-2021-32723
* https://nvd.nist.gov/vuln/detail/CVE-2022-0235
* https://nvd.nist.gov/vuln/detail/CVE-2022-0512
* https://nvd.nist.gov/vuln/detail/CVE-2022-0639
* https://nvd.nist.gov/vuln/detail/CVE-2022-0686
* https://nvd.nist.gov/vuln/detail/CVE-2022-0691
* https://nvd.nist.gov/vuln/detail/CVE-2022-1365
* https://nvd.nist.gov/vuln/detail/CVE-2022-24999
* https://nvd.nist.gov/vuln/detail/CVE-2022-25927

**How to determine if the installation is affected**

- You use Camunda Platform Run
- Swagger UI is activated in your deployment of Run
- An attacker has access to Swagger UI or can influence a user of Swagger UI

**Solution**

Camunda has provided the releases 7.20.0-alpha4, 7.19.5, 7.18.10, 7.17.15 which contain a fix.

## Notice 93

**Publication Date: August 1st, 2023**

**Product affected:**

Cawemo On-Premises

**Impact:**

The version of `spring-security-config` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-34034

The versions of `libcrypto3` and `libssl3` shipped with `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` were affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-2975
- https://nvd.nist.gov/vuln/detail/CVE-2023-3446

The version of `openssl` shipped with `cawemo-websockets` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-2975
- https://nvd.nist.gov/vuln/detail/CVE-2023-3446

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.8 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.9 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 92

**Publication Date: June 27th, 2023**

**Product affected:**

Cawemo On-Premises

**Impact:**

The version of `netty-handler` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-34462

The version of `spring-boot-autoconfigure` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-20883

The version of `semver` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-25883

The versions of `libcrypto3` and `libssl3` shipped with `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` were affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-1255
- https://nvd.nist.gov/vuln/detail/CVE-2023-2650

The version of `react/http` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-26044

The version of `libcurl` shipped with `cawemo-websockets` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-28319
- https://nvd.nist.gov/vuln/detail/CVE-2023-28320
- https://nvd.nist.gov/vuln/detail/CVE-2023-28321
- https://nvd.nist.gov/vuln/detail/CVE-2023-28322

The versions of `ncurses-libs` and `ncurses-terminfo-base` shipped with `cawemo-websockets` were affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-29491

The version of `openssl` shipped with `cawemo-websockets` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-1255
- https://nvd.nist.gov/vuln/detail/CVE-2023-2650

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.7 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.8 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 91

**Publication Date: June 6th, 2023**

**Product affected:**

Camunda Platform 7

**Impact:**

The Camunda web applications had a [path traversal vulnerability](https://owasp.org/www-community/attacks/Path_Traversal) that allowed an attacker to read files from the JVM's classpath (e.g. classes, configuration files, BPMN models - depending on use) and the Camunda web applications' directory (e.g. web.xml deployment descriptor). In addition, on IBM Websphere 9, an attacker could read files from the file system that the system user running the JVM process could access.

**How to determine if the installation is affected**

- You use the Camunda web applications
- An attacker has access to the REST API endpoints exposed by the Camunda web application backend

**Solution**

Camunda has provided the releases 7.20.0-alpha2, 7.19.3, 7.18.9, 7.17.14 which contain a fix. Note that the fix introduces a change that [requires migrating Java-based web application plugins](https://docs.camunda.org/manual/7.19/update/patch-level/#7-19-2-to-7-19-3-7-18-8-to-7-18-9-7-17-13-to-7-17-14).

## Notice 90

**Publication Date: June 6th, 2023**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of AngularJS, included in the Camunda web applications, had a Regular Expression Denial of Service (ReDoS) vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-26116

**How to determine if the installation is affected**

- You use the Camunda web applications
- An attacker can make a victim provide forged input to the web application

**Solution**

Camunda has provided the releases 7.20.0-alpha2, 7.19.2, 7.18.8, 7.17.13 which contain a fix.

## Notice 89

**Publication Date: June 6th, 2023**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of Tomcat, included in the Camunda Tomcat distribution, had one vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-28708

**How to determine if the installation is affected**

- You use the Camunda Tomcat distribution
- You configure the servlet filter `RemoteIpFilter` in Tomcat and/or a deployed web application

**Solution**

Camunda has provided the releases 7.20.0-alpha2, 7.19.2, 7.18.8, 7.17.13 which contain a fix.

## Notice 88

**Publication Date: April 21st, 2023**

**Product affected:**

Cawemo On-Premises

**Impact:**

The version of `spring-core` shipped with `cawemo-restapi` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-20861
- https://nvd.nist.gov/vuln/detail/CVE-2023-20863

The version of `snakeyaml` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-1471

The version of `@sideway/formula` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-25166

The version of `guzzlehttp/psr7` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-29197

The versions of `libcrypto3` and `libssl3` shipped with `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` were affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2022-4203
- https://nvd.nist.gov/vuln/detail/CVE-2022-4304
- https://nvd.nist.gov/vuln/detail/CVE-2022-4450
- https://nvd.nist.gov/vuln/detail/CVE-2023-0215
- https://nvd.nist.gov/vuln/detail/CVE-2023-0216
- https://nvd.nist.gov/vuln/detail/CVE-2023-0217
- https://nvd.nist.gov/vuln/detail/CVE-2023-0286
- https://nvd.nist.gov/vuln/detail/CVE-2023-0401
- https://nvd.nist.gov/vuln/detail/CVE-2023-0464
- https://nvd.nist.gov/vuln/detail/CVE-2023-0465
- https://nvd.nist.gov/vuln/detail/CVE-2023-0466

The version of `libcurl` shipped with `cawemo-websockets` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-23914
- https://nvd.nist.gov/vuln/detail/CVE-2023-23915
- https://nvd.nist.gov/vuln/detail/CVE-2023-23916
- https://nvd.nist.gov/vuln/detail/CVE-2023-27533
- https://nvd.nist.gov/vuln/detail/CVE-2023-27534
- https://nvd.nist.gov/vuln/detail/CVE-2023-27535
- https://nvd.nist.gov/vuln/detail/CVE-2023-27536
- https://nvd.nist.gov/vuln/detail/CVE-2023-27537
- https://nvd.nist.gov/vuln/detail/CVE-2023-27538

The version of `libxml2` shipped with `cawemo-websockets` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2023-28484
- https://nvd.nist.gov/vuln/detail/CVE-2023-29469

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.6 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.7 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 87

**Publication Date: April 11th, 2023**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of the Quarkus Dev UI, part of Camunda's supported version of the Quarkus framework, had two vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2022-4116
- https://nvd.nist.gov/vuln/detail/CVE-2022-4147

**How to determine if the installation is affected**

- You use the Camunda Quarkus extension
- You use the [Quarkus Dev UI](https://quarkus.io/guides/dev-ui)

**Solution**

Camunda has provided the release 7.19.0 which contains a fix.

## Notice 86

**Publication Date: March 29th, 2023**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of Apache Tomcat shipped with the Camunda Tomcat distribution, Camunda Run, and transitively pulled in by the Camunda Spring Boot starter had a vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2023-24998

**How to determine if the installation is affected**

- Camunda Platform Tomcat is used *or* Camunda Platform Run is used *or* Camunda Platform Spring Boot Starter is used
- See the NIST link above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided the releases 7.19.0-alpha4, 7.18.6, 7.17.11, 7.16.18 which contain a fix.

Other solutions:

- Tomcat and Spring Boot can be updated independently of Camunda to the latest patch level

## Notice 85

**Publication Date: March 29th, 2023**

**Product affected:**

Camunda Platform 7

**Impact:**

In previous versions of Camunda, it was possible that a user remained logged in to the web applications (Cockpit, Tasklist, Admin) after their account was deleted.

**How to determine if the installation is affected**

- You use the Camunda web applications (Cockpit, Tasklist, Admin)
- The attacker is an authenticated user of the system

**Solution**

Camunda has provided the releases 7.19.0-alpha5, 7.18.6, 7.17.11, 7.16.18 which contain a fix.

You can find details on the solution and how to configure it in [our security guide](https://docs.camunda.org/manual/7.18/user-guide/security/#authentication-cache).

## Notice 84

**Publication Date: March 14th, 2023**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of Jackson shipped with the Camunda distributions had two vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2022-42003
- https://nvd.nist.gov/vuln/detail/CVE-2022-42004

**How to determine if the installation is affected**

- You use a Camunda installation with variables of type `json` or object variables that are serialized as JSON
- You use a custom `DataFormatConfigurator` that activates the deserialization feature `UNWRAP_SINGLE_VALUE_ARRAYS` on the Jackson ObjectMapper
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided the releases 7.19.0-alpha4, 7.18.5, 7.17.10, 7.16.17 which contain a fix.

## Notice 83

**Publication Date: February 14th, 2023**

**Product affected:**

Camunda Platform 7

**Impact:**

The Camunda Spring Boot starter and Camunda Run could write the hashed password of the administrator user to the application log on startup.

**How to determine if the installation is affected**

- Camunda Spring Boot starter *or* Camunda Run is used
- The configuration property `camunda.bpm.admin-user.id` or `camunda.bpm.admin-user.password` is used

**Solution**

Camunda has provided the releases 7.19.0-alpha3, 7.18.3, 7.17.9, 7.16.16 which contain a fix.

## Notice 82

**Publication Date: February 14th, 2023**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of Apache Tomcat shipped with the Camunda distributions, RPA Bridge, and transitively pulled in by the Camunda Spring Boot starter had three vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2021-43980
- https://nvd.nist.gov/vuln/detail/CVE-2022-42252
- https://nvd.nist.gov/vuln/detail/CVE-2022-45143

**How to determine if the installation is affected**

- Camunda Platform Tomcat is used *or* Camunda Platform Run is used *or* Camunda Platform Spring Boot Starter *or* Camunda RPA Bridge is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided the releases 7.19.0-alpha3, 7.18.2, 7.17.8, 7.16.15, RPA Bridge 1.1.9 which contain a fix.

Other solutions:

- Tomcat and Spring Boot can be updated independently of Camunda to the latest patch level

## Notice 81

**Publication Date: February 8th, 2023**

**Product affected:**

Cawemo On-Premises

**Impact:**

The version of `io.netty:netty-codec-http` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-41915

The version of `postgresql` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-41946

The version of `json5` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-46175

The version of `qs` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-24999

The version of `symfony/http-kernel` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-24894

The version of `libcurl` shipped with `cawemo-websockets` was affected by the following vulnerabilities:

- https://avd.aquasec.com/nvd/cve-2022-43551
- https://avd.aquasec.com/nvd/cve-2022-43552

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.5 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.6 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 80

**Publication Date: December 15th, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of Scala shipped with the FEEL engine in Camunda Platform 7 was vulnerable to an object deserialization flaw. Details:

* https://nvd.nist.gov/vuln/detail/CVE-2022-36944

**How to determine if the installation is affected**

* The engine configuration property `javaSerializationFormatEnabled` is set to `true` (default `false`)
* An attacker is able to access the REST API or web applications and has permissions to submit process variables

**Solution**

Camunda has provided the releases 7.19.0-alpha2, 7.18.1, 7.17.7, and 7.16.14 which contain a fix.

## Notice 79

**Publication Date: December 1st, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of the Got library used by the Javascript external task client was vulnerable to a redirect attack. Details:

* https://nvd.nist.gov/vuln/detail/CVE-2022-33987

**How to determine if the installation is affected**

* You use [camunda-external-task-client-js](https://github.com/camunda/camunda-external-task-client-js)
* An attacker is able modify the response of a HTTP request issued by the external task client

**Solution**

Camunda has provided the releases 2.3.1 and 2.2.1 of the External Task Client Javascript which contain a fix.

## Notice 78

**Publication Date: November 17th, 2022**

**Product affected:**

Cawemo On-Premises

**Impact:**

The version of `jackson-databind` shipped with `cawemo-restapi` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2022-42003
- https://nvd.nist.gov/vuln/detail/CVE-2022-42004

The version of `spring-security-core` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-31692

The version of `undertow-core` shipped with `cawemo-restapi` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2022-1259
- https://nvd.nist.gov/vuln/detail/CVE-2022-2764

The version of `deep-object-diff` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-41713

The version of `minimatch` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-3517

The version of `react/http` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-36032

The version of `libcurl` shipped with `cawemo-websockets` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2022-42915
- https://nvd.nist.gov/vuln/detail/CVE-2022-42916

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.4 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.5 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 77

**Publication Date: October 12th, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The H2 console application included in the Camunda Tomcat and Wildfly distributions was vulnerable to remote code execution.

**How to determine if the installation is affected**

* You use the Camunda Tomcat or Wildfly distribution
* An attacker can make a localhost connection to the H2 console application (note that the H2 console application refuses remote requests)

**Solution**

Camunda has provided the following releases which contain a fix:

* Camunda Platform 7.18.0, 7.17.6, 7.16.13, and 7.15.19

As an alternative solution, you can remove the h2 web application from your Tomcat or Wildfly server.

## Notice 76

**Publication Date: September 15th, 2022**

**Product affected:**

Cawemo On-Premises

**Impact:**

The version of `postgresql` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-31197

The version of `snakeyaml` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-38752

The version of `undertow-core` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-2053

The versions of `libcrypto1.1`, and `libssl1.1` shipped with `cawemo-restapi` were affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-2097

The version of `zlib` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-37434

The version of `moment` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-31129

The version of `passport` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-25896

The versions of `libcrypto1.1`, and `libssl1.1` shipped with `cawemo-webapp` were affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-2097

The version of `zlib` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-37434

The version of `guzzlehttp/guzzle` shipped with `cawemo-websockets` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2022-31042
- https://nvd.nist.gov/vuln/detail/CVE-2022-31043
- https://nvd.nist.gov/vuln/detail/CVE-2022-31091
- https://nvd.nist.gov/vuln/detail/CVE-2022-31090

The version of `busybox` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-30065

The versions of `openssl`, `libcrypto1.1`, and `libssl1.1` shipped with `cawemo-websockets` were affected by the
following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-2097

The version of `libcurl` shipped with `cawemo-websockets` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2022-32205
- https://nvd.nist.gov/vuln/detail/CVE-2022-32206
- https://nvd.nist.gov/vuln/detail/CVE-2022-32207
- https://nvd.nist.gov/vuln/detail/CVE-2022-32208
- https://nvd.nist.gov/vuln/detail/CVE-2022-35252

The version of `libxml2` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-3209

The version of `ssl_client` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-30065

The version of `zlib` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-37434

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.3 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.4 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 75

**Publication Date: August 9th, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The H2 console application included in the Camunda Tomcat and Wildfly distributions was vulnerable to remote code execution.

**How to determine if the installation is affected**

* You use the Camunda Tomcat or Wildfly distribution
* An attacker can make a localhost connection to the H2 console application (note that the H2 console application refuses remote requests)

**Solution**

Camunda has provided the following releases which contain a fix:

* Camunda Platform 7.18.0-alpha4 and 7.17.3

As an alternative solution, you can remove the h2 web application from your Tomcat or Wildfly server.

## Notice 74

**Publication Date: August 9th, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The Docker images for Camunda Platform 7 contained system libraries with reported vulnerabilities.

libcurl:

* https://nvd.nist.gov/vuln/detail/CVE-2022-32206

**How to determine if the installation is affected**

* You use the Camunda Docker images
* Due to the low-level nature of these vulnerabilities, we cannot reliably assess if Camunda installations are practically affected. We generally recommend to update for this reason.

**Solution**

Camunda has provided the following releases which contain a fix:

* Camunda Platform 7.18.0-alpha4, 7.17.3, 7.16.10, and 7.15.16


## Notice 73

**Publication Date: June 2nd, 2022**

**Product affected:**

Cawemo On-Premises

**Impact:**

The version of `async` shipped with `cawemo-webapp` was affected by the
following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2021-43138

The version of `moment` shipped with `cawemo-webapp` was affected by the
following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-24785

The version of `netty-codec-http` shipped with `cawemo-restapi` was affected by the
following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-24823

The version of `spring-security-core` shipped with `cawemo-restapi` was affected by the
following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2022-22978
- https://nvd.nist.gov/vuln/detail/CVE-2022-22976

The version of `spring-core` shipped with `cawemo-restapi` was affected by the
following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2022-22970
- https://nvd.nist.gov/vuln/detail/CVE-2022-22971
- https://nvd.nist.gov/vuln/detail/CVE-2022-22968

The version of `libcurl` shipped with `cawemo-websockets` was affected by the
following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2022-22576
- https://nvd.nist.gov/vuln/detail/CVE-2022-27774
- https://nvd.nist.gov/vuln/detail/CVE-2022-27776
- https://nvd.nist.gov/vuln/detail/CVE-2022-27775

The version of `libxml2` shipped with `cawemo-websockets` was affected by the
following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-29824

The version of `xz-libs` shipped with `cawemo-websockets` was affected by the
following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-1271

The version of `guzzlehttp/guzzle` shipped with `cawemo-websockets` was affected by the
following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-29248

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.2 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.3 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images which contain fixes for the above-mentioned CVEs.

## Notice 72

**Publication Date: May 31st, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of Jackson included in Camunda Platform 7 was vulnerable to denial of service attacks. Details:

- https://nvd.nist.gov/vuln/detail/CVE-2020-36518

**How to determine if the installation is affected**

- One of the following modules is used:
  - Web applications
  - REST API
  - Camunda Spin
- An attacker can submit a very large JSON payload to any of the modules' APIs

**Solution**

Camunda has provided the releases 7.18.0-alpha1, 7.17.2, 7.16.9, 7.15.15 which contain a fix.

## Notice 71

**Publication Date: May 31st, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of Groovy included in the Camunda Platform 7 Run, Tomcat, Weblogic,  Websphere, Wildfly distributions had a local privilege escalation vulnerability. Details:

- https://nvd.nist.gov/vuln/detail/CVE-2021-20289

**How to determine if the installation is affected**

- One of the Camunda Platform 7 Run, Tomcat, Weblogic,  Websphere, Wildfly distributions is used
- An attacker can make control the content of a Groovy script in a process

**Solution**

Camunda has provided the releases 7.18.0-alpha1, 7.17.2, 7.16.9, 7.15.15 which contain a fix.

## Notice 70

**Publication Date: May 10th, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of Resteasy used by the Camunda Platform 7 REST API and web applications had an information disclosure vulnerability. Details:

- https://nvd.nist.gov/vuln/detail/CVE-2021-20289

**How to determine if the installation is affected**

- The Camunda Platform 7 Tomcat distribution is used
- An attacker can make requests to the REST API or web application endpoints

**Solution**

Camunda has provided the releases 7.18.0-alpha1, 7.17.1, 7.16.8, 7.15.14 which contain a fix.

## Notice 69

**Publication Date: May 10th, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of the MySQL JDBC connector included in the Camunda Platform 7 Docker images had two known vulnerabilities. Details:

- https://nvd.nist.gov/vuln/detail/CVE-2021-2471
- https://nvd.nist.gov/vuln/detail/CVE-2022-21363

**How to determine if the installation is affected**

- The Camunda Platform 7 Docker containers are used
- MySQL is used for the database connection

**Solution**

Camunda has provided the releases 7.18.0-alpha1, 7.17.1, 7.16.8, 7.15.14 which contain a fix.

## Notice 68

**Publication Date: May 10th, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of the Spring Framework used by various Camunda components was vulnerable to remote code execution attacks. This vulnerability is known as *Spring4Shell*. Details:

- https://nvd.nist.gov/vuln/detail/CVE-2022-22965
- https://spring.io/blog/2022/03/31/spring-framework-rce-early-announcement

**How to determine if the installation is affected**

- Camunda Platform 7 is not directly affected by this vulnerability (see our [forum announcement](https://forum.camunda.io/t/spring-remote-code-execution-rce-vulnerability-spring4shell/33848)). We are making this announcement due to the high popularity of the vulnerability.

**Solution**

Camunda has provided the releases 7.18.0-alpha1, 7.17.1, 7.16.8, 7.15.14, 7.14.20, RPA Bridge 1.1.7 that update Spring to a version that is not vulnerable.

## Notice 67

**Publication Date: May 10th, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of Apache HTTP Client used by the Java external task client was vulnerable to an attack that a malformed request URL was interpreted incorrectly, which could lead the client to make a request against a different host. Details:

- https://nvd.nist.gov/vuln/detail/CVE-2020-13956

**How to determine if the installation is affected**

- The Java external task client is used
- An attacker can manipulate the request URL

**Solution**

Camunda has provided the releases 7.18.0-alpha1, 7.17.1, 7.16.8, 7.15.14 which contain a fix.

## Notice 66

**Publication Date: May 2nd, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of the Spring Framework used in Camunda Platform 7 was vulnerable to log entry insertion:

* https://nvd.nist.gov/vuln/detail/CVE-2021-22096
* https://nvd.nist.gov/vuln/detail/CVE-2021-22060

**How to determine if the installation is affected**

* You use any of the following modules:
  * Standalone web applications
  * Weblogic integration
  * Websphere integration
  * RPA Bridge

**Solution**

Camunda has provided the following releases which contain a fix:

* Camunda Platform 7.17.0, 7.16.6, 7.15.12, and 7.14.18
* RPA Bridge 1.1.6

## Notice 65

**Publication Date: April 7th, 2022**

**Product affected:**

Cawemo On-Premises

**Impact:**

The version of `spring-webmvc` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-22965

However, as of now, we were not able to identify a possible exploit of this vulnerability in Cawemo via the particular
exploit described in the [official blog post](https://spring.io/blog/2022/03/31/spring-framework-rce-early-announcement).

At least two of the prerequisites do not apply to Cawemo: "Apache Tomcat as the Servlet container" and "Packaged as a
traditional WAR (in contrast to a Spring Boot executable jar)" (Cawemo is packaged as an executable jar with an embedded
Undertow).

Nevertheless, we updated Cawemo to Spring Boot 2.6.6 / Spring MVC 5.3.18 (which includes a fix for the CVE).

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.1 or lower is used
- See the linked blog post above for a detailed description of the circumstances required to exploit the vulnerability

**Solution**

Camunda has provided the 1.9.2 release for the `cawemo-restapi` Docker image which contains a fix.

## Notice 64

**Publication Date: April 7th, 2022**

**Product affected:**

Cawemo On-Premises

**Impact:**

The version of `busybox` shipped with `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` was affected by the
following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-28391

The version of `openssl` shipped with `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` was affected by the
following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-0778

The version of `zlib` shipped with `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` was affected by the
following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2018-25032

The version of `jackson-databind` shipped with `cawemo-restapi` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2020-36518

The version of `postgresql` shipped with `cawemo-restapi` was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2022-21724
- https://nvd.nist.gov/vuln/detail/CVE-2022-26520

The version of `ansi-regex` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2021-3807

The version of `minimist` shipped with `cawemo-webapp` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2021-44906

The version of `libxml2` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-23308

The version of `guzzlehttp/psr7` shipped with `cawemo-websockets` was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-24775

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.1 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.2 releases for the `cawemo-restapi`, `cawemo-webapp`, and `cawemo-websockets` Docker images
which contain fixes for the above-mentioned CVEs.

## Notice 63

**Publication Date: April 1st, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of the PostgreSQL JDBC driver used in the Camunda Platform 7 Docker images had multiple vulnerabilities:

* https://nvd.nist.gov/vuln/detail/CVE-2018-10936
* https://nvd.nist.gov/vuln/detail/CVE-2020-13692
* https://nvd.nist.gov/vuln/detail/CVE-2022-21724

**How to determine if the installation is affected**

* You use the Camunda Docker images
* You connect to a PostgreSQL database

**Solution**

Camunda has provided the following releases which contain a fix:

* Camunda Platform 7.17.0-alpha5, 7.16.7, 7.15.13, and 7.14.19

## Notice 62

**Publication Date: April 1st, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of Apache Tomcat shipped with the Camunda distributions, RPA Bridge, and transitively pulled in by the Camunda Spring Boot starter had two vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2021-42340
- https://nvd.nist.gov/vuln/detail/CVE-2022-23181

**How to determine if the installation is affected**

- Camunda Platform Tomcat is used *or* Camunda Platform Run is used *or* Camunda Platform Spring Boot Starter *or* Camunda RPA Bridge is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided the releases 7.17.0-alpha6, 7.16.7, 7.15.13, 7.14.19, RPA Bridge 1.1.6 which contain a fix.

Other solutions:

- Tomcat and Spring Boot can be updated independently of Camunda to the latest patch level

## Notice 61

**Publication Date: April 1st, 2022 (updated April 11th, 2022)**

**Product affected:**

Camunda Platform 7

**Impact:**

The Docker images for Camunda Platform 7 contained system libraries with reported vulnerabilities.

libexpat:

* https://nvd.nist.gov/vuln/detail/CVE-2022-25235
* https://nvd.nist.gov/vuln/detail/CVE-2022-25236
* https://nvd.nist.gov/vuln/detail/CVE-2022-25313
* https://nvd.nist.gov/vuln/detail/CVE-2022-25314
* https://nvd.nist.gov/vuln/detail/CVE-2022-25315
* https://nvd.nist.gov/vuln/detail/CVE-2022-23852
* https://nvd.nist.gov/vuln/detail/CVE-2022-23990
* https://nvd.nist.gov/vuln/detail/CVE-2021-45960
* https://nvd.nist.gov/vuln/detail/CVE-2021-46143
* https://nvd.nist.gov/vuln/detail/CVE-2022-22822
* https://nvd.nist.gov/vuln/detail/CVE-2022-22823
* https://nvd.nist.gov/vuln/detail/CVE-2022-22824
* https://nvd.nist.gov/vuln/detail/CVE-2022-22825
* https://nvd.nist.gov/vuln/detail/CVE-2022-22826
* https://nvd.nist.gov/vuln/detail/CVE-2022-22827

openssl:

* https://nvd.nist.gov/vuln/detail/CVE-2022-0778

libxml2:

* https://nvd.nist.gov/vuln/detail/CVE-2022-23308

**How to determine if the installation is affected**

* You use the Camunda Docker images
* Due to the low-level nature of these vulnerabilities, we cannot reliably assess if Camunda installations are practically affected. We generally recommend to update for this reason.

**Solution**

Camunda has provided the following releases which contain a fix:

* Camunda Platform 7.17.0-alpha6, 7.16.7, 7.15.13, and 7.14.19


## Notice 60

**Publication Date: March 9th, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The Tomcat and Wildfly distributions include the H2 console web application that is vulnerable to remote code execution attacks.

**How to determine if the installation is affected**

* You use either the Tomcat or Wildfly distribution
* An attacker can access the h2 console path (e.g. `https://<host>/h2` by default)
* Note that this is independent if h2 is actually used as the Camunda database

**Solution**

Camunda has provided the following releases which contain a fix, as of which the h2 console is only accessible for localhost connections:

* Camunda Platform 7.17.0-alpha5, 7.16.6, 7.15.12, and 7.14.18

As an alternative solution on lower versions, you can remove the h2 web application from the application server.

## Notice 59

**Publication Date: March 9th, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

The version of Jackson used by Camunda Platform 7 was vulnerable to Denial of Service attacks.

**How to determine if the installation is affected**

* You use the Camunda Platform 7 REST API
* An attacker is able to submit process variables
* The Java serialization format for variables is enabled

**Solution**

Camunda has provided the following releases which contain a fix:

* Camunda Platform 7.17.0-alpha5, 7.16.6, 7.15.12, and 7.14.18

## Notice 58

**Publication Date: March 2nd, 2022**

**Product affected:**

Cawemo On-Premises

**Impact:**

The version of netty-tcnative-classes shipped with cawemo-restapi was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2021-43797
- https://nvd.nist.gov/vuln/detail/CVE-2019-16869
- https://nvd.nist.gov/vuln/detail/CVE-2015-2156
- https://nvd.nist.gov/vuln/detail/CVE-2021-37136
- https://nvd.nist.gov/vuln/detail/CVE-2014-3488
- https://nvd.nist.gov/vuln/detail/CVE-2021-37137
- https://nvd.nist.gov/vuln/detail/CVE-2019-20445
- https://nvd.nist.gov/vuln/detail/CVE-2019-20444
- https://nvd.nist.gov/vuln/detail/CVE-2021-21295
- https://nvd.nist.gov/vuln/detail/CVE-2021-21409
- https://nvd.nist.gov/vuln/detail/CVE-2021-21290

The version of min-dash shipped with cawemo-webapp was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2021-23460

The version of node-fetch shipped with cawemo-webapp was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-0235

The version of follow-redirects shipped with cawemo-webapp was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2022-0155

**How to determine if the installation is affected**

- Cawemo On-Premises 1.9.0 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.9.1 releases for the cawemo-restapi and cawemo-webapp Docker images which contain fixes for the above-mentioned CVEs.

## Notice 57

**Publication Date: February 8th, 2022**

**Product affected:**

Camunda Platform 7

**Impact:**

When connected to LDAP, Camunda Platform Run logged sensitive LDAP connection configuration options during startup.

**How to determine if the installation is affected**

* You use Camunda Platform Run
* You connect Camunda Platform Run to LDAP for user management
* An attacker has access to the log output

**Solution**

Camunda has provided the following releases which contain a fix:

* Camunda Platform 7.17.0-alpha4, 7.16.5, 7.15.11, and 7.14.17

## Notice 56

**Publication Date: January 21th, 2022**

**Product affected:**

Camunda Run, Camunda RPA Bridge, Camunda Optimize, Cawemo, IAM

**Impact:**

Camunda Run, Camunda RPA Bridge, Camunda Optimize, Cawemo, and IAM bundle log4j libraries for which the following CVE
has been published:

* https://nvd.nist.gov/vuln/detail/CVE-2021-44832

Similar to the [security notice 54](#notice-54) on Dec 23rd, 2021, **the products do not bundle the log4j-core library**
which contains the vulnerability referred to by the CVE. As a result, Camunda does not consider Camunda Run,
Camunda RPA Bridge, Camunda Optimize, Cawemo, or IAM to be affected by the vulnerability.

Still, Camunda recommends applying fixes as mentioned in Solutions below.

**How to determine if the installation is affected**

You are using Camunda Run, Camunda RPA Bridge, Camunda Optimize, Cawemo, or IAM.

**Solution**

Camunda has provided the following releases which contain a fix:

* Camunda Platform 7.17.0-alpha3, 7.16.5, 7.15.11, and 7.14.17
* Camunda RPA Bridge 1.1.5
* Camunda Optimize 3.7.0
* Cawemo 1.9.0
* IAM 1.1.12


## Notice 55

**Publication Date: January 14th, 2022**

**Product affected:**

Camunda Platform

**Impact:**

Camunda Spin was vulnerable to XML external entity (XXE) attacks when XML variables were used.

**How to determine if the installation is affected**

- Camunda Spin is on the classpath
  - Camunda distributions are used (e.g. Run, Tomcat, Wildfly)
  - Spin is used as a project dependency
- An attacker is able to access the REST API or web applications and has permissions to submit process variables

**Solution**

Camunda has provided the releases 7.17.0-alpha3, 7.16.4, 7.15.10, 7.14.16 which contain a fix.


## Notice 54

**Publication Date: December 23rd, 2021**

**Product components affected:**

Camunda Run, Camunda RPA Bridge, Camunda Optimize, Cawemo, IAM

**Impact:**

Camunda Run, Camunda RPA Bridge, Camunda Optimize, Cawemo, and IAM bundle log4j libraries for which the following CVE
has been published:

* https://nvd.nist.gov/vuln/detail/CVE-2021-45105

Similar to the [security notice 52](#notice-52) on Dec 17th, 2021, **the products do not bundle the log4j-core library**
which contains the vulnerability referred to by the CVE. As a result, Camunda does not consider Camunda Run,
Camunda RPA Bridge, Camunda Optimize, Cawemo, or IAM to be affected by the vulnerability.

Still, Camunda recommends applying fixes as mentioned in Solutions below.

**How to determine if the installation is affected**

You are using Camunda Run, Camunda RPA Bridge, Camunda Optimize, Cawemo, or IAM.

**Solution**

Camunda has provided the following releases which contain a fix:

* Camunda Automation Platform 7.17.0-alpha3, 7.16.4, 7.15.10, and 7.14.16
* Camunda RPA Bridge 1.1.4
* Camunda Optimize 3.6.5
* Cawemo 1.8.4
* IAM 1.1.11


## Notice 53

**Publication Date: December 21st, 2021**

**Product affected**

Cawemo On-Premises

**Impact**

The version of `netty-codec-http` shipped with `cawemo-restapi` was affected by the following vulnerability:

* https://nvd.nist.gov/vuln/detail/CVE-2021-43797

The version of `laravel/framework` shipped with `cawemo-websockets` was affected by the following vulnerability:

* https://nvd.nist.gov/vuln/detail/CVE-2021-43808

**How to determine if the installation is affected**

* Cawemo On-Premises 1.8.3 or lower is used.
* See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.8.4 releases for the `cawemo-restapi` and `cawemo-websockets` Docker images which contain fixes
for the above-mentioned CVEs.


## Notice 52

**Publication Date: December 17th, 2021**

**Product components affected**

Camunda Run, Camunda RPA Bridge, Camunda Optimize, Cawemo, IAM.

**Impact**

Camunda Run, Camunda RPA Bridge, and Camunda Optimize and IAM bundle log4j libraries for which the following CVEs have been published:

* https://nvd.nist.gov/vuln/detail/CVE-2021-44228
* https://nvd.nist.gov/vuln/detail/CVE-2021-45046

Specifically, the products bundle log4j-api and log4j-to-slf4j. However, **the products do not bundle the log4j-core
library** which contains the vulnerability referred to by the CVE. As a result, Camunda does not consider Camunda Run,
Camunda RPA Bridge, Camunda Optimize, Cawemo, or IAM to be affected by the vulnerability.

If you make use of any Camunda Optimize Demo Distribution, be aware that the bundled Elasticsearch is also affected by
this CVE. However, according to Elastic no remote code execution is possible on Elasticsearch nodes, see the [Elastic Security Announcement](https://discuss.elastic.co/t/apache-log4j2-remote-code-execution-rce-vulnerability-cve-2021-44228-esa-2021-31/291476/1).

If you are using any of the Camunda Spring Boot Starters and [switched the default logging system to Log4J2](https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.logging.log4j), make
sure to either update your version of Log4J as described in the following [Spring Boot article](https://spring.io/blog/2021/12/10/log4j2-vulnerability-and-spring-boot) or switch to a
different logging implementation as described in the [Spring Boot guide](https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.logging).

Still, Camunda recommends applying fixes as mentioned in Solutions below.

**How to determine if the installation is affected**

You are using Camunda Run, Camunda RPA Bridge, Camunda Optimize, Cawemo, or IAM.

**Solution**

Camunda has provided the following releases which contain a fix

* Camunda Platform Runtime 7.17.0-alpha3, 7.16.3, 7.15.9, and 7.14.15
* Camunda RPA Bridge 1.1.3
* Camunda Optimize 3.6.4
* Cawemo 1.8.3
* IAM 1.1.10

## Notice 51

**Publication Date: December 17th, 2021**

**Product components affected**

Camunda Run, Camunda RPA Bridge, Camunda Optimize, Cawemo, IAM

**Impact**

Camunda Run, Camunda RPA Bridge, Camunda Optimize, Cawemo and IAM bundle logback libraries for which the following vulnerability was reported:

* https://nvd.nist.gov/vuln/detail/CVE-2021-42550

Camunda recommends applying fixes as mentioned in Solutions below.

**How to determine if the installation is affected**

You are using Camunda Run, Camunda RPA Bridge, Camunda Optimize, Cawemo, or IAM.

**Solution**

Camunda has provided the following releases which contain a fix

* Camunda Platform Runtime 7.17.0-alpha3, 7.16.3, 7.15.9, and 7.14.15
* Camunda RPA Bridge 1.1.3
* Camunda Optimize 3.6.4
* Cawemo 1.8.3
* IAM 1.1.10

## Notice 50

**Publication Date: December 14th, 2021**

**Product affected:**

Camunda Platform

**Impact:**

The Camunda Platform web applications did not set the [SameSite attribute](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Set-Cookie/SameSite) on the session cookie. This enabled Cross-Site Request Forgery (CSRF) attacks if the [token-based CSRF prevention mechanism](https://docs.camunda.org/manual/7.16/webapps/shared-options/csrf-prevention/) was compromised (e.g. by another cross-site scripting vulnerability). Adding the `SameSite` attribute to the session cookie hardens Camunda against CSRF attacks.


**How to determine if the installation is affected**

- You are using the Camunda Platform web applications (Cockpit, Tasklist, Admin)

**Solution**

Camunda has provided the releases 7.17.0-alpha2, 7.16.2, 7.15.8, 7.14.14 which contain a fix.

Note that on the servers Oracle Weblogic, IBM Websphere, and JBoss EAP/Wildfly, the `SameSite` attribute is not enabled by default and needs server configuration as described in the guides on [how to configure the session cookie](https://docs.camunda.org/manual/7.16/webapps/shared-options/cookie-security/#session-cookie).

## Notice 49

**Publication Date: November 30th, 2021**

**Product affected:**

Cawemo On-Premises

**Impact:**

The versions of busybox and ssl_client shipped with cawemo-restapi, cawemo-webapp and cawemo-websockets were affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2021-42374
- https://nvd.nist.gov/vuln/detail/CVE-2021-42375
- https://nvd.nist.gov/vuln/detail/CVE-2021-42378
- https://nvd.nist.gov/vuln/detail/CVE-2021-42379
- https://nvd.nist.gov/vuln/detail/CVE-2021-42380
- https://nvd.nist.gov/vuln/detail/CVE-2021-42381
- https://nvd.nist.gov/vuln/detail/CVE-2021-42382
- https://nvd.nist.gov/vuln/detail/CVE-2021-42383
- https://nvd.nist.gov/vuln/detail/CVE-2021-42384
- https://nvd.nist.gov/vuln/detail/CVE-2021-42385
- https://nvd.nist.gov/vuln/detail/CVE-2021-42386

The versions of org.springframework:spring-core, org.springframework:spring-tx and io.netty:netty-transport shipped with cawemo-restapi were affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2021-22096
- https://nvd.nist.gov/vuln/detail/CVE-2021-37136
- https://nvd.nist.gov/vuln/detail/CVE-2021-37137

The version of json-schema shipped with cawemo-webapp was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2021-3918

The version of symfony/http-kernel shipped with cawemo-websockets was affected by the following vulnerability:

- https://nvd.nist.gov/vuln/detail/CVE-2021-41267

**How to determine if the installation is affected**

- Cawemo On-Premises 1.8.0 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.8.1 releases for the cawemo-restapi, cawemo-webapp and cawemo-websockets Docker images which contain fixes for the above-mentioned CVE.

## Notice 48

**Publication Date: September 20th, 2021**

**Product affected:**

Camunda Platform

**Impact:**

The Camunda Platform web applications were vulnerable to cross-site-scripting attacks via AngularJS template injection. An attacker could craft Camunda URLs that if opened by a victim would run arbitrary Javascript code in the browsing context of the victim. For example, this would allow the attacker to make requests against the Camunda API with the permissions of the victim.


**How to determine if the installation is affected**

- You are using the Camunda Platform web applications (Cockpit, Tasklist, Admin)

**Solution**

Camunda has provided the releases 7.16.0-alpha5, 7.15.6, 7.14.12, 7.13.18 which contain a fix.

## Notice 47

**Publication Date: September 20th, 2021 (updated May 2nd, 2022)**

**Product affected:**

Camunda Platform

**Impact:**

The version of Apache Tomcat shipped with the Camunda distributions, shipped with the Camunda RPA Bridge, and transitively pulled in by the Camunda Spring Boot starter had various vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2021-41079
- https://nvd.nist.gov/vuln/detail/CVE-2021-30639
- https://nvd.nist.gov/vuln/detail/CVE-2021-30640
- https://nvd.nist.gov/vuln/detail/CVE-2021-33037

**How to determine if the installation is affected**

- Camunda Platform Tomcat is used *or* Camunda Platform Run is used *or* Camunda Platform Spring Boot Starter is used *or* Camunda RPA Bridge is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided the releases 7.16.0-alpha5, 7.15.6, 7.14.12, 7.13.18, RPA Bridge 1.1.6 which contain a fix.

The Camunda Spring Boot starter versions 7.13 work with Spring Boot 2.2 and 2.3, for which no patches are available that resolve this problem. We recommend to either update the Tomcat dependencies manually or moving to a higher version of Spring Boot in accordance with [Camunda's compatibility matrix](https://docs.camunda.org/manual/7.15/user-guide/spring-boot-integration/version-compatibility/).

Other solutions:

- Tomcat and Spring Boot can be updated independently of Camunda to the latest patch level

## Notice 46

**Publication Date: August 31st, 2021**

**Product affected:**

Cawemo On-Premises

**Impact:**

The versions of apk-tools, libcrypto1.1 and libssl1.1 shipped with cawemo-restapi, cawemo-webapp and cawemo-websockets were affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2021-3712
- https://nvd.nist.gov/vuln/detail/CVE-2021-3711
- https://nvd.nist.gov/vuln/detail/CVE-2021-36159

The version of libcurl shipped with cawemo-websockets was affected by the following vulnerabilities:

- https://nvd.nist.gov/vuln/detail/CVE-2021-22922
- https://nvd.nist.gov/vuln/detail/CVE-2021-22923
- https://nvd.nist.gov/vuln/detail/CVE-2021-22924
- https://nvd.nist.gov/vuln/detail/CVE-2021-22925

**How to determine if the installation is affected**

- Cawemo On-Premises 1.7.0 or lower is used
- See the NIST links above for detailed descriptions of the circumstances required to exploit the vulnerabilities

**Solution**

Camunda has provided 1.7.1 releases for the cawemo-restapi, cawemo-webapp and cawemo-websockets Docker images which contain fixes for the above-mentioned CVE.


## Notice 45

**Publication Date: June 7th, 2021**

**Product affected:**

Camunda Platform

**Impact:**

The version of lodash shipped with Camunda Cockpit, Tasklist, and Admin was vulnerable to command injection:

- https://nvd.nist.gov/vuln/detail/CVE-2021-23337

**How to determine if the installation is affected**

- The Camunda Platform web applications are used (Cockpit, Tasklist, Admin)
- Embedded task forms or custom plugins are used
- The forms and plugins make use of lodash's `template` function with untrusted input

**Solution**

Camunda has provided the releases 7.16.0-alpha2, 7.15.2, 7.14.8, 7.13.14, 7.12.21 which contain a fix.


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
