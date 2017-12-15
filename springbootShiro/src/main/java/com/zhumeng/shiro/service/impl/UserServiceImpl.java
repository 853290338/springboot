package com.zhumeng.shiro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhumeng.shiro.dao.UserDao;
import com.zhumeng.shiro.entity.UserInfo;
import com.zhumeng.shiro.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserInfo findByUsername(String username) {

        return userDao.findByUsername(username);
    }

}
