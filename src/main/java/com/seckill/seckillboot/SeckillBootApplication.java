package com.seckill.seckillboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.seckill.seckillboot.dal.mapper")
public class SeckillBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeckillBootApplication.class, args);
	}

}
