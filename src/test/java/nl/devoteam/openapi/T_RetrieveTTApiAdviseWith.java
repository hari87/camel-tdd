package nl.devoteam.openapi;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringBootRunner;
import org.apache.camel.test.spring.DisableJmx;
import org.apache.camel.test.spring.MockEndpoints;
import org.apache.camel.test.spring.UseAdviceWith;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {OpenapiApplication.class},
        properties = { "camel.springboot.java-routes-include-pattern=**/R_FetchTroubleTicket*"}) // tells which class is picked up for testing.
@MockEndpoints // need to explore further but was mentioned in camel-spring-boot example from it's wiki page.
@UseAdviceWith // it explicitly tells context that this is test class, so it will not start (re-start context)
//@RunWith(SpringRunner.class) - this is default in spring-boot test. we are replacing with CamelSpringBootRunner.
@RunWith(CamelSpringBootRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)//cleanses context after each test method.
@DisableJmx(true) //monitoring is not needed for testing, so disabled.
public class T_RetrieveTTApiAdviseWith{

    @Autowired
    private CamelContext camelContext;

    @Autowired
    private ProducerTemplate template;

    @Test
    public void figuringOutAdviseWith() throws Exception {
        camelContext.getRouteDefinition("01")
                .adviceWith(camelContext, new AdviceWithRouteBuilder() {
                    @Override
                    public void configure() throws Exception {
                       // replaceFromWith("mock:entry"); - this will inject mock right after from definition.
                        // injects mock at the end of route.
                        //replaceFromWith();

                        weaveAddLast().to("mock:result");
                        mockEndpoints();

                    }
                });
        camelContext.start();
        //check if the endpoint is added to registry.
        assertThat(camelContext.getEndpoint("direct:retrieveTroubleTicket")).isNotNull();
        // Instantiate MockEndpoint with "mock:result" injected in the route meant for testing.
        MockEndpoint mockOut = camelContext.getEndpoint("mock:result", MockEndpoint.class);
        // This MockEndpoint is to show that mockEndPoints() in method configure() works.
        MockEndpoint mockAnotherOut = camelContext.getEndpoint("mock:direct:retrieveTroubleTicket", MockEndpoint.class);
        System.out.println("\n \n \n \n ******************** \n "+mockAnotherOut.getName());
        // test the outcome.
        mockOut.expectedMessageCount(1);
        mockOut.expectedBodiesReceived("hello");
        // send the message
        template.sendBody("direct:retrieveTroubleTicket","");
        //validate assertions
        mockOut.assertIsSatisfied();

    }

    }
