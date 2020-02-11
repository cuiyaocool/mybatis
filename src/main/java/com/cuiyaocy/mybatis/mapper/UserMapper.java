package com.cuiyaocy.mybatis.mapper;

import com.cuiyaocy.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectUserByID(Integer id);
}
