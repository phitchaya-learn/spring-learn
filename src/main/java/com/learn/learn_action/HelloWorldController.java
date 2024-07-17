package com.learn.learn_action;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld(@RequestParam(name = "name", required = false) String name) {
        return (name == null) ? "Hello World 123" : "Hello " + name;
    }

}
