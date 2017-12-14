package com.zhumeng.MongoDB;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zhumeng.MongoDB.dao.UserDao;
import com.zhumeng.MongoDB.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMongoDbApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSave() {
        User user = new User();
        user.setId(11l);
        user.setPassword("asas");
        user.setUsername("asadasdasd");
        userDao.saveUser(user);
    }

    @Test
    public void findUserByName() {
        System.out.println("---------------" + userDao.findUserByUserName("asadasdasd").getId());
    }

    @Test
    public void update() {
        User user = new User();
        user.setId(11l);
        user.setPassword("sdasdasdsasd");
        user.setUsername("asadasfdffffdasd");
        userDao.updateUser(user);
    }

    @Test
    public void deleteUserById() {
        userDao.deleteByUserId(11l);
    }
}
