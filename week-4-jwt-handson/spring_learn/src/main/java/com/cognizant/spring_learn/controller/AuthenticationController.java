package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.util.JwtUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public Map<String,String> authenticate(
            @RequestHeader(HttpHeaders.AUTHORIZATION)
            String authorizationHeader){

        String base64Credentials =
                authorizationHeader.substring("Basic ".length());

        byte[] decoded =
                Base64.getDecoder().decode(base64Credentials);

        String credentials =
                new String(decoded, StandardCharsets.UTF_8);

        String[] values = credentials.split(":",2);

        String username = values[0];
        String password = values[1];

        //For Hands-on
        if(username.equals("user") && password.equals("pwd")){

            String token = JwtUtil.generateToken(username);

            return Map.of("token",token);
        }

        throw new RuntimeException("Invalid Credentials");
    }

}