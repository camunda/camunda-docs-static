---
title: "Enterprise Download"
weight: 10

menu:
  main:
    name: "Download"
    identifier: "enterprise-download"

downloads:
  servers:
    - id: "run"
      path: "run"
      name: "Camunda Platform Run"
      weight: 0
    - id: "tomcat"
      path: "tomcat"
      name: "Apache Tomcat"
      weight: 1
    - id: "jboss"
      path: "jboss"
      name: "JBoss AS 7 / Red Hat JBoss EAP 6"
      weight: 2
    - id: "glassfish"
      path: "glassfish"
      name: "GlassFish"
      weight: 3
    - id: "ibm-was"
      path: "ibm-was"
      name: "IBM WebSphere 8.x"
      weight: 4
    - id: "ibm-was-85"
      path: "ibm-was-85"
      name: "IBM WebSphere 8.5"
      weight: 5
    - id: "ibm-was9"
      path: "ibm-was9"
      name: "IBM WebSphere 9"
      weight: 6
    - id: "ibm-was-liberty"
      path: "ibm-was-liberty"
      name: "IBM WebSphere Liberty"
      weight: 6
    - id: "oracle-wls"
      path: "oracle-wls"
      name: "Oracle WebLogic"
      weight: 7
    - id: "wildfly8"
      path: "wildfly8"
      name: "WildFly 8"
      weight: 8
    - id: "wildfly10"
      path: "wildfly10"
      name: "WildFly 10"
      weight: 9
    - id: "wildfly11"
      path: "wildfly11"
      name: "WildFly 11"
      weight: 10
    - id: "wildfly"
      path: "wildfly"
      name: "WildFly / Red Hat JBoss EAP 7"
      weight: 11
    - id: "wildfly-jakartaee"
      path: "wildfly"
      name: "WildFly"
      weight: 12

  formats:
    - zip
    - tar.gz
    - war

  selected:
    branch: "7.22"
    version: "7.22.3"
    server: "run"

  branches:
    - branch: "7.23"
      releases:
        - number: "7.23.0-alpha3"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+reason%3A%22completed%22+label%3Aversion%3A7.23.0-alpha3"
          date: "2025.02.11"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"        
        - number: "7.23.0-alpha2"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+reason%3A%22completed%22+label%3Aversion%3A7.23.0-alpha2"
          date: "2024.12.10"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"
        - number: "7.23.0-alpha1"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+reason%3A%22completed%22+label%3Aversion%3A7.23.0-alpha1"
          date: "2024.11.12"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

    - branch: "7.22"
      releases:
        - number: "7.22.3"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.22.3"
          date: "2025.02.28"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.22.2"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.22.2"
          date: "2025.01.24"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.22.1"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.22.1"
          date: "2024.11.29"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.22.0"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.22.0"
          date: "2024.10.08"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

    - branch: "7.21"
      releases:
        - number: "7.21.8"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.21.8"
          date: "2025.02.28"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.21.7"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.21.7"
          date: "2025.01.24"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.21.6"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.21.6"
          date: "2024.11.29"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.21.5"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.21.5"
          date: "2024.09.27"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.21.4"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.21.4"
          date: "2024.08.30"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.21.3"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.21.3"
          date: "2024.06.28"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.21.2"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.21.2"
          date: "2024.05.31"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.21.1"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.21.1"
          date: "2024.04.26"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.21.0"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.21.0"
          date: "2024.04.09"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

    - branch: "7.20"
      releases:
        - number: "7.20.11"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.20.11"
          date: "2025.02.28"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.20.10"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.20.10"
          date: "2025.01.24"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.20.9"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.20.9"
          date: "2024.11.29"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.20.8"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.20.8"
          date: "2024.08.30"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.20.7"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.20.7"
          date: "2024.06.28"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.20.6"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.20.6"
          date: "2024.05.31"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.20.5"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.20.5"
          date: "2024.04.26"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.20.4"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.20.4"
          date: "2024.02.29"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.20.3"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.20.3"
          date: "2024.01.31"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.20.2"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.20.2"
          date: "2023.11.30"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.20.1"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.20.1"
          date: "2023.10.27"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

        - number: "7.20.0"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.20.0"
          date: "2023.10.10"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was9"
            - "jboss"
          excludeformats:
            - "war"

    - branch: "7.19"
      releases:
        - number: "7.19.15"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.15+"
          date: "2024.08.30"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.14"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.14+"
          date: "2024.06.28"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.13"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.13+"
          date: "2024.05.31"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.12"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.12+"
          date: "2024.04.26"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.11"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.11+"
          date: "2024.02.29"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.10"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.10+"
          date: "2024.01.31"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.9"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.9+"
          date: "2023.11.30"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.8"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.8+"
          date: "2023.10.27"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.7"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.7+"
          date: "2023.09.29"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.6"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.6+"
          date: "2023.08.31"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.5"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.5+"
          date: "2023.07.26"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.4"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.4+"
          date: "2023.06.16"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.3"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.3+"
          date: "2023.06.02"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.2"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.2+"
          date: "2023.05.26"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.1"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.1+"
          date: "2023.04.28"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.19.0"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+is%3Aclosed+label%3Aversion%3A7.19.0+"
          date: "2023.04.11"
          excludeservers:
            - "wildfly"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

    - branch: "7.18"
      releases:
        - number: "7.18.15"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.15+is%3Aclosed+"
          date: "2024.02.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "ibm-was-8"

        - number: "7.18.14"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.14+is%3Aclosed+"
          date: "2024.01.31"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "ibm-was-8"

        - number: "7.18.13"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.13+is%3Aclosed+"
          date: "2023.11.30"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "ibm-was-8"

        - number: "7.18.12"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.12+is%3Aclosed+"
          date: "2023.10.27"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "ibm-was-8"

        - number: "7.18.11"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.11+is%3Aclosed+"
          date: "2023.08.31"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "ibm-was-8"

        - number: "7.18.10"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.10+is%3Aclosed+"
          date: "2023.07.26"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "ibm-was-8"

        - number: "7.18.9"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.9+is%3Aclosed+"
          date: "2023.06.02"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "ibm-was-8"

        - number: "7.18.8"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.8+is%3Aclosed+"
          date: "2023.05.26"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.18.7"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.7+is%3Aclosed+"
          date: "2023.04.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.18.6"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.6+is%3Aclosed+"
          date: "2023.03.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.18.5"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.5+is%3Aclosed+"
          date: "2023.02.22"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.18.4"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.4+is%3Aclosed+"
          date: "2023.02.03"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.18.3"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.3+is%3Aclosed+"
          date: "2023.01.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.18.2"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.2+is%3Aclosed+"
          date: "2022.12.21"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.18.1"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.18.1+is%3Aclosed+"
          date: "2022.11.30"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.18.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17394"
          date: "2022.10.11"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

    - branch: "7.17"
      releases:
        - number: "7.17.16"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.17.16+is%3Aclosed+"
          date: "2023.08.31"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.15"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.17.15+is%3Aclosed+"
          date: "2023.07.26"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.14"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.17.14+is%3Aclosed+"
          date: "2023.06.02"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.13"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.17.13+is%3Aclosed+"
          date: "2023.05.26"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.12"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.17.12+is%3Aclosed+"
          date: "2023.04.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.11"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.17.11+is%3Aclosed+"
          date: "2023.03.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.10"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.17.10+is%3Aclosed+"
          date: "2023.02.22"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.9"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.17.9+is%3Aclosed+"
          date: "2023.01.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.8"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.17.8+is%3Aclosed+"
          date: "2022.12.21"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.7"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.17.7+is%3Aclosed+"
          date: "2022.11.30"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17810"
          date: "2022.09.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17805"
          date: "2022.09.05"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17699"
          date: "2022.07.22"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17692"
          date: "2022.05.31"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17593"
          date: "2022.04.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.17.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16007"
          date: "2022.04.05"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-85"
            - "ibm-was-liberty"
            - "jboss"

    - branch: "7.16"
      releases:
        - number: "7.16.18"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.16.18+is%3Aclosed+"
          date: "2023.03.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.17"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.16.17+is%3Aclosed+"
          date: "2023.02.22"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.16"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.16.16+is%3Aclosed+"
          date: "2023.01.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.15"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.16.15+is%3Aclosed+"
          date: "2022.12.21"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.14"
          note: "https://github.com/camunda/camunda-bpm-platform/issues?q=is%3Aissue+label%3Aversion%3A7.16.14+is%3Aclosed+"
          date: "2022.11.30"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17811"
          date: "2022.09.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17806"
          date: "2022.09.05"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17700"
          date: "2022.07.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17693"
          date: "2022.05.31"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17592"
          date: "2022.04.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17447"
          date: "2022.03.31"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17438"
          date: "2022.02.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17431"
          date: "2022.01.21"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17422"
          date: "2021.12.22"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17406"
          date: "2021.12.17"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17292"
          date: "2021.11.26"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17108"
          date: "2021.10.27"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

        - number: "7.16.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16599"
          date: "2021.10.12"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"
            - "jboss"

    - branch: "7.15"
      releases:
        - number: "7.15.19"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17812"
          date: "2022.09.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.18"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17807"
          date: "2022.09.05"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.16"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17701"
          date: "2022.07.22"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.15"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17694"
          date: "2022.05.31"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17591"
          date: "2022.04.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17446"
          date: "2022.03.31"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17437"
          date: "2022.02.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17430"
          date: "2022.01.21"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17423"
          date: "2021.12.22"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17408"
          date: "2021.12.17"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17291"
          date: "2021.11.26"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17092"
          date: "2021.10.27"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16926"
          date: "2021.09.15"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16911"
          date: "2021.08.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16900"
          date: "2021.07.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16801"
          date: "2021.06.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16795"
          date: "2021.05.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16791"
          date: "2021.04.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.15.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16006"
          date: "2021.04.13"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

    - branch: "7.14"
      releases:
        - number: "7.14.20"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17590"
          date: "2022.04.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.19"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17445"
          date: "2022.03.31"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.18"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17436"
          date: "2022.02.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.17"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17429"
          date: "2022.01.21"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.16"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17424"
          date: "2021.12.22"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.15"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17407"
          date: "2021.12.17"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17290"
          date: "2021.11.26"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=17091"
          date: "2021.10.27"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16928"
          date: "2021.09.15"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16910"
          date: "2021.08.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16901"
          date: "2021.07.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16803"
          date: "2021.06.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16796"
          date: "2021.05.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16720"
          date: "2021.04.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16701"
          date: "2021.03.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16690"
          date: "2021.02.24"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16592"
          date: "2021.01.27"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16492"
          date: "2020.12.16"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16390"
          date: "2020.11.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16228"
          date: "2020.10.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.14.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?version=16004&projectId=10230"
          date: "2020.10.13"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

    - branch: "7.13"
      releases:
        - number: "7.13.18"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16929"
          date: "2021.09.15"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.17"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16909"
          date: "2021.08.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.16"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16905"
          date: "2021.07.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.15"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16804"
          date: "2021.06.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16797"
          date: "2021.05.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16721"
          date: "2021.04.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16702"
          date: "2021.03.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16691"
          date: "2021.02.24"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16596"
          date: "2021.01.27"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16491"
          date: "2020.12.16"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16391"
          date: "2020.11.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16294"
          date: "2020.10.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16227"
          date: "2020.10.15"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16216"
          date: "2020.09.22"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16208"
          date: "2020.08.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16195"
          date: "2020.07.22"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16190"
          date: "2020.07.16"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16094"
          date: "2020.06.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.13.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15532"
          date: "2020.05.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

    - branch: "7.12"
      releases:
        - number: "7.12.21"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16798"
          date: "2021.05.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.20"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16722"
          date: "2021.04.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.19"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16703"
          date: "2021.03.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.18"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16696"
          date: "2021.02.24"
          excludeservers:
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.17"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16692"
          date: "2021.01.27"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.15"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16490"
          date: "2020.12.16"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16397"
          date: "2020.11.25"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16392"
          date: "2020.11.10"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16228"
          date: "2020.10.28"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16217"
          date: "2020.09.22"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16210"
          date: "2020.08.25"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16201"
          date: "2020.07.22"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16191"
          date: "2020.07.16"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16096"
          date: "2020.06.25"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16013"
          date: "2020.05.25"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15997"
          date: "2020.04.27"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15790"
          date: "2020.03.26"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15702"
          date: "2020.02.19"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15499"
          date: "2020.01.29"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15593"
          date: "2019.12.17"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.12.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15387"
          date: "2019.11.30"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

    - branch: "7.11"
      releases:
        - number: "7.11.21"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16693"
          date: "2022.01.28"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.20"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16393"
          date: "2020.11.25"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.19"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16229"
          date: "2020.10.28"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.18"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16218"
          date: "2020.09.22"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.17"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16212"
          date: "2020.08.25"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.16"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16202"
          date: "2020.07.22"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.15"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16192"
          date: "2020.07.16"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16097"
          date: "2020.06.25"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16014"
          date: "2020.05.25"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15998"
          date: "2020.04.27"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15791"
          date: "2020.03.26"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15697"
          date: "2020.02.20"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15611"
          date: "2020.01.29"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15600"
          date: "2019.12.17"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15596"
          date: "2019.12.04"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15528"
          date: "2019.10.29"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15516"
          date: "2019.09.26"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15512"
          date: "2019.08.30"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15495"
          date: "2019.07.31"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15406"
          date: "2019.06.25"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.11.0"
          note: "https://blog.camunda.com/post/2019/05/camunda-bpm-7110-released"
          date: "2019.05.31"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

    - branch: "7.10"
      releases:
        - number: "7.10.19"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=16015"
          date: "2020.05.25"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.18"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15999"
          date: "2020.04.27"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.17"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15792"
          date: "2020.03.26"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.16"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15701"
          date: "2020.02.20"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.15"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15610"
          date: "2020.01.29"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15601"
          date: "2019.12.17"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15595"
          date: "2019.12.04"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15529"
          date: "2019.10.29"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15518"
          date: "2019.09.26"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15510"
          date: "2019.08.28"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15493"
          date: "2019.07.31"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15404"
          date: "2019.06.25"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15389"
          date: "2019.05.21"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15382"
          date: "2019.04.11"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15377"
          date: "2019.03.25"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15372"
          date: "2019.02.27"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15351"
          date: "2019.01.30"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15345"
          date: "2018.12.13"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

        - number: "7.10.0"
          note: "https://blog.camunda.com/post/2018/11/camunda-bpm-7100-released/"
          date: "2018.11.30"
          excludeservers:
            - "run"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "wildfly8"
            - "glassfish"
            - "ibm-was"
            - "ibm-was-liberty"

    - branch: "7.9"
      releases:
        - number: "7.9.20"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15691"
          date: "2020.01.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.19"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15594"
          date: "2019.12.04"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.17"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15530"
          date: "2019.10.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.16"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15519"
          date: "2019.08.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.15"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15509"
          date: "2019.08.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15492"
          date: "2019.07.31"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15405"
          date: "2019.06.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15383"
          date: "2019.05.21"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15378"
          date: "2019.03.25"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15371"
          date: "2019.02.27"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15352"
          date: "2019.01.30"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15344"
          date: "2018.12.13"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15341"
          date: "2018.11.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15339"
          date: "2018.10.30"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15335"
          date: "2018.09.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15324"
          date: "2018.08.29"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15310"
          date: "2018.07.17"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15306"
          date: "2018.06.28"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.9.0"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15096"
          date: "2018.05.31"
          excludeservers:
            - "wildfly-jakartaee"
            - "run"
            - "wildfly"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

    - branch: "7.8"
      releases:
        - number: "7.8.14"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15358"
          date: "2019.05.21"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.8.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15348"
          date: "2018.11.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.8.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15340"
          date: "2018.10.30"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.8.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15336"
          date: "2018.09.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.8.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15325"
          date: "2018.08.29"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.8.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15309"
          date: "2018.07.17"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.8.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15303"
          date: "2018.06.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.8.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15300"
          date: "2018.04.18"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.8.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15296"
          date: "2018.04.09"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.8.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15293"
          date: "2018.03.16"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.8.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15196"
          date: "2018.03.08"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.8.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15192"
          date: "2018.02.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.8.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15103"
          date: "2018.01.29"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.8.0"
          note: "http://blog.camunda.org/post/2017/11/camunda-bpm-780-released/"
          date: "2017.11.30"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

    - branch: "7.7"
      releases:
        - number: "7.7.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15326"
          date: "2018.10.30"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.7.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15294"
          date: "2018.07.17"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.7.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15197"
          date: "2018.03.08"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.7.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15193"
          date: "2018.02.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.7.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15106"
          date: "2018.01.29"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.7.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15090"
          date: "2017.12.07"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.7.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14990"
          date: "2017.09.27"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.7.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14910"
          date: "2017.08.09"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.7.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14908"
          date: "2017.07.26"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.7.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14896"
          date: "2017.07.13"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

        - number: "7.7.0"
          note: "http://blog.camunda.org/post/2017/05/camunda-bpm-770-released/"
          date: "2017.05.31"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was-85"
            - "ibm-was-liberty"

    - branch: "7.6"
      releases:
        - number: "7.6.13"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15198"
          date: "2018.02.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.6.12"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15195"
          date: "2018.02.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.6.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15190"
          date: "2018.01.29"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.6.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15108"
          date: "2018.01.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.6.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15100"
          date: "2017.12.06"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.6.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14909"
          date: "2017.10.26"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.6.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14899"
          date: "2017.07.13"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.6.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14897"
          date: "2017.06.30"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.6.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14891"
          date: "2017.05.22"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.6.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14890"
          date: "2017.03.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.6.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14703"
          date: "2017.03.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.6.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14700"
          date: "2017.01.18"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.6.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14698"
          date: "2016.12.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.6.0"
          note: "http://blog.camunda.org/post/2016/11/camunda-bpm-760-released/"
          date: "2016.11.25"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

    - branch: "7.5"
      releases:
        - number: "7.5.9"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14704"
          date: "2017.12.06"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.5.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14701"
          date: "2017.01.24"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.5.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14696"
          date: "2016.12.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.5.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14694"
          date: "2016.10.26"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.5.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14606"
          date: "2016.08.10"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.5.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14604"
          date: "2016.07.08"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.5.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14600"
          date: "2016.06.23"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.5.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14599"
          date: "2016.05.31"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.5.0"
          note: "http://blog.camunda.org/post/2016/05/camunda-bpm-750-released/"
          date: "2016.05.31"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "glassfish"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

    - branch: "7.4"
      releases:
        - number: "7.4.11"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14695"
          date: "2016.12.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.4.10"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14693"
          date: "2016.10.26"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.4.8"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14601"
          date: "2016.06.23"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.4.7"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14592"
          date: "2016.06.13"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.4.6"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14590"
          date: "2016.04.29"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.4.5"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14491"
          date: "2016.03.18"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.4.4"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14391"
          date: "2016.03.10"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.4.3"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14295"
          date: "2016.03.01"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.4.2"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14290"
          date: "2016.01.28"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.4.1"
          note: "https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=14193"
          date: "2015.12.15"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-liberty"
            - "ibm-was-85"

        - number: "7.4.0"
          note: "http://blog.camunda.org/post/2015/11/camunda-bpm-740-released/"
          date: "2015.11.30"
          excludeservers:
            - "run"
            - "wildfly"
            - "wildfly-jakartaee"
            - "wildfly11"
            - "wildfly10"
            - "ibm-was9"
            - "ibm-was-liberty"
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

Find more information about the [Full Distribution](/manual/latest/introduction/downloading-camunda/#full-distribution) and the [Standalone Web Application](/manual/latest/introduction/downloading-camunda/#standalone-web-application-distribution) (Discontinued starting from Camunda Platform 7.20) in our user guide.

{{< ee-download >}}

### Camunda RPA Bridge

The [Camunda RPA bridge](/manual/7.19/user-guide/camunda-bpm-rpa-bridge/) is a standalone application that allows to call RPA (robotic process automation) bots from BPMN models deployed to the Camunda Platform. Read the [installation guide](/manual/7.19/installation/camunda-bpm-rpa-bridge) for further instructions. Consult the [Getting Started Guide](/get-started/rpa) for a hands-on introduction to setting up RPA orchestration.

{{< note title="Camunda discontinues the maintenance of the Camunda RPA bridge." class="warning" >}}
Camunda Automation Platform 7.19 is the last release maintaining compatibility with the Camunda RPA bridge. Camunda Automation Platform 7.19 and Camunda RPA bridge will be maintained for another 18 months until Oct 2024.

The Camunda RPA Bridge is replaced by RPA [Out-of-the-box Connectors](https://docs.camunda.io/docs/components/connectors/out-of-the-box-connectors/available-connectors-overview/) in Camunda 8.
{{< /note >}}

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
      <td>1.1.12</td>
      <td>7.15 - 7.19</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>31.05.2024</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.11/camunda-bpm-rpa-bridge-1.1.12.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.11</td>
      <td>7.15 - 7.19</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>01.02.2024</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.11/camunda-bpm-rpa-bridge-1.1.11.zip">zip</a>
      </td>
    </tr>
      <tr class="well">
      <td>1.1.10</td>
      <td>7.15 - 7.19</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>27.10.2023</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.10/camunda-bpm-rpa-bridge-1.1.10.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.9</td>
      <td>7.15 - 7.19</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>25.01.2023</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.9/camunda-bpm-rpa-bridge-1.1.9.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.8</td>
      <td>7.15 - 7.19</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>05.10.2022</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.8/camunda-bpm-rpa-bridge-1.1.8.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.7</td>
      <td>7.15 - 7.19</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>29.04.2022</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.7/camunda-bpm-rpa-bridge-1.1.7.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.6</td>
      <td>7.15 - 7.19</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>30.03.2022</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.6/camunda-bpm-rpa-bridge-1.1.6.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.5</td>
      <td>7.15 - 7.19</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>19.01.2022</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.5/camunda-bpm-rpa-bridge-1.1.5.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.4</td>
      <td>7.15 - 7.19</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>21.12.2021</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.4/camunda-bpm-rpa-bridge-1.1.4.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.3</td>
      <td>7.15 - 7.19</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>15.12.2021</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.3/camunda-bpm-rpa-bridge-1.1.3.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.2</td>
      <td>7.15 - 7.19</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>13.12.2021</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.2/camunda-bpm-rpa-bridge-1.1.2.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.1</td>
      <td>7.15 - 7.19</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>28.05.2021</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.1/camunda-bpm-rpa-bridge-1.1.1.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.1.0</td>
      <td>7.15 - 7.19</td>
      <td>UiPath (Cloud & On-Premises), Automation Anywhere Automation 360 (formerly A2019)</td>
      <td>13.04.2021</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://downloads.camunda.cloud/enterprise-release/camunda-bpm/rpa/1.1/1.1.0/camunda-bpm-rpa-bridge-1.1.0.zip">zip</a>
      </td>
    </tr>
    <tr class="well">
      <td>1.0.0</td>
      <td>7.14 - 7.19</td>
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
      <td>3.15.0</td>
      <td>7.20+, 7.21+, 7.22+</td>
      <td>8.13.0+</td>
      <td>14.01.2025</td>
      <td>
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.15.0/camunda-optimize-3.15.0-demo.zip">zip</a>&nbsp;
        <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.15.0/camunda-optimize-3.15.0-demo.tar.gz">tar.gz</a>
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
        <th class="col-md-2">Supported AWS OpenSearch Versions</th>
        <th class="col-md-2">Release Date</th>
        <th class="col-md-2">Download</th>
      </tr>
    </thead>
    <tbody>
      <tr class="well">
        <td>3.15.0</td>
        <td>7.20+, 7.21+, 7.22+</td>
        <td>8.13.0+</td>
        <td>2.9+</td>
        <td>14.01.2025</td>
        <td>
          <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.15.0/camunda-optimize-3.15.0-production.zip">zip</a>&nbsp;
          <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.15.0/camunda-optimize-3.15.0-production.tar.gz">tar.gz</a>
        </td>
      </tr>
      <tr class="well">
        <td>3.14.3</td>
        <td>7.20+, 7.21+, 7.22+</td>
        <td>8.13.0+</td>
        <td>2.9+</td>
        <td>28.02.2025</td>
        <td>
          <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.14.3/camunda-optimize-3.14.3-production.zip">zip</a>&nbsp;
          <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.14.3/camunda-optimize-3.14.3-production.tar.gz">tar.gz</a>
        </td>
      </tr>
      <tr class="well">
        <td>3.13.11</td>
        <td>7.19+, 7.20+, 7.21+</td>
        <td>8.9.0+</td>
        <td>-</td> 
        <td>11.02.2025</td>
        <td>
          <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.13.11/camunda-optimize-3.13.11-production.zip">zip</a>&nbsp;
          <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.13.11/camunda-optimize-3.13.11-production.tar.gz">tar.gz</a>
        </td>
      </tr>    
      <tr class="well">
        <td>3.12.14</td>
        <td>7.18+, 7.19+, 7.20+</td>
        <td>8.9.0+</td>
        <td>-</td> 
        <td>11.02.2025</td>
        <td>
          <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.12.14/camunda-optimize-3.12.14-production.zip">zip</a>&nbsp;
          <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.12.14/camunda-optimize-3.12.14-production.tar.gz">tar.gz</a>
        </td>
      </tr>
      <tr class="well">
        <td>3.11.19</td>
        <td>7.18+, 7.19+, 7.20+</td> 
        <td>8.8.0+</td>
        <td>-</td> 
        <td>11.02.2025</td>
        <td>
          <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.11.19/camunda-optimize-3.11.19-production.zip">zip</a>&nbsp;
          <a class="btn btn-sm btn-default optimize-download" href="https://downloads.camunda.cloud/enterprise-release/optimize/3.11.19/camunda-optimize-3.11.19-production.tar.gz">tar.gz</a>
        </td>
      </tr>
    </tbody>
  </table>

In case you're interested in older versions of Optimize, feel free to check out the [Previous Releases](https://downloads.camunda.cloud/enterprise-release/optimize/).

## Cawemo

[Cawemo](/cawemo) is a web-based BPMN modeling application with a focus on collaboration.
It is available as an on-premises version for own installation.
Please download one of the following archives and read the [installation guide](/cawemo/latest/technical-guide/installation/) for further instructions.

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
      <td>1.9.26</td>
      <td>04.02.2025</td>
      <td>
        <a class="btn btn-sm btn-default" href="https://docs.camunda.org/cawemo/1.9/download/cawemo-1.9.26.zip">zip</a>
        <a class="btn btn-sm btn-default" href="https://docs.camunda.org/cawemo/1.9/download/cawemo-1.9.26.tar.gz">tar.gz</a>
      </td>
    </tr>
  </tbody>
</table>

## Camunda Modeler

The Camunda Modeler is an open source process modeling tool based on [bpmn.io](http://bpmn.io/). It is a desktop application that allows you to edit BPMN process diagrams, DMN decisions, and Forms located on your local file system. Find more information in the [Camunda Modeler](https://docs.camunda.org/manual/latest/modeler/camunda-modeler/) documentation and the Camunda Modeler [download page](http://camunda.com/download/modeler/).
