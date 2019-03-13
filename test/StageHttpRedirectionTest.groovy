package org.camunda.docs

import org.junit.runners.Parameterized

@groovy.transform.InheritConstructors
class StageHttpRedirectionTest extends TestHttpRedirection {

    @Parameterized.Parameters(name = "{index}: {0} => {1} ({2})")
    static Collection<Object[]> urls() {
        [
                ["/optimize/", "/optimize/develop/", 301],                                         // FIXME: 301 redirect to /optimize/latest/
                ["/optimize/user-guide/homepage/", "/optimize/develop/user-guide/homepage/", 301], // FIXME: 301 redirect to /optimize/latest/...
                ["/manual/reference/bpmn20/", "/manual/develop/reference/bpmn20/", 301],           // FIXME: redirect to manual/latest/...
                ["/get-started/cmmn12/", "", 404],                                                 // FIXME: 307 redirect to /cmmn11
                ["/get-started/cmmn10/project-setup/", "/get-started/cmmn11/project-setup/", 301], // FIXME: change to 307
                ["/optimize/2.5/user-guide/homepage/", "/optimize/develop/2.5/user-guide/homepage/", 301],  // FIXME: faulty redirect
        ] as Object[][]
    }

    @Override
    protected getBaseURI() {
        "https://stage.docs.camunda.org"
    }
}
