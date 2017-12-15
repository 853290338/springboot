package com.zhumeng.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户
 */
@Entity
@Table(name = "s_user")
public class User {

    @Id
    private String id;

    /**
     * 邮编
     */
    @Column(name = "userName")
    private String userName;

    /**
     * 邮编
     */
    @Column(name = "password")
    private String password;

    /**
     * 详细地址
     */
    @Column(name = "age")
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}