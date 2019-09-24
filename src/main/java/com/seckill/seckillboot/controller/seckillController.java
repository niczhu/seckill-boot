package com.seckill.seckillboot.controller;

import com.seckill.seckillboot.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class seckillController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private SeckillService seckillService;

    @GetMapping("test")
    public Object test(){
        return seckillService.search(new HashMap<>());
    }

}
