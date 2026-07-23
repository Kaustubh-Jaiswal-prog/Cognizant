package com.example.service_a.service_a;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service A!";
    }

    @GetMapping("/info")
    public String info() {
        return "Service A - Port: 8081";
    }
}
