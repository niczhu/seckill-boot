package com.seckill.seckillboot.controller;

import com.seckill.seckillboot.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@RestController
public class seckillController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private SeckillService seckillService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("test")
    public Object test(){
        return seckillService.search(new HashMap<>());
    }
    @GetMapping("redis/{key}")
    public Object redis(@PathVariable String key){
        stringRedisTemplate.opsForValue().set(key,"test925",30, TimeUnit.MILLISECONDS);

        return stringRedisTemplate.opsForValue().get(key);
    }
}
