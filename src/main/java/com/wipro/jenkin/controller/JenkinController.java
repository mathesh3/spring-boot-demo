package com.wipro.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class JenkinController {
	@GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}
