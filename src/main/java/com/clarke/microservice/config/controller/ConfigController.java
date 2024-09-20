package com.clarke.microservice.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    
    @GetMapping("/limits")
    public String getLimits(){
        return "Look up the limits of man.";       
    }
}
