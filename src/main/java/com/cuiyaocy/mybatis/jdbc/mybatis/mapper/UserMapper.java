package com.cuiyaocy.mybatis.jdbc.mybatis.mapper;

import com.cuiyaocy.mybatis.jdbc.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectUserByID(Integer id);
}
