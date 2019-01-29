package nl.devoteam.api;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class R_FetchTroubleTicket extends RouteBuilder {


    @Override
    public void configure() throws Exception {
        from("direct:retrieveTroubleTicket")
                .setBody()
                .constant("hello")
                .log("got response")
                .to("mock:result");
    }
}
