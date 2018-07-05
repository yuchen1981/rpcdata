package com.eltp.yuchen.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"dubbo/consumer.xml"})
public class ConsumerApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplicationMain.class, args);
    }
}
