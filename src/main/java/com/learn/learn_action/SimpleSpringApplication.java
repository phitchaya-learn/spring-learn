package com.learn.learn_action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SimpleSpringApplication.class);
        app.run();
    }

}