package com.skr.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/service-integration-config.xml")
public class SkrServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkrServiceApplication.class, args);
    }
}
