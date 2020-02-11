package com.cuiyaocy.mybatis.service;

import com.cuiyaocy.mybatis.mapper.UserMapper;
import com.cuiyaocy.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id) {
        return userMapper.selectUserByID(id);
    }
}
