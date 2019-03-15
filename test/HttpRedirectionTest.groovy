package org.camunda.docs

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.yaml.snakeyaml.Yaml
import static org.junit.Assert.*

@RunWith(Parameterized)
class HttpRedirectionTest {
    private URL url
    private URLConnection connection
    private String baseUrl, route, target
    private int code

    @Parameterized.Parameters(name = "{index}: {0})")
    static Collection<Object[]> urls() {
      (new Yaml())
        .load(("test/HttpRedirectionTest.yml" as File).text)
        .collect { 
            def baseUrl = it.key
            it.value.collect { 
              [ baseUrl: baseUrl, route: it.key ] + it.value 
            } 
        }
        .flatten()
    }

    HttpRedirectionTest(Map config) {
        this.route = config.route
        this.target = config.target
        this.code = Integer.valueOf(config.status)
        this.baseUrl = config.baseUrl
        HttpURLConnection.setFollowRedirects(false)
        this.url = (this.baseUrl + this.route).toURL()
        this.connection = this.url.openConnection() as HttpURLConnection
    }

    @Test
    void testLocationHeader() {
        if (this.target == "") return // Don't test Location header if target is empty, e.g. to test 404 or 200
        assertEquals(this.baseUrl + this.target, this.connection.getHeaderField("Location"))
    }

    @Test
    void testStatus() {
        assertEquals(this.code, this.connection.getResponseCode())
    }

}

