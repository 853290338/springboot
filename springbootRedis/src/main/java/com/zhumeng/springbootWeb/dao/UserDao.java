package com.zhumeng.springbootWeb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zhumeng.springbootWeb.pojo.User;

public interface UserDao extends JpaRepository<User, String> {

    @Query("select u from User u where u.address = ?")
    User findByAddress(String arrdess);

}
