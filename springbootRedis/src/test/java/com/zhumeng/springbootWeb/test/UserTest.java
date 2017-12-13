package com.zhumeng.springbootWeb.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhumeng.springbootWeb.SpringbootWebApplication;
import com.zhumeng.springbootWeb.dao.UserDao;
import com.zhumeng.springbootWeb.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootWebApplication.class)
public class UserTest {

    @Autowired
    private UserDao dao;

    @SuppressWarnings("rawtypes")
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void redisTest() {

    }

    @SuppressWarnings("unchecked")
    @Test
    public void testObj() throws Exception {
        User user = new User();
        ValueOperations<String, User> operations = redisTemplate.opsForValue();
        operations.set("com.neox", user);
        operations.set("com.neo.f", user, 1, TimeUnit.SECONDS);
        Thread.sleep(1000);
        // redisTemplate.delete("com.neo.f");
        boolean exists = redisTemplate.hasKey("com.neo.f");
        if (exists) {
            System.out.println("exists is true");
        } else {
            System.out.println("exists is false");
        }
        // Assert.assertEquals("aa", operations.get("com.neo.f").getUserName());
    }

    @Test
    public void test() {

        // Date date = new Date();
        //
        // User user = new User();
        // user.setId(UUID.randomUUID().toString());
        // user.setLastupdateTime(date);
        // user.setCreateTime(date);
        // user.setAddress("sadasdasd");
        // dao.save(user);

        User user = dao.findByAddress("sadasdasd");
        System.out.println("没缓存时调用");
        System.out.println(user);
    }
}
