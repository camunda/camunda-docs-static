---
title: "Enterprise Download"
weight: 10

menu:
  main:
    name: "Download"
    identifier: "enterprise-download"

downloads:
  servers:
    - path: "run"
      name: "Camunda Platform Run"
      weight: 0
    - path: "tomcat"
      name: "Apache Tomcat"
      weight: 1
    - path: "jboss"
      name: "JBoss AS 7 / Red Hat JBoss EAP 6"
      weight: 2
    - path: "glassfish"
      name: "GlassFish"
      weight: 3
    - path: "ibm-was"
      name: "IBM WebSphere 8.x"
      weight: 4
    - path: "ibm-was-85"
      name: "IBM WebSphere 8.5"
      weight: 5
    - path: "ibm-was9"
      name: "IBM WebSphere 9"
      weight: 6
    - path: "oracle-wls"
      name: "Oracle WebLogic"
      weight: 7
    - path: "wildfly8"
      name: "WildFly 8"
      weight: 8
    - path: "wildfly10"
      name: "WildFly 10"
      weight: 9
    - path: "wildfly11"
      name: "WildFly 11"
      weight: 10
    - path: "wildfly"
      name: "WildFly / Red Hat JBoss EAP 7"
      weight: 11


  formats:
    - zip
    - tar.gz
    - war

  selected:
    branch: "7.18"
    version: "7.18.1"
    server: "run"

  branches:
    - branch: "7.19"
      releases:
        - number: "7.19.0-alpha1"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.0-alpha1+"
          date: "2022.11.08"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "jboss"

        - number: "7.19.0-alpha2"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.0-alpha2"
          date: "2022.12.13"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "jboss"

    - branch: "7.18"
      releases:
        - number: "7.18.1"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.1+is%3Aclosed+"
          date: "2022.11.30"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "jboss"

        - number: "7.18.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17394"
          date: "2022.10.11"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "jboss"

    - branch: "7.17"
      releases:
        - number: "7.17.7"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.17.7+is%3Aclosed+"
          date: "2022.11.30"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "jboss"

        - number: "7.17.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17810"
          date: "2022.09.29"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "jboss"

        - number: "7.17.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17805"
          date: "2022.09.05"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "jboss"

        - number: "7.17.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17699"
          date: "2022.07.22"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "jboss"

        - number: "7.17.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17692"
          date: "2022.05.31"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "jboss"
      
        - number: "7.17.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17593"
          date: "2022.04.29"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "jboss"

        - number: "7.17.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16007"
          date: "2022.04.05"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "jboss"
          
    - branch: "7.16"
      releases:
        - number: "7.16.14"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.16.14+is%3Aclosed+"
          date: "2022.11.30"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
              - "jboss" 

        - number: "7.16.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17811"
          date: "2022.09.29"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
              - "jboss"    
        
        - number: "7.16.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17806"
          date: "2022.09.05"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
              - "jboss"        

        - number: "7.16.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17700"
          date: "2022.07.25"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
              - "jboss"
      
        - number: "7.16.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17693"
          date: "2022.05.31"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
              - "jboss"
      
        - number: "7.16.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17592"
          date: "2022.04.29"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
              - "jboss"
      
        - number: "7.16.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17447"
          date: "2022.03.31"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
              - "jboss"
      
        - number: "7.16.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17438"
          date: "2022.02.25"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
              - "jboss"
      
        - number: "7.16.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17431"
          date: "2022.01.21"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
              - "jboss"
      
        - number: "7.16.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17422"
          date: "2021.12.22"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
              - "jboss"
      
        - number: "7.16.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17406"
          date: "2021.12.17"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
              - "jboss"
      
        - number: "7.16.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17292"
          date: "2021.11.26"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
              - "jboss"
      
        - number: "7.16.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17108"
          date: "2021.10.27"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
              - "jboss"

        - number: "7.16.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16599"
          date: "2021.10.12"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
              - "jboss"

    - branch: "7.15"
      releases:
        - number: "7.15.19"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17812"
          date: "2022.09.29"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"

        - number: "7.15.18"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17807"
          date: "2022.09.05"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"

        - number: "7.15.16"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17701"
          date: "2022.07.22"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"

        - number: "7.15.15"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17694"
          date: "2022.05.31"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17591"
          date: "2022.04.29"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17446"
          date: "2022.03.31"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17437"
          date: "2022.02.25"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17430"
          date: "2022.01.21"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17423"
          date: "2021.12.22"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17408"
          date: "2021.12.17"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17291"
          date: "2021.11.26"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17092"
          date: "2021.10.27"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16926"
          date: "2021.09.15"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16911"
          date: "2021.08.25"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16900"
          date: "2021.07.28"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16801"
          date: "2021.06.28"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16795"
          date: "2021.05.28"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16791"
          date: "2021.04.28"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.15.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16006"
          date: "2021.04.13"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
        

    - branch: "7.14"
      releases:
        - number: "7.14.20"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17590"
          date: "2022.04.29"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.14.19"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17445"
          date: "2022.03.31"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.14.18"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17436"
          date: "2022.02.25"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.14.17"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17429"
          date: "2022.01.21"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.14.16"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17424"
          date: "2021.12.22"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.14.15"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17407"
          date: "2021.12.17"
          excludeservers:
              - "wildfly11"
              - "wildfly10"
              - "wildfly8"
              - "glassfish"
              - "ibm-was"
      
        - number: "7.14.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17290"
          date: "2021.11.26"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.14.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17091"
          date: "2021.10.27"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.14.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16928"
          date: "2021.09.15"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.14.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16910"
          date: "2021.08.25"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.14.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16901"
          date: "2021.07.28"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.14.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16803"
          date: "2021.06.28"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.14.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16796"
          date: "2021.05.28"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.14.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16720"
          date: "2021.04.28"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
       
        - number: "7.14.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16701"
          date: "2021.03.29"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.14.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16690"
          date: "2021.02.24"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.14.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16592"
          date: "2021.01.27"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            
        - number: "7.14.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16492"
          date: "2020.12.16"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.14.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16390"
          date: "2020.11.25"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.14.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16228"
          date: "2020.10.28"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            
        - number: "7.14.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?version=16004&projectId=10230"
          date: "2020.10.13"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

    - branch: "7.13"
      releases:
        - number: "7.13.18"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16929"
          date: "2021.09.15"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.13.17"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16909"
          date: "2021.08.25"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.13.16"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16905"
          date: "2021.07.28"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.13.15"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16804"
          date: "2021.06.28"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.13.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16797"
          date: "2021.05.28"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.13.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16721"
          date: "2021.04.28"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.13.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16702"
          date: "2021.03.29"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.13.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16691"
          date: "2021.02.24"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.13.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16596"
          date: "2021.01.27"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.13.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16491"
          date: "2020.12.16"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.13.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16391"
          date: "2020.11.25"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            
        - number: "7.13.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16294"
          date: "2020.10.28"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
        
        - number: "7.13.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16227"
          date: "2020.10.15"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.13.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16216"
          date: "2020.09.22"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.13.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16208"
          date: "2020.08.25"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.13.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16195"
          date: "2020.07.22"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.13.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16190"
          date: "2020.07.16"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.13.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16094"
          date: "2020.06.25"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.13.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15532"
          date: "2020.05.29"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

    - branch: "7.12"
      releases:
        - number: "7.12.21"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16798"
          date: "2021.05.28"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.12.20"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16722"
          date: "2021.04.28"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.12.19"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16703"
          date: "2021.03.29"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            
        - number: "7.12.18"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16696"
          date: "2021.02.24"
          excludeservers:
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.12.17"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16692"
          date: "2021.01.27"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.12.15"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16490"
          date: "2020.12.16"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.12.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16397"
          date: "2020.11.25"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.12.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16392"
          date: "2020.11.10"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.12.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16228"
          date: "2020.10.28"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
        
        - number: "7.12.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16217"
          date: "2020.09.22"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.12.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16210"
          date: "2020.08.25"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.12.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16201"
          date: "2020.07.22"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.12.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16191"
          date: "2020.07.16"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.12.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16096"
          date: "2020.06.25"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.12.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16013"
          date: "2020.05.25"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.12.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15997"
          date: "2020.04.27"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.12.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15790"
          date: "2020.03.26"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.12.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15702"
          date: "2020.02.19"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.12.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15499"
          date: "2020.01.29"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.12.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15593"
          date: "2019.12.17"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.12.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15387"
          date: "2019.11.30"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

    - branch: "7.11"
      releases:
        - number: "7.11.21"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16693"
          date: "2022.01.28"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.11.20"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16393"
          date: "2020.11.25"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.11.19"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16229"
          date: "2020.10.28"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
        
        - number: "7.11.18"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16218"
          date: "2020.09.22"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            
        - number: "7.11.17"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16212"
          date: "2020.08.25"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
      
        - number: "7.11.16"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16202"
          date: "2020.07.22"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.15"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16192"
          date: "2020.07.16"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16097"
          date: "2020.06.25"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16014"
          date: "2020.05.25"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15998"
          date: "2020.04.27"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15791"
          date: "2020.03.26"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15697"
          date: "2020.02.20"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15611"
          date: "2020.01.29"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15600"
          date: "2019.12.17"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15596"
          date: "2019.12.04"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15528"
          date: "2019.10.29"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15516"
          date: "2019.09.26"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15512"
          date: "2019.08.30"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15495"
          date: "2019.07.31"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15406"
          date: "2019.06.25"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.11.0"
          note: "https://blog.camunda.com/post/2019/05/camunda-bpm-7110-released"
          date: "2019.05.31"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

    - branch: "7.10"
      releases:
        - number: "7.10.19"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16015"
          date: "2020.05.25"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"


        - number: "7.10.18"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15999"
          date: "2020.04.27"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.17"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15792"
          date: "2020.03.26"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.16"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15701"
          date: "2020.02.20"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.15"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15610"
          date: "2020.01.29"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15601"
          date: "2019.12.17"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15595"
          date: "2019.12.04"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15529"
          date: "2019.10.29"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15518"
          date: "2019.09.26"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15510"
          date: "2019.08.28"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15493"
          date: "2019.07.31"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15404"
          date: "2019.06.25"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15389"
          date: "2019.05.21"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15382"
          date: "2019.04.11"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15377"
          date: "2019.03.25"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15372"
          date: "2019.02.27"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15351"
          date: "2019.01.30"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15345"
          date: "2018.12.13"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

        - number: "7.10.0"
          note: "https://blog.camunda.com/post/2018/11/camunda-bpm-7100-released/"
          date: "2018.11.30"
          excludeservers:
            - "run"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"

    - branch: "7.9"
      releases:
        - number: "7.9.20"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15691"
          date: "2020.01.29"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.19"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15594"
          date: "2019.12.04"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.17"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15530"
          date: "2019.10.29"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.16"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15519"
          date: "2019.08.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.15"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15509"
          date: "2019.08.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15492"
          date: "2019.07.31"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15405"
          date: "2019.06.25"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15383"
          date: "2019.05.21"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15378"
          date: "2019.03.25"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15371"
          date: "2019.02.27"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15352"
          date: "2019.01.30"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15344"
          date: "2018.12.13"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15341"
          date: "2018.11.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15339"
          date: "2018.10.30"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15335"
          date: "2018.09.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15324"
          date: "2018.08.29"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15310"
          date: "2018.07.17"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15306"
          date: "2018.06.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.9.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15096"
          date: "2018.05.31"
          excludeservers:
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"

    - branch: "7.8"
      releases:
        - number: "7.8.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15358"
          date: "2019.05.21"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.8.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15348"
          date: "2018.11.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.8.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15340"
          date: "2018.10.30"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.8.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15336"
          date: "2018.09.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.8.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15325"
          date: "2018.08.29"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.8.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15309"
          date: "2018.07.17"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.8.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15303"
          date: "2018.06.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.8.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15300"
          date: "2018.04.18"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.8.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15296"
          date: "2018.04.09"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.8.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15293"
          date: "2018.03.16"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.8.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15196"
          date: "2018.03.08"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.8.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15192"
          date: "2018.02.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.8.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15103"
          date: "2018.01.29"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.8.0"
          note: "http://blog.camunda.org/post/2017/11/camunda-bpm-780-released/"
          date: "2017.11.30"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

    - branch: "7.7"
      releases:
        - number: "7.7.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15326"
          date: "2018.10.30"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.7.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15294"
          date: "2018.07.17"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.7.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15197"
          date: "2018.03.08"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.7.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15193"
          date: "2018.02.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.7.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15106"
          date: "2018.01.29"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.7.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15090"
          date: "2017.12.07"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.7.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14990"
          date: "2017.09.27"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.7.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14910"
          date: "2017.08.09"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.7.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14908"
          date: "2017.07.26"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.7.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14896"
          date: "2017.07.13"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

        - number: "7.7.0"
          note: "http://blog.camunda.org/post/2017/05/camunda-bpm-770-released/"
          date: "2017.05.31"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"

    - branch: "7.6"
      releases:
        - number: "7.6.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15198"
          date: "2018.02.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.6.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15195"
          date: "2018.02.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.6.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15190"
          date: "2018.01.29"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.6.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15108"
          date: "2018.01.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.6.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15100"
          date: "2017.12.06"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.6.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14909"
          date: "2017.10.26"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.6.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14899"
          date: "2017.07.13"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.6.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14897"
          date: "2017.06.30"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.6.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14891"
          date: "2017.05.22"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.6.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14890"
          date: "2017.03.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.6.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14703"
          date: "2017.03.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.6.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14700"
          date: "2017.01.18"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.6.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14698"
          date: "2016.12.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.6.0"
          note: "http://blog.camunda.org/post/2016/11/camunda-bpm-760-released/"
          date: "2016.11.25"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

    - branch: "7.5"
      releases:
        - number: "7.5.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14704"
          date: "2017.12.06"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.5.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14701"
          date: "2017.01.24"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.5.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14696"
          date: "2016.12.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.5.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14694"
          date: "2016.10.26"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.5.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14606"
          date: "2016.08.10"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.5.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14604"
          date: "2016.07.08"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.5.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14600"
          date: "2016.06.23"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.5.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14599"
          date: "2016.05.31"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.5.0"
          note: "http://blog.camunda.org/post/2016/05/camunda-bpm-750-released/"
          date: "2016.05.31"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-85"

    - branch: "7.4"
      releases:
        - number: "7.4.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14695"
          date: "2016.12.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.4.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14693"
          date: "2016.10.26"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.4.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14601"
          date: "2016.06.23"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.4.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14592"
          date: "2016.06.13"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.4.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14590"
          date: "2016.04.29"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.4.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14491"
          date: "2016.03.18"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.4.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14391"
          date: "2016.03.10"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.4.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14295"
          date: "2016.03.01"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.4.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14290"
          date: "2016.01.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.4.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14193"
          date: "2015.12.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-85"

        - number: "7.4.0"
          note: "http://blog.camunda.org/post/2015/11/camunda-bpm-740-released/"
          date: "2015.11.30"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-85"
---

On this page we provide downloads for the Camunda Platform Enterprise Platform including:

- [Camunda Platform]({{< relref "#camunda-bpm" >}})
- [Camunda Optimize]({{< relref "#camunda-optimize" >}})
- [Cawemo]({{< relref "#cawemo" >}})
- [Camunda Modeler]({{< relref "#camunda-modeler" >}})

## Camunda Platform

### Full Distributions and Standalone Web Applications

This page contains the latest versions of all supported branches. In addition, we provide alpha releases of the current development branch. Please note that an alpha release is not fully tested and just a snapshot of the current development state.

Find more information about the [Full Distribution](/manual/latest/introduction/downloading-camunda/#full-distribution) and the [Standalone Web Application](/manual/latest/introduction/downloading-camunda/#standalone-web-application-distribution) in our user guide.

{{< ee-download >}}

### Camunda RPA Bridge

The [Camunda RPA bridge](/manual/latest/user-guide/camunda-bpm-rpa-bridge/) is a standalone application that allows to call RPA (robotic process automation) bots from BPMN models deployed to the Camunda Platform. Read the [installation guide](/manual/latest/installation/camunda-bpm-rpa-bridge) for further instructions. Consult the [Getting Started Guide](/get-started/rpa) for a hands-on introduction to setting up RPA orchestration.

<table class="table">
  <thead>
    <tr>
      <th class="col-md-2">Version</th>
      <th class="col-md-2">Supported Engine Versions</th>
      <th class="col-md-2">Supported RPA Vendors</th>
      <th class="col-md-2">Release Date</th>
      <th class="col-md-2">Download</th>
    </tr>
  </thead>
  <tbody>
    <tr class="well">
      <td>1.1.8</td>
      <td>7.15+</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>05.10.2022</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.8/camunda-bpm-rpa-bridge-1.1.8.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.7</td>
      <td>7.15+</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>29.04.2022</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.7/camunda-bpm-rpa-bridge-1.1.7.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.6</td>
      <td>7.15+</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>30.03.2022</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.6/camunda-bpm-rpa-bridge-1.1.6.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.5</td>
      <td>7.15+</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>19.01.2022</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.5/camunda-bpm-rpa-bridge-1.1.5.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.4</td>
      <td>7.15+</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>21.12.2021</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.4/camunda-bpm-rpa-bridge-1.1.4.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.3</td>
      <td>7.15+</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>15.12.2021</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.3/camunda-bpm-rpa-bridge-1.1.3.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.2</td>
      <td>7.15+</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>13.12.2021</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.2/camunda-bpm-rpa-bridge-1.1.2.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.1</td>
      <td>7.15+</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>28.05.2021</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.1/camunda-bpm-rpa-bridge-1.1.1.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.0</td>
      <td>7.15+</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>13.04.2021</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.0/camunda-bpm-rpa-bridge-1.1.0.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.0.0</td>
      <td>7.14+</td>
      <td>UiPath (Cloud & On-Premises)</td>
      <td>19.10.2020</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.0/1.0.0/camunda-bpm-rpa-bridge-1.0.0.zip">zip</a>
      </td>
    </tr>
  </tbody>
</table>

### Additional Information

- [Maven Coordinates](/get-started/apache-maven)
- [Update and Migration Guide](/manual/latest/update)
- [Getting Started](/get-started)
- [Examples](/manual/latest/examples)
- [Supported Environments](/manual/latest/introduction/supported-environments)
- [Previous Versions](https://downloads.camunda.cloud/enterprise-release/)
- [XSLT Extension 1.0.2](https://downloads.camunda.cloud/enterprise-release/camunda-bpm/extensions/xslt/1.0.2/camunda-bpm-ee-xslt-extension-1.0.2.zip)

## Camunda Optimize

[Camunda Optimize](https://docs.camunda.io/optimize/components/what-is-optimize/) is an addition to the Camunda Platform, that provides continuous monitoring and insights about your deployed business processes and decision tables. It helps process owners to make informed decisions to optimize their processes and decisions. Read the [installation guide](https://docs.camunda.io/optimize/self-managed/optimize-deployment/install-and-start/).

Optimize is released monthly, and you can find a list of download options below. Learn more about our [versioning policy](https://docs.camunda.io/docs/self-managed/optimize-deployment/version-policy/#version-policy).

### Demo Distribution with Elasticsearch

Download this distribution if you want to use Optimize with an embedded Elasticsearch or if you
want to get to know Optimize quickly, without any additional setup or installation steps required.

The demo distribution bundles

- Optimize
- The Container / Application Server itself
- Configuration files and plugin folder
- Elasticsearch

To install the demo distribution, please download one of the following archives:

<table class="table">
  <thead>
    <tr>
      <th class="col-md-2">Version</th>
      <th class="col-md-2">Supported Engine Versions</th>
      <th class="col-md-2">Supported Elasticsearch Versions</th>
      <th class="col-md-2">Release Date</th>
      <th class="col-md-2">Download</th>
    </tr>
  </thead>
  <tbody>
    <tr class="well">
      <td>3.9.3</td>
      <td>7.16+, 7.17+, 7.18+</td>
      <td>7.13.0+, 7.14.0+, 7.15.0+, 7.16.2+, 7.17.0+</td>
      <td>23.11.2022</td>
      <td>
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.9.3/camunda-optimize-3.9.3-demo.zip">zip</a>&nbsp;
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.9.3/camunda-optimize-3.9.3-demo.tar.gz">tar.gz</a>
      </td>
    </tr>
  </tbody>
</table>

### Production Distribution without Elasticsearch

You can download the production Optimize distribution to use it in your production environment, which contains all the required files to startup Camunda Optimize, and configure it to connect to your pre-installed Elasticsearch instance.

This distribution bundles

- Optimize
- Container / Application Server itself
- Configuration files and plugin folder

To get the production distribution, please download one of the following archives:

<table class="table">
  <thead>
    <tr>
      <th class="col-md-2">Version</th>
      <th class="col-md-2">Supported Engine Versions</th>
      <th class="col-md-2">Supported Elasticsearch Versions</th>
      <th class="col-md-2">Release Date</th>
      <th class="col-md-2">Download</th>
    </tr>
  </thead>
  <tbody>
    <tr class="well">
      <td>3.9.3</td>
      <td>7.16+, 7.17+, 7.18+</td>
      <td>7.13.0+, 7.14.0+, 7.15.0+, 7.16.2+, 7.17.0+</td>
      <td>23.11.2022</td>
      <td>
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.9.3/camunda-optimize-3.9.3-production.zip">zip</a>&nbsp;
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.9.3/camunda-optimize-3.9.3-production.tar.gz">tar.gz</a>
      </td>
    </tr>
    <tr class="well">
      <td>3.8.6</td>
      <td>7.15+, 7.16+, 7.17+</td>
      <td>7.10.0+, 7.11.0+, 7.12.0+, 7.13.0+, 7.14.0+, 7.15.0+, 7.16.2+, 7.17.0+</td>
      <td>23.11.2022</td>
      <td>
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.8.6/camunda-optimize-3.8.6-production.zip">zip</a>&nbsp;
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.8.6/camunda-optimize-3.8.6-production.tar.gz">tar.gz</a>
      </td>
    </tr>
    <tr class="well">
      <td>3.7.3</td>
      <td>7.14+, 7.15+, 7.16+</td>
      <td>7.8.0+, 7.9.0+, 7.10.0+, 7.11.0+, 7.12.0+, 7.13.0+, 7.14.0+, 7.15.0+, 7.16.2+</td>
      <td>11.03.2022</td>
      <td>
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.7.3/camunda-optimize-3.7.3-production.zip">zip</a>&nbsp;
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.7.3/camunda-optimize-3.7.3-production.tar.gz">tar.gz</a>
      </td>
    </tr>
    <tr class="well">
      <td>3.6.6</td>
      <td>7.14+, 7.15+, 7.16+</td>
      <td>7.8.0+, 7.9.0+, 7.10.0+, 7.11.0+, 7.12.0+, 7.13.0+, 7.14.0+, 7.15.0+, 7.16.2+</td>
      <td>01.02.2021</td>
      <td>
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.6.6/camunda-optimize-3.6.6-production.zip">zip</a>&nbsp;
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.6.6/camunda-optimize-3.6.6-production.tar.gz">tar.gz</a>
      </td>
    </tr>
    <tr class="well">
      <td>3.6.0</td>
      <td>7.14+, 7.15+, 7.16+</td>
      <td>7.8.0+, 7.9.0+, 7.10.0+, 7.11.0+, 7.12.0+, 7.13.0+, 7.14.0+, 7.15.0+</td>
      <td>13.10.2021</td>
      <td>
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.6.0/camunda-optimize-3.6.0-production.zip">zip</a>&nbsp;
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.6.0/camunda-optimize-3.6.0-production.tar.gz">tar.gz</a>
      </td>
    </tr> 
    <tr class="well">
      <td>3.5.0</td>
      <td>7.13.5+, 7.14+, 7.15+</td>
      <td>7.8.0+, 7.9.0+, 7.10.0+, 7.11.0+, 7.12.0+, 7.13.0+</td>
      <td>13.07.2021</td>
      <td>
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.5.0/camunda-optimize-3.5.0-production.zip">zip</a>&nbsp;
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.5.0/camunda-optimize-3.5.0-production.tar.gz">tar.gz</a>
      </td>
    </tr>
    <tr class="well">
      <td>3.4.0</td>
      <td>7.13.5+, 7.14+, 7.15+</td>
      <td>7.5.1+, 7.6.0+, 7.7.0+, 7.8.0+, 7.9.0+, 7.10.0+, 7.11.0+</td>
      <td>13.04.2021</td>
      <td>
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.4.0/camunda-optimize-3.4.0-production.zip">zip</a>&nbsp;
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.4.0/camunda-optimize-3.4.0-production.tar.gz">tar.gz</a>
      </td>
    </tr>
    <tr class="well">
      <td>3.3.0</td>
      <td>7.12.11+, 7.13.5+ and 7.14+</td>
      <td>7.3.0+, 7.4.0+, 7.5.0+, 7.6.0+, 7.7.0+, 7.8.0+, 7.9.0+, 7.10.0+</td>
      <td>12.01.2021</td>
      <td>
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.3.0/camunda-optimize-3.3.0-production.zip">zip</a>&nbsp;
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.3.0/camunda-optimize-3.3.0-production.tar.gz">tar.gz</a>
      </td>
    </tr>
    <tr class="well">
      <td>3.2.0</td>
      <td>7.12.11+, 7.13.5+ and 7.14+</td>
      <td>7.0.0+, 7.1.0+, 7.2.0+, 7.3.0+, 7.4.0+, 7.5.0+, 7.6.0+, 7.7.0+, 7.8.0+</td>
      <td>13.10.2020</td>
      <td>
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.2.0/camunda-optimize-3.2.0-production.zip">zip</a>&nbsp;
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.2.0/camunda-optimize-3.2.0-production.tar.gz">tar.gz</a>
      </td>
    </tr>
    <tr class="well">
      <td>3.1.0</td>
      <td>7.11.13, 7.12.6 and 7.13+</td>
      <td>7.0.0+, 7.1.0+, 7.2.0+, 7.3.0+, 7.4.0+, 7.5.0+, 7.6.0+</td>
      <td>14.07.2020</td>
      <td>
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.1.0/camunda-optimize-3.1.0-production.zip">zip</a>&nbsp;
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.1.0/camunda-optimize-3.1.0-production.tar.gz">tar.gz</a>
      </td>
    </tr>
    <tr class="well">
      <td>3.0.0</td>
      <td>7.10.6+, 7.11+ and 7.12+</td>
      <td>7.0.0+, 7.1.0+, 7.2.0+, 7.3.0+, 7.4.0+, 7.5.0+, 7.6.0+</td>
      <td>02.04.2020</td>
      <td>
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.0.0/camunda-optimize-3.0.0-production.zip">zip</a>&nbsp;
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.0.0/camunda-optimize-3.0.0-production.tar.gz">tar.gz</a>
      </td>
    </tr>
  </tbody>
</table>

If you're interested in the latest features, you can get a sneak peek by trying out one of the alpha releases:

{{< note title="Heads Up!" class="warning" >}}
Please note that Optimize alpha releases are not suitable for production environments and should only be used for testing.
{{< /note >}}

<table class="table">
  <thead>
    <tr>
      <th class="col-md-2">Alpha Version</th>
      <th class="col-md-2">Supported Engine Versions</th>
      <th class="col-md-2">Supported Elasticsearch Versions</th>
      <th class="col-md-2">Release Date</th>
      <th class="col-md-2">Download</th>
    </tr>
  </thead>
  <tbody>
    <tr class="well">
        <td>3.10.0-alpha2</td>
        <td>7.17+, 7.18+</td>
        <td>7.13.0+, 7.14.0+, 7.15.0+, 7.16.2+, 7.17.0+</td>
        <td>13.12.2022</td>
        <td>
          <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.10.0-alpha2/camunda-optimize-3.10.0-alpha2-production.zip">zip</a>&nbsp; 
          <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.10.0-alpha2/camunda-optimize-3.10.0-alpha2-production.tar.gz">tar.gz</a>
        </td>
    </tr>
 
  </tbody>
</table>


In case you're interested in older versions of Optimize, feel free to checkout the [Previous Releases](https://downloads.camunda.cloud/enterprise-release/optimize/).

## Cawemo

[Cawemo](/cawemo) is a web-based BPMN modeling application with a focus on collaboration.
It is available as a hosted SaaS application (https://cawemo.com) or as an on-premises version for own installation.
For installing the latter, please download one of the following archives and read the [installation guide](/cawemo/latest/technical-guide/installation/) for further instructions.

<table class="table">
  <thead>
    <tr>
      <th class="col-md-2">Name</th>
      <th class="col-md-2">Version</th>
      <th class="col-md-2">Release Date</th>
      <th class="col-md-2">Download</th>
    </tr>
  </thead>
  <tbody>
    <tr class="well">
      <td><a href="/cawemo">Cawemo On-Premises</a></td>
      <td>1.9.5</td>
      <td>17.11.2022</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://docs.camunda.org/cawemo/1.9/download/cawemo-1.9.5.zip">zip</a>
        <a class="btn btn-sm btn-default" href="https://docs.camunda.org/cawemo/1.9/download/cawemo-1.9.5.tar.gz">tar.gz</a>
      </td>
    </tr>
  </tbody>
</table>

## Camunda Modeler

The Camunda Modeler is an open source process modeling tool based on [bpmn.io](http://bpmn.io/). It is a desktop application that allows you to edit BPMN process diagrams, DMN decision tables and CMMN diagrams located on your local file system. Find more information in the [Camunda Modeler](https://docs.camunda.org/manual/latest/modeler/camunda-modeler/) documentation and the Camunda Modeler [download page](http://camunda.com/download/modeler/).
