package nl.devoteam.api;

import java.util.concurrent.CompletableFuture;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class P_TestAsyncSend implements Processor {

    @Autowired
    ProducerTemplate template;

    @Override
    public void process(Exchange exchange) throws Exception {
        CompletableFuture<Object> myobject = template.asyncSendBody("direct:retrieveTroubleTicket", "");
        //myobject.thenApplyAsync(n -> );

    }
}
