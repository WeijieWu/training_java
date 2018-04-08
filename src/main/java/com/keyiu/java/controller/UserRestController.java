package com.keyiu.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
    @RequestMapping("/")
    public String findAllUsers() {
        return "all users";
    }
}
