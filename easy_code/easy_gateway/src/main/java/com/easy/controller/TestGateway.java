package com.easy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gtw")
public class TestGateway {
    @RequestMapping("/test")
    public String getInfo(){
        System.out.println("测试gateway运行");
        return "gateway运行正常";
    }
}
