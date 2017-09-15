---

title: 'Third-Party Libraries'
weight: 70

menu:
  main:
    identifier: "user-guide-introduction-third-party-libraries"
    parent: "user-guide-introduction"

---

This section covers third party libraries and their use in Optimize. For each component of Optimize, the third party libraries are listed. All of these libraries are required libraries that Optimize depends on for core functionality.

# Optimize Back End

Optimize depends on the following third-party libraries:

* [Jetty Server](http://www.eclipse.org/jetty/), ([Apache License 2.0][apache] and [Eclipse Public License 1.0][eclipse]) as a embedded server.
* [SLF4J](http://www.slf4j.org/), [(MIT)][mit] Logging Facade
* [Logback](http://www.slf4j.org/), ([Eclipse Public License 1.0][eclipse] and [GNU Lesser General Public License, version 2.1][lgpl2.1] Logging Facade
* [Camunda BPM Model](https://github.com/camunda/camunda-bpmn-model), [(Apache License 2.0)][apache]  for reading bpmn models.
* [Jackson JAX-RS](http://wiki.fasterxml.com/JacksonHome), [(Apache License 2.0)][apache] provider for JSON content type
* [JSON Path](https://github.com/json-path/JsonPath), [(Apache License 2.0)][apache] A Java DSL for reading JSON documents
* [Spring Framework][spring], [(Apache License 2.0)][apache].
* [Elasticsearch client](https://github.com/elastic/elasticsearch), [(Apache License 2.0)][apache] for communication with elasticsearch.
* [Java JWT](https://github.com/auth0/java-jwt), [(MIT)][mit]
* [Jersey](https://github.com/jersey/jersey), [(CDDL 1.1 and GPL 2.0 with Class-path Exception)](https://github.com/jersey/jersey/blob/master/LICENSE.txt)

# Optimize Front End

The Optimize Webapp includes the following third-party libraries:

* [babel-polyfill](https://github.com/babel/babel/tree/master/packages/babel-polyfill), [(MIT)][mit]
* [bootstrap](https://github.com/twbs/bootstrap), [(MIT)][mit]
* [bootstrap-datepicker](https://github.com/uxsolutions/bootstrap-datepicker), [(Apache License 2.0)][apache]
* [bpmn-js](http://bpmn.io), [(Custom license)](https://raw.githubusercontent.com/bpmn-io/bower-bpmn-js/v0.5.1/LICENSE)
* [d3](https://github.com/d3/d3), [(Custom license)](https://github.com/d3/d3/blob/master/LICENSE)
* [d3-tip](https://github.com/Caged/d3-tip), [(MIT)][mit]
* [deep-copy](https://github.com/simov/deep-copy), [(MIT)][mit]
* [heatmap.js](https://github.com/pa7/heatmap.js), [(MIT)][mit]
* [jQuery](http://jquery.com/), [(MIT)][mit]
* [jsurl](https://github.com/Sage/jsurl), [(MIT)][mit]
* [lodash](https://github.com/lodash/lodash), [(Custom license)](https://github.com/lodash/lodash/blob/master/LICENSE)
* [redux](https://github.com/reactjs/redux), [(MIT)][mit]

# Elasticsearch

[Elasticsearch](https://github.com/elastic/elasticsearch) is published under [Apache License 2.0][apache]. You can find all third-party licenses of Elasticsearch [here](https://github.com/elastic/opensourcesoftware/tree/master/docs/elasticsearch).

# Camunda BPM Platform

The [Camunda BPM Platform](https://github.com/camunda/camunda-bpm-platform) is published under [Apache License 2.0][apache]. You can find all third-party licenses of the Camunda platform [here](https://docs.camunda.org/manual/latest/introduction/third-party-libraries/).


[apache]: http://www.apache.org/licenses/LICENSE-2.0.html
[dojo]: https://github.com/dojo/dojo/blob/1.9/LICENSE#L43-L195
[eclipse]: http://www.eclipse.org/legal/epl-v10.html
[epl]: http://www.eclipse.org/legal/epl-v10.html
[jruby]: https://github.com/jruby/jruby/blob/master/LICENSE.RUBY
[lgpl]: http://www.gnu.org/licenses/lgpl-3.0.de.html
[lgpl2.1]: http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
[mit]: http://opensource.org/licenses/MIT
[mpl]: https://www.mozilla.org/MPL/1.0/
[mpl2]: https://www.mozilla.org/MPL/2.0/
[spring]: http://projects.spring.io/spring-framework/
[python]: http://www.jython.org/license.html
[tmate]: http://svnkit.com/license.html
