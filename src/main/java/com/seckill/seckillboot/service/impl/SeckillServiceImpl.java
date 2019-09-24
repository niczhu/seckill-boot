package com.seckill.seckillboot.service.impl;

import com.seckill.seckillboot.dal.bean.SeckillBean;
import com.seckill.seckillboot.dal.mapper.SeckillDao;
import com.seckill.seckillboot.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SeckillServiceImpl implements SeckillService {

    @Autowired
    private SeckillDao seckillDao;


    @Override
    public List<SeckillBean> search(Map<String, Object> params) {

        return seckillDao.search(new HashMap<>());
    }

}
