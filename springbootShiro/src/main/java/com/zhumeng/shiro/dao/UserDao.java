package com.zhumeng.shiro.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zhumeng.shiro.entity.UserInfo;

public interface UserDao extends JpaRepository<UserInfo, Integer> {

    UserInfo findByUsername(String username);

}
