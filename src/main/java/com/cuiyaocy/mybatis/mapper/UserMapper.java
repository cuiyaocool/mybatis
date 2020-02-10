package com.cuiyaocy.mybatis.mapper;

import com.cuiyaocy.mybatis.model.User;

public interface UserMapper {
    User selectUserByID(Integer id);
}
