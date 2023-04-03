package com.easy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.easy.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {

}
