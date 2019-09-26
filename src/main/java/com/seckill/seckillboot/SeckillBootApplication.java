package com.seckill.seckillboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.seckill.seckillboot.dal.mapper")
@EnableCaching
public class SeckillBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeckillBootApplication.class, args);
	}

}
