package camel;

import org.apache.camel.builder.RouteBuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        org.apache.camel.Main main = new org.apache.camel.Main();

        main.addRouteBuilder(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("timer:timerName?period=3000")
                    .process(new OutputHelloProcess());
            }
        });

        main.run();
    }
}