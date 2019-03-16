package ru.nwth.routing.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:D://inputFolder?noop=true")
                .log("Копируем файл ${header.CamelFileName} в папку D://outputFolder")
                .to("file:D://outputFolder");
    }
}
