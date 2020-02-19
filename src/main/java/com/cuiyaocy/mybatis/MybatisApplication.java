package com.cuiyaocy.mybatis;

import com.cuiyaocy.mybatis.jdbc.jpa.entity.UserEntity;
import com.cuiyaocy.mybatis.jdbc.jpa.repository.UserRepository;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.cuiyaocy.mybatis.jdbc.mybatis.mapper")
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository) {
        return (args) -> {
            UserEntity u1 = new UserEntity("欧文", "刺客", "jkj", "13222111122");
            UserEntity u2 = new UserEntity("库里", "小学生", "dsf", "13222111122");
            UserEntity u3 = new UserEntity("保罗", "船长", "sdfsf", "13222111122");
            UserEntity u4 = new UserEntity("利拉德", "绝杀", "sdfsfs", "13222111122");

            userRepository.save(u1);
            userRepository.save(u2);
            userRepository.save(u3);
            userRepository.save(u4);

            Iterable<UserEntity> users = userRepository.findAll();
            for (UserEntity u : users) {
                System.out.println(u.toString());
            }
        };
    }

}
