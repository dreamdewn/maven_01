package org.example;

import org.example.Mapper.UserMapper;
import org.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootMyBatisApplication {

    @Autowired
    private UserMapper userMapper;

    public void testFindAll() {
        List<User> all = userMapper.findAll();
        all.forEach(System.out::println);
    }
}
