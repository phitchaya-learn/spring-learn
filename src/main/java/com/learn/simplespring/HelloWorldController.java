package com.learn.simplespring;

import org.springframework.web.bind.annotation.RestController;

import io.micrometer.observation.annotation.Observed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloWorldController {

    private static final Logger log = LoggerFactory.getLogger(SimpleSpringApplication.class);

    private final HelloWorldService helloWorldService;

    HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/")
    public String helloWorld(@RequestParam(name = "name", required = false) String name) {
        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");

        return helloWorldService.hello(name);
    }

    @GetMapping("/env-check")
    public String checkEnvironment() {
        return helloWorldService.checkEnvironment();
    }

}
