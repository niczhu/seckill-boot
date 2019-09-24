package com.seckill.seckillboot.dal.mapper;


import com.seckill.seckillboot.dal.bean.SeckillBean;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
import java.util.Map;

@MapperScan
public interface SeckillDao {

    List<SeckillBean> search(Map<String,Object> params);

}
