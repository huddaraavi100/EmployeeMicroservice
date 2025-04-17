package com.project.employeeMicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/{raavi}/{tina}")
    public String home(@PathVariable("raavi") String commandType,@PathVariable("tina")  String variableName) {
        return "Hello! Your Spring Boot app is running 🚀"+commandType+" "+variableName;
    }
}
