package com.zhumeng.springbootWeb.test;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhumeng.springbootWeb.SpringbootWebApplication;
import com.zhumeng.springbootWeb.dao.UserDao;
import com.zhumeng.springbootWeb.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootWebApplication.class)
public class UserTest {

    @Autowired
    private UserDao dao;

    @Test
    public void test() {

        Date date = new Date();

        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setLastupdateTime(date);
        user.setCreateTime(date);
        user.setAddress("sadasdasd");
        dao.save(user);
        System.out.println("sssssssssssssssss");
    }
}
