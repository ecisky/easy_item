package com.easy.service.impl;

import com.easy.entity.SysOper;
import com.easy.mapper.SysOperMapper;
import com.easy.service.TestSysServ;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TestSysServImpl implements TestSysServ {
    @Resource
    SysOperMapper sysOperMapper;
    @Override
    public SysOper getOperator(String id) {
        return sysOperMapper.selectById(id);
    }
}
