package com.zhumeng.MongoDB.dao;

import com.zhumeng.MongoDB.entity.User;

public interface UserDao {

    /**
     * 添加用户
     */
    void saveUser(User user);

    /**
     * 根据用户名查询对象
     */
    User findUserByUserName(String username);

    /**
     * 更新用户信息
     */
    void updateUser(User user);

    /**
     * 删除用户信息
     */
    void deleteByUserId(Long id);
}
