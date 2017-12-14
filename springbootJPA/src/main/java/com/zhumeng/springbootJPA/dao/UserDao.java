package com.zhumeng.springbootJPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zhumeng.springbootJPA.pojo.User;

/**
 * dao
 */
public interface UserDao extends JpaRepository<User, String> {

    @Query("select u from User u where u.address = ?")
    User findByAddress(String arrdess);

    User findByName(String name);
}
