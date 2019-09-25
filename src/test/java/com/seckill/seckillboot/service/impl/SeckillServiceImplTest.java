package com.seckill.seckillboot.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SeckillServiceImplTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void redis(){

        redisTemplate.opsForValue().set("name","0925");

        System.out.println(redisTemplate.opsForValue().get("name"));

    }


}
