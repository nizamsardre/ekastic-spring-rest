package com.example.springrestelastic.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElasticController {

    @GetMapping("/salam")
    public String greet(@""RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("asSalamu alaikum %s", name);
    }

}