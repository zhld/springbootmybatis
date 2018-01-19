package com.baidu.mapper;

import com.baidu.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ASUS on 2018/1/16.
 */
public interface UserMapper {
    @Select("select id,username,password from user")
    public List<User> getList();
    @Insert("insert into user(username,password) values (#{username},#{password})")
    public void addUser(User user);
}
