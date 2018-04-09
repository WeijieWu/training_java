package com.keyiu.java.service.impl;

import com.keyiu.java.dao.UserDao;
import com.keyiu.java.domain.User;
import com.keyiu.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User[] findUsers() {
        User a = userDao.findByName();
//        System.out.println(a);
        return new User[0];
    }
}
