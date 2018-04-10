package com.keyiu.java.service.impl;

import com.keyiu.java.dao.UserDao;
import com.keyiu.java.domain.User;
import com.keyiu.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findUsers() {
        return userDao.findUsers();
    }

    @Override
    public User createUser(User user) {
        userDao.createUser(user);
//        System.out.println(userDao.createUser(user));
        return user;
    }
}
