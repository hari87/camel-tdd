package nl.devoteam.openapi;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class OrderRoute extends RouteBuilder {

    @Bean(name = "jsonProvider")
    public JacksonJsonProvider jsonProvider() {
        return new JacksonJsonProvider();
    }

    public void configure() throws Exception {
        from("cxfrs:http://localhost:8088?resourceClasses=nl.devoteam.openapi.TroubleTicketApi&bindingStyle=SimpleConsumer&providers=#jsonProvider")
                .log("you did it!");
    }
}
