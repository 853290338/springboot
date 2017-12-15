package com.zhumeng.shiro.service;

import com.zhumeng.shiro.entity.UserInfo;

public interface UserService {

    /**
     * 根据登陆名查询用户信息
     */
    UserInfo findByUsername(String username);

}
