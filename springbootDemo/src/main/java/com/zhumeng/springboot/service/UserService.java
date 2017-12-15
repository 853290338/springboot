package com.zhumeng.springboot.service;

import java.util.List;

import com.zhumeng.springboot.entity.User;

public interface UserService {

    /**
     * 查询所有用户
     */
    List<User> findUsers();

    /**
     * 添加用户
     */
    void save(User user);

    /**
     * 根据用户id查询用户信息
     */
    User findUserById(String id);

    /**
     * 编辑用户信息
     */
    void edit(User user);

    /**
     * 删除用户信息
     */
    void delete(String id);

}
