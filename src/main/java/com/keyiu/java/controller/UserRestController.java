package com.keyiu.java.controller;

import com.keyiu.java.domain.User;
import com.keyiu.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class UserRestController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> findUsers(HttpServletResponse response) {
        response.setStatus(500);
        return userService.findUsers();
    }
    @RequestMapping(value = "user", method = RequestMethod.POST)
    public User createUser(HttpServletResponse response, @RequestBody User user) {
        return userService.createUser(user);
    }
}
