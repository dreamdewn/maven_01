package org.example.dao.Impl;

import cn.hutool.core.io.IoUtil;
import org.example.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {
    public List<String> findAll() {
        InputStream in= this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines= IoUtil.readLines(in, StandardCharsets.UTF_8,new ArrayList<>());
        return lines;
    }
}
