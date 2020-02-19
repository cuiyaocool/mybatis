package com.cuiyaocy.mybatis.jdbc.jpa.repository;

import com.cuiyaocy.mybatis.jdbc.jpa.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository("userRepository")
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
