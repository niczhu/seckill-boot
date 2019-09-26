package com.seckill;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

    public static void main(String[] args) {

        DataSourceBuilder.create().build();
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
    }
}
