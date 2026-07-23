package com.example.service_b.service_b;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service B!";
    }

    @GetMapping("/status")
    public String status() {
        return "Service B - Status: Running on port 8082";
    }
}
