package com.learn.simplespring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.micrometer.observation.annotation.Observed;

@Service
class HelloWorldService {

    private static final Logger log = LoggerFactory.getLogger(HelloWorldService.class);

    @Autowired
    private Config config;

    @Observed(name = "hello", contextualName = "getting-hello-message", lowCardinalityKeyValues = { "userType",
            "userType2" })
    String hello(String name) {
        log.info("Getting hello for {}", name);
        return (name == null) ? "Hello World 123" : "Hello " + name;
    }

    // Example of using an annotation to observe methods
    // <user.name> will be used as a metric name
    // <getting-user-name> will be used as a span name
    // <userType=userType2> will be set as a tag for both metric & span
    @Observed(name = "env-check", contextualName = "getting-environment", lowCardinalityKeyValues = { "userType",
            "userType2" })
    String checkEnvironment() {
        log.info("Checking environment");
        return "This is " + config.getEnvironment() + " environment. " + config.getGreeting() + " 2";
    }
}