package com.keyiu.java.controller;

import com.keyiu.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String findAllUsers() {
        userService.findUsers();
        return "all users";
    }
}
