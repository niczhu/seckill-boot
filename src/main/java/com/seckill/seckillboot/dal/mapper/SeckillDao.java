package com.seckill.seckillboot.dal.mapper;


import com.seckill.seckillboot.dal.bean.SeckillBean;

import java.util.List;
import java.util.Map;

public interface SeckillDao {

    List<SeckillBean> search(Map<String,Object> params);

}
