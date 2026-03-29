package com.mycompany.contactStore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthChecking {

    @GetMapping("/health")
    public String healthCheck() {
        return"work";
    }
}


