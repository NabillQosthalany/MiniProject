package com.example.javaapi.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeControler {
    

    @GetMapping
    public String welcome() {
        return "welcome to Spring Boot Rest API";
    }
}
