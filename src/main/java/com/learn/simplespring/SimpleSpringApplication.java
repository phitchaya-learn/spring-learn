package com.learn.simplespring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringApplication {

    private static final Logger log = LoggerFactory.getLogger(SimpleSpringApplication.class);

    public static void main(String[] args) {
        log.info("Starting {}", SimpleSpringApplication.class.getSimpleName());
        log.debug("Debugging {}", SimpleSpringApplication.class.getSimpleName());
        SpringApplication app = new SpringApplication(SimpleSpringApplication.class);
        app.run();
    }

}