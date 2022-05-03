package com.sk.skspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping
    public String hello() {
        return "Hi there, This is Sai Krishna running Spring Boot CI/CP pipeline AWS ";
    }

}
