package com.keyiu.java.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
    @Value("${spring.datasource.username}")
    private String username;

    @RequestMapping("/")
    public String findAllUsers() {
        System.out.println(this.username);
        return "all users";
    }
}
