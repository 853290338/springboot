package com.zhumeng.MongoDB;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zhumeng.MongoDB.dao.UserDao;
import com.zhumeng.MongoDB.dao.primary.PrimaryRepository;
import com.zhumeng.MongoDB.dao.secondary.SecondRepository;
import com.zhumeng.MongoDB.entity.PrimaryMongoObject;
import com.zhumeng.MongoDB.entity.SecondMongoObject;
import com.zhumeng.MongoDB.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMongoDbApplicationTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PrimaryRepository primaryRepository;

    @Autowired
    private SecondRepository secondaryRepository;

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

    @Test
    public void save() {
        System.out.println("************************************************************");
        System.out.println("测试开始");
        System.out.println("************************************************************");

        this.primaryRepository.save(new PrimaryMongoObject(null, "第一个库的对象"));

        this.secondaryRepository.save(new SecondMongoObject(null, "第二个库的对象"));

        List<PrimaryMongoObject> primaries = this.primaryRepository.findAll();
        for (PrimaryMongoObject primary : primaries) {
            System.out.println(primary.toString());
        }

        List<SecondMongoObject> secondaries = this.secondaryRepository.findAll();

        for (SecondMongoObject secondary : secondaries) {
            System.out.println(secondary.toString());
        }

        System.out.println("************************************************************");
        System.out.println("测试完成");
        System.out.println("************************************************************");
    }
}
