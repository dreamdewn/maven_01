package org.example.Controller;


import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import java.io.IOException;


@RestController
public class UserController {
//    @RequestMapping("/list")
//    public List<User> list() throws IOException {
//        //inputStream in =new FileInputStream(new File("E:\\前端资料\\MAVEN-01\\maven-01\\spring_boot-01\\src\\main\resources\\user.txt"));
//        InputStream in= this.getClass().getClassLoader().getResourceAsStream("user.txt");
//        ArrayList<String> lines= IoUtil.readLines(in, StandardCharsets.UTF_8,new ArrayList<>());
//
//        List<User> userList = lines.stream().map(line -> {
//            String[] parts = line.split(",");
//            Integer id = Integer.parseInt(parts[0]);
//            String username = parts[1];
//            String password = parts[2];
//            String name = parts[3];
//            Integer age = Integer.parseInt(parts[4]);
//            LocalDate updateTime = LocalDate.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//            return new User(id, username, password, name, age, updateTime);
//        }).toList();
//
//        return userList;
//    }

//      1.
//    @Autowired
//    private UserService userService;

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;

    }

    @RequestMapping("/list")
    public List<User> list() throws IOException {



        List<User> userList = userService.findAll();


        return userList;
    }

}
