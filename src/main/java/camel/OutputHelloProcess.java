package camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class OutputHelloProcess implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println(exchange.getFromRouteId());
        System.out.println(exchange);
        System.out.println("Hello");
    }
}
