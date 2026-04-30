package com.dmgomdels.lojaRopas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ControlerHello {

    @GetMapping
    public String sayHello() {
        return "<h1>Hello World</h1>";
    }
}
