package com.molecrawler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class TestController {

    @GetMapping
    public String hello() {
        return "Hello, World. Seu projeto crawler esta rodando em docker";
    }
}
