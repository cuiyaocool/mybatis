package com.cuiyaocy.mybatis;

import com.cuiyaocy.mybatis.jdbc.jpa.entity.UserEntity;
import com.cuiyaocy.mybatis.jdbc.jpa.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    UserRepository userRepository;
    @Test
    void contextLoads() {
        UserEntity u1 = new UserEntity("欧文", "刺客", "http://images.com/irving.jpg", "13222111122");
        UserEntity u2 = new UserEntity("库里", "小学生", "http://images.com/curing.jpg", "13222111122");
        UserEntity u3 = new UserEntity("保罗", "船长", "http://images.com/paul.jpg", "13222111122");
        UserEntity u4 = new UserEntity("利拉德", "绝杀", "http://images.com/ddol.jpg", "13222111122");

        userRepository.save(u1);
        userRepository.save(u2);
        userRepository.save(u3);
        userRepository.save(u4);

        Iterable<UserEntity> users = userRepository.findAll();
        for (UserEntity u : users) {
            System.out.println(u);
        }
    }

}
