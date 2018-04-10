package com.keyiu.java.dao;

import com.keyiu.java.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    List<User> findUsers();
}
