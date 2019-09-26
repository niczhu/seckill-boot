package com.seckill.seckillboot.service.impl;

import com.seckill.seckillboot.dal.bean.SeckillBean;
import com.seckill.seckillboot.dal.mapper.SeckillDao;
import com.seckill.seckillboot.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SeckillServiceImpl implements SeckillService {

    @Autowired
    private SeckillDao seckillDao;

    @Override
    public List<SeckillBean> search(Map<String, Object> params) {

        return seckillDao.search(params);
    }

    @Cacheable("#cacheId")
    public Object ehcache(String cacheId){
        System.out.println("ehcache ...."+cacheId);
        return new String("ehcache value");
    }

    @CacheEvict("#cacheId")
    public Object cleanCache(String cacheId) {
        System.out.println("clean cache"+cacheId);
        return null;
    }


}
