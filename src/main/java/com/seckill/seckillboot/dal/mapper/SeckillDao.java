package com.seckill.seckillboot.dal.mapper;


import com.seckill.seckillboot.dal.bean.SeckillBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

//@Mapper
public interface SeckillDao {

    List<SeckillBean> search(Map<String,Object> params);

}
