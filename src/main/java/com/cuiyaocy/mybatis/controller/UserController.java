package com.cuiyaocy.mybatis.controller;

import com.cuiyaocy.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public Object getUserById(@RequestParam Integer id) {
        System.out.println("id is " + id);
        return userService.getUserById(id);
    }
}
