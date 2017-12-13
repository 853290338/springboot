package com.zhumeng.springbootWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhumeng.springbootWeb.dao.UserDao;
import com.zhumeng.springbootWeb.pojo.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/getUser")
    @Cacheable(value = "user")
    public User getUser() {

        User user = userDao.findByAddress("sadasdasd");
        System.out.println("sssssss");
        return user;
    }
}
