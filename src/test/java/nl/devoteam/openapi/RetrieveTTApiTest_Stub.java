package nl.devoteam.openapi;

import nl.devoteam.api.R_FetchTroubleTicket;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class RetrieveTTApiTest_Stub  extends CamelTestSupport {

    protected RouteBuilder createRouteBuilder() throws Exception {
        return new R_FetchTroubleTicket();
    }

    @Test
    public void testMockAllEndpoints() throws Exception {
        getMockEndpoint("mock:result").expectedBodiesReceived("hello");
        template.sendBody("direct:retrieveTroubleTicket", "");
        assertMockEndpointsSatisfied();
    }

}
