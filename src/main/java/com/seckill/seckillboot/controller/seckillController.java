package com.seckill.seckillboot.controller;

import com.seckill.seckillboot.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerUtils;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@RestController
public class seckillController {


    @Autowired
    private SeckillService seckillService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @GetMapping("test")
    public Object test(){
        HashMap<String, Object> p = new HashMap<>();
        p.put("seckillId",1003);
        return seckillService.search(p);
    }


    @GetMapping("redis/{key}")
    public Object redis(@PathVariable String key){
        stringRedisTemplate.opsForValue().set(key,"test925",30, TimeUnit.MILLISECONDS);
        return stringRedisTemplate.opsForValue().get(key);
    }

    @GetMapping("ehcache/{key}")
    public Object ehcache(@PathVariable String key){
        return seckillService.ehcache(key);
    }

    @GetMapping("ehcache/clean/{key}")
    public Object cleanEhcache(@PathVariable String key){
        seckillService.cleanCache(key);
        return "success";
    }
}
