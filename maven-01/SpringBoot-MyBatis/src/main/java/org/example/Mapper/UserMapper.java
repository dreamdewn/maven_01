package org.example.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.User;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from t_emp")
    public List<User> findAll();

    @Select("select * from t_emp where emp_id=#{username} and emp_name=#{id}")
    public User findByUsername(String username,String id);
}