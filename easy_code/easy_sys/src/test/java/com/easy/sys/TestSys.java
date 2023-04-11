package com.easy.sys;

import com.easy.entity.SysOper;
import com.easy.mapper.SysOperMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
public class TestSys {
    @Resource
    SysOperMapper sysOperMapper;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void TestOper(){
        SysOper sysOper = sysOperMapper.selectById("1");
        System.out.println(sysOper.getOperName());
    }

    @Test
    public void TestRedis(){
        stringRedisTemplate.opsForValue().set("a","test");
        System.out.println(stringRedisTemplate.opsForValue().get("a"));
    }
}
