package com.easy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gtw")
public class TestGateway {
    private static final Logger logger = LoggerFactory.getLogger(TestGateway.class);

    @RequestMapping("/test")
    public String getInfo(){
        logger.info("测试gateway运行");
        logger.debug("打印DEBUG级别");
        logger.info("打印INFO级别");
        logger.warn("打印WARN级别");
        logger.error("打印ERROR级别");
        return "gateway运行正常";
    }
}
