package com.seckill.seckillboot.service;

import com.seckill.seckillboot.dal.bean.SeckillBean;

import java.util.List;
import java.util.Map;

public interface SeckillService {

    public List<SeckillBean> search(Map<String,Object> params);

    public Object ehcache(String cacheId);

    public Object cleanCache(String cacheId);

}
