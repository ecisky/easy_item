package com.easy.controller;

import com.easy.config.ResultData;
import com.easy.service.TestSysServ;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestSysCtrl {

    private static final Logger logger = LoggerFactory.getLogger(TestSysCtrl.class);
    @Resource
    TestSysServ testSysServ;
    @RequestMapping("/test")
    public String getInfo() {
        logger.info("sys运行正常");
        return "sys运行正常";
    }

    @PostMapping("/getOper")
    public void getOper(HttpServletRequest request) {
       logger.info("getOper方法体开始："+ResultData.init(request));
       logger.info("getOper方法体结束："+ResultData.init(request));
    }

}
