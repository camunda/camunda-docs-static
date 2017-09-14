---

title: "Optimize Plugin System"
weight: 20

menu:
  main:
    name: "Plugins & Customization"
    identifier: "plugin-system"
    parent: "import-guide"
    pre: "Explains the principle of plugins in Optimize and how they can be added."

---

Optimize allows you adapt the import in order to decide which kind of data should be analyzed.

Currently, we support:

* [Variable Import Adaption](#variable-import-adaption)

## Setup your environment

First, add the optimize plugin via maven to your project:

```xml
<dependency>
  <groupId>org.camunda.optimize</groupId>
  <artifactId>plugin</artifactId>
  <version>1.2.0</version>
</dependency>
```

In order to tell maven, where to find the plugin environment, add the following repository to your project:

```xml
<repositories>
  <repository>
    <id>camunda-bpm-nexus</id>
    <name>camunda-bpm-nexus</name>
    <url>
      https://app.camunda.com/nexus/content/repositories/camunda-optimize
    </url>
  </repository>
</repositories>
```

Please note: To make this work, you need to add your nexus credentials and the server to your settings.xml.

## Variable Import Customization

This feature enables you to enrich or filter the variable import, e.g., if variables in Camunda contain only ids to variables in another database and you would like resolve those values to the actual values.

The Optimize plugin system contains the following interface:

```java
public interface VariableImportAdapter {

  List<PluginVariableDto> adaptVariables(List<PluginVariableDto> variables);
}
```

Implement this to adjust the variables to be imported. Given is a list variables that would be imported, if no further action is performed. The returned list is the adapted list with the enriched/filtered variables that will be imported. In order, to create new variable instances, you can use the PluginVariableDto class ass data transfer object (dto), which is also contained in the plugin system.

Please note, that all dto class members need to be set in order, otherwise is the variable ignored as this may lead to problems during data analysis.

Next, package your plugin into a jar file and then add the jar file into the _plugin_ folder of your Optimize directory. Finally, add the name of the base package of your custom VariableImportAdapter to the environment-config.json file:

```json
"plugin": {
   "variableImport": {
     /*
     Look in the given base package list for variable import adaption plugins.
     If empty, the import is not influenced.
     */
     "basePackages": []
   }
 }
```

The following shows an example of a customization of the variable import in the package ```optimize.plugin```, where every string variable is the value 'foo' assigned:

```java
package optimize.plugin;

import org.camunda.optimize.plugin.importing.variable.PluginVariableDto;
import org.camunda.optimize.plugin.importing.variable.VariableImportAdapter;

import java.util.List;

  public class MyCustomVariableImportAdapter implements VariableImportAdapter {

  @Override
  public List<PluginVariableDto> adaptVariables(List<PluginVariableDto> list) {
    for (PluginVariableDto pluginVariableDto : list) {
      if(pluginVariableDto.getType().toLowerCase().equals("string")) {
        pluginVariableDto.setValue("foo");
      }
    }
    return list;
  }

}
```

When now the 'MyCustomVariableImportAdapter' packaged as a jar file is added to the _plugin_ folder, we just have to add the following property to the _environment-config.json_ file to make the plugin work:

```json
"plugin": {
   "variableImport": {
     /*
     Look in the given base package list for variable import adaption plugins.
     If empty, the import is not influenced.
     */
     "basePackages": ["optimize.plugin"]
   }
 }
```
