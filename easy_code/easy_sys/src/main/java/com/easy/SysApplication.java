package com.easy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.easy.mapper")
public class SysApplication {
    public static void main(String[] args) {
        SpringApplication.run(SysApplication.class, args);
    }
}
