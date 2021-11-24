package com.example.demo.controller;

import com.example.demo.model.Config;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(@RequestParam long id, @RequestParam String name) {
        Config config = new Config(id);
        config.setName(name);
        config.setComment(id + " new comment " + name);
        System.out.println("generate new config: " + config);
        return config.getName();
    }

}
