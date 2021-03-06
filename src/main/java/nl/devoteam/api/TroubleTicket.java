package nl.devoteam.api;

import javax.annotation.Generated;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;

/**
 * Generated from Swagger specification by Camel REST DSL generator.
 */
@Generated("org.apache.camel.generator.swagger.PathGenerator")
@Component
public final class TroubleTicket extends RouteBuilder {
    /**
     * Defines Apache Camel routes using REST DSL fluent API.
     */
    public void configure() {

        restConfiguration().component("netty4-http")
        .port(8083)
        .host("localhost");

        rest("/tmf-api/troubleTicket/v2/")
            .get("/troubleTicket")
                .id("listTroubleTicket")
                .param()
                    .name("fields")
                    .type(RestParamType.query)
                    .dataType("string")
                    .required(false)
                    .description("Comma separated properties to display in response")
                .endParam()
                .param()
                    .name("offset")
                    .type(RestParamType.query)
                    .dataType("integer")
                    .required(false)
                    .description("Requested index for start of resources to be provided in response")
                .endParam()
                .param()
                    .name("limit")
                    .type(RestParamType.query)
                    .dataType("integer")
                    .required(false)
                    .description("Requested number of resources to be provided in response")
                .endParam()
                .to("direct:listTroubleTicket")
            .post("/troubleTicket")
                .id("createTroubleTicket")
                .param()
                    .name("troubleTicket")
                    .type(RestParamType.body)
                    .required(true)
                    .description("The Trouble Ticket to be created")
                .endParam()
                .to("direct:createTroubleTicket")
            .get("/troubleTicket/{id}")
                .id("retrieveTroubleTicket")
                .param()
                    .name("id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Identifier of the Trouble Ticket")
                .endParam()
                .to("direct:retrieveTroubleTicket")
            .delete("/troubleTicket/{id}")
                .id("deleteTroubleTicket")
                .param()
                    .name("id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Identifier of the Trouble Ticket")
                .endParam()
                .to("direct:deleteTroubleTicket")
            .patch("/troubleTicket/{id}")
                .id("patchTroubleTicket")
                .param()
                    .name("id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("Identifier of the Trouble Ticket")
                .endParam()
                .param()
                    .name("troubleTicket")
                    .type(RestParamType.body)
                    .required(true)
                    .description("The Trouble Ticket to be updated")
                .endParam()
                .to("direct:patchTroubleTicket")
            .post("/hub")
                .id("registerListener")
                .description("Sets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics.")
                .param()
                    .name("data")
                    .type(RestParamType.body)
                    .required(true)
                    .description("Data containing the callback endpoint to deliver the information")
                .endParam()
                .to("direct:registerListener")
            .delete("/hub/{id}")
                .id("unregisterListener")
                .description("Resets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics.")
                .param()
                    .name("id")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("The id of the registered listener")
                .endParam()
                .to("direct:unregisterListener");
    }
}
