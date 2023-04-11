package com.easy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author easy
 * @since 2023-04-10
 */
@RestController
@RequestMapping("/sysAuthLog")
public class SysAuthLogController {
    @RequestMapping("/getAuthLog")
    public String getInfo(){
        System.out.println("测试");
        return "sys运行正常";
    }
}
