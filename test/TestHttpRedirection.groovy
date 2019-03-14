package org.camunda.docs


import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import static org.junit.Assert.*

@RunWith(Parameterized)
abstract class TestHttpRedirection {
    private URL url
    private URLConnection connection
    private String route, target
    private int code

    static Collection<Object[]> urls() {[]}
    protected abstract getBaseURI()

    TestHttpRedirection(String route, String target, int code) {
        this.route = route
        this.target = target
        this.code = code
        HttpURLConnection.setFollowRedirects(false)
        this.url = (this.getBaseURI() + this.route).toURL()
        this.connection = this.url.openConnection() as HttpURLConnection
    }

    @Test
    void testLocationHeader() {
        if (this.target == "") return // Don't test Location header if target is empty, e.g. to test 404 or 200
        assertEquals(this.getBaseURI() + this.target, this.connection.getHeaderField("Location"))
    }

    @Test
    void testStatus() {
        assertEquals(this.code, this.connection.getResponseCode())
    }

}

