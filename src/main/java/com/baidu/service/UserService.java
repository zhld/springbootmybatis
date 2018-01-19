package com.baidu.service;

import com.baidu.pojo.User;

import java.util.List;

/**
 * Created by ASUS on 2018/1/16.
 */
public interface UserService {
    public List<User> getList();
    public void addUser(User user);
}
