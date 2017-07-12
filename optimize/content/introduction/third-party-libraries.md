---

title: 'Third-Party Libraries'
weight: 70

menu:
  main:
    identifier: "user-guide-introduction-third-party-libraries"
    parent: "user-guide-introduction"

---

This section covers third party libraries and their use in Optimize. For each component of Optimize, the third party libraries are listed. For each library, it is explained whether the library is a _required dependency_ or an _optional dependency_.

Required dependencies are libraries Camunda depends on to provide core functionality. In the list below marked as {{< RD >}}.

Optional dependencies are libraries Camunda can be integrated with. In the list below marked as {{< OD >}}.

# Optimize back end

The process engine depends on the following third-party libraries:

* [Jetty Server](http://www.eclipse.org/jetty/) {{< RD >}}, ([Apache License 2.0][apache] and [Eclipse Public License 1.0][eclipse]) as a embedded server.
* [SLF4J](http://www.slf4j.org/) {{< RD >}}, [(MIT)][mit] Logging Facade
* [Logback](http://www.slf4j.org/) {{< RD >}}, ([Eclipse Public License 1.0][eclipse] and [GNU Lesser General Public License, version 2.1][lgpl2.1] Logging Facade
* [Camunda BPM Model](https://github.com/camunda/camunda-bpmn-model) {{< RD >}}, [(Apache License 2.0)][apache]  for reading bpmn models.
* [Jackson JAX-RS](http://wiki.fasterxml.com/JacksonHome) {{< RD >}}, [(Apache License 2.0)][apache] provider for JSON content type
* [Spring Framework][spring] {{< RD >}}, [(Apache License 2.0)][apache].
* [Elasticsearch client](https://github.com/elastic/elasticsearch) {{< RD >}}, [(Apache License 2.0)][apache] for communication with elasticsearch.
* [Java JWT](https://github.com/auth0/java-jwt) {{< RD >}}, [(MIT)][mit]
* [Jersey](https://github.com/jersey/jersey) {{< RD >}}, [(CDDL 1.1 and GPL 2.0 with Class-path Exception)](https://github.com/jersey/jersey/blob/master/LICENSE.txt)

# Optimize front end

The Optimize Webapp includes the following third-party libraries:

* [babel-polyfill](https://github.com/babel/babel/tree/master/packages/babel-polyfill) {{< RD >}}, [(MIT)][mit]
* [bootstrap](https://github.com/twbs/bootstrap) {{< RD >}}, [(MIT)][mit]
* [bootstrap-datepicker](https://github.com/uxsolutions/bootstrap-datepicker) {{< RD >}}, [(Apache License 2.0)][apache]
* [bpmn-js](http://bpmn.io) {{< RD >}}, [(Custom license)](https://raw.githubusercontent.com/bpmn-io/bower-bpmn-js/v0.5.1/LICENSE)
* [d3](https://github.com/d3/d3) {{< RD >}}, [(Custom license)](https://github.com/d3/d3/blob/master/LICENSE)
* [d3-tip](https://github.com/Caged/d3-tip) {{< RD >}}, [(MIT)][mit]
* [deep-copy](https://github.com/simov/deep-copy) {{< RD >}}, [(MIT)][mit]
* [heatmap.js](https://github.com/pa7/heatmap.js) {{< RD >}}, [(MIT)][mit]
* [jQuery](http://jquery.com/) {{< RD >}}, [(MIT)][mit]
* [jsurl](https://github.com/Sage/jsurl) {{< RD >}}, [(MIT)][mit]
* [lodash](https://github.com/lodash/lodash) {{< RD >}}, [(Custom license)](https://github.com/lodash/lodash/blob/master/LICENSE)
* [redux](https://github.com/reactjs/redux) {{< RD >}}, [(MIT)][mit]

# Elasticsearch

[Elasticsearch](https://github.com/elastic/elasticsearch) is published under [(Apache License 2.0)][apache]. You can find all third-party licenses of Elasticsearch [here](https://github.com/elastic/opensourcesoftware/tree/master/docs/elasticsearch).

# Camunda BPM Platform

The [Camunda BPM Platform](https://github.com/camunda/camunda-bpm-platform) is published under [(Apache License 2.0)][apache]. You can find all third-party licenses of the Camunda platform [here](https://docs.camunda.org/manual/latest/introduction/third-party-libraries/).


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
