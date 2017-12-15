package com.zhumeng.springboot.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhumeng.springboot.dao.UserDao;
import com.zhumeng.springboot.entity.User;
import com.zhumeng.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUsers() {

        return userDao.findAll();
    }

    @Override
    public void save(User user) {
        user.setId(UUID.randomUUID().toString());
        userDao.save(user);
    }

    @Override
    public User findUserById(String id) {
        return userDao.findOne(id);
    }

    @Override
    public void edit(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(String id) {
        userDao.delete(id);
    }

}
