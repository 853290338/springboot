package com.zhumeng.springbootWeb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zhumeng.springbootWeb.pojo.User;

public interface UserDao extends JpaRepository<User, String> {

}
