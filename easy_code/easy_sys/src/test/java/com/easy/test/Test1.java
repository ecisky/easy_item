package com.easy.test;

import com.easy.mapper.UserMapper;
import com.easy.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test1 {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void Test1(){
        User user = new User();
        user.setName("张三");
        userMapper.insert(user);
    }

}
