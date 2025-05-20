package com.project.employeeMicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/{raavi}/{tina}")
    public String home(@PathVariable String raavi,@PathVariable String tina) {
        return "Hello! Your Spring Boot app is running 🚀"+raavi+" "+tina;
    }
}
