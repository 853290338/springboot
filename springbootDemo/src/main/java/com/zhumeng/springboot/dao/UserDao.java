package com.zhumeng.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zhumeng.springboot.entity.User;

public interface UserDao extends JpaRepository<User, String> {

}
