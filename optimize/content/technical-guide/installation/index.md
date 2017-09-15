---

title: "Installation"
weight: 50

menu:
  main:
    identifier: "installation"
    parent: "technical-guide"

---

# Installation Guide

This document describes the installation process of the Camunda Optimize distribution, as well as various configuration possibilities available after initial installation. 

Before proceeding with the installation, please read the article about [supported environments]({{< relref "introduction/supported-environments.md" >}}).

## Full Distribution 

To install the full distribution, please download the archive with the latest version from the [download page](/enterprise/download/#camunda-optimize) and extract it to the desired folder. After that, start Optimize by running the script `start-optimize.sh` on Linux or `start-optimize.bat` on Windows. 

## Standalone Application 

You can [download](https://docs.camunda.org/enterprise/download/#camunda-optimize) the archive, which contains all the required files to startup Camunda Optimize, and configure it to connect to your pre-installed Elasticsearch instance. You can then start your instance by running the script `start-optimize.sh` with the `standalone` parameter on Linux:
```bash
./start-optimize.sh standalone
```
or `start-optimize.bat` with the `standalone` parameter on Windows:
```batch
.\start-optimize.bat standalone
```

## Usage

You can start using Optimize right away by opening the following URL in your browser: [http://localhost:8090](http://localhost:8090)

Please note that, in order to utilize all features of Optimize, you have to configure integration with the Camunda BPM Platform and perform an import of the data. Please refer to the [import section]({{< relref "technical-guide/import/index.md" >}}) for more instructions.

## Configuration

All distributions of Optimize come with a predefined set of configuration options that can be overwritten by the user, based on current environment requirements. To do that, have a look into the folder named `environment`. There are two files, one called `environment-config.json` with values that override the default Optimize properties and another called `environment-logback.xml`, which sets the logging configuration.

You can see all supported values [here]({{< relref "technical-guide/configuration/index.md" >}}).

### Optimize Container Configuration

The following JSON Paths correspond to settings available in the environment configuration.

* $.container.ports.http - A port number that is used by the embedded jetty server to process HTTP connections
```
Default value: `8090`
```

* $.container.host - You can configure a host either by host name or IP address, to identify a specific network interface on which to listen
```
Default value: `0.0.0.0`
```

### Elasticsearch configuration

The Optimize distribution comes with an Elasticsearch instance. The supplied Elasticsearch server is not customized or tuned by Camunda in any manner. 

#### Configuration values 

You can customize connection properties used by Optimize by changing the following properties:

* $.es.host - A hostname on which the Elasticsearch TCP listener is available
```
Default value: `localhost`
```

* $.es.port - A port number used by Elasticsearch to accept TCP connections
```
Default value: `9300`
```

* $.es.index - An index name used to create all Optimize types, shards, etc.
```
Default value: `optimize`
```

#### Additional considerations 

Optimize will create a default user on initial startup of the application, with the username\password pair `admin\admin`. We highly recommend to remove this user if you plan to use the system in a productive environment.

### Camunda BPM configuration

To perform an import and provide the full set of features, Optimize requires connection to the REST API of the Camunda engine, which can be configured using the following properties. 

* $.engines.${engineAlias}.rest - A base URL that will be used for connections to the Camunda Engine REST API
```
Default value: `http://localhost:8080/engine-rest`
```

* camunda.optimize.engine.name - The name of the engine that will be used to import data
```
Default value: `/engine/default`
```

### Logger configuration

Adapt the file `environment-logback.xml` in the `environment` folder to change the logging configurations. 

For example, you can change the logging level of the root level by changing the `level` value of the following line:
```xml
<root level="info">
```
```
Default value: `info`
```

Possible options are: trace, debug, info, warn, error, all or off.

Alternatively, you can change the log level of specific package. E.g.,:
```xml
<logger name="org.camunda.optimize" level="warn" />
```

## Import of the dataset

By default, Optimize comes without any data available. To start using all the features of the system, you have to perform a data import from the Camunda BPM Platform. This process is triggered automatically on start.

If you are interested in the details of the import, please refer to the dedicated [import overview section]({{< relref "technical-guide/import/import-overview.md" >}}).

# Recommended additional configurations

Tests have shown that the standard setup might cause problems in certain scenarios. Therefore, we recommend to conduct the following adjustments, to avoid those issues.

## Adjust engine heap size

Sending huge process definition diagrams via Rest-API might cause the engine to crash, because of the limited heap size. Thus, it is recommended to increase the heap size of the engine to at least 1 gigabyte, e.g., by adding the following java command line property when starting the engine: 
```bash
-Xmx1024m
```
