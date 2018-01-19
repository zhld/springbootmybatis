package com.baidu.controller;

import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by ASUS on 2018/1/16.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUsers")
    public List<User> getList(){
        return userService.getList();
    }
    @RequestMapping("/addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "ok";
    }
    @RequestMapping("/getJsp")
    public String getJsp(Model model){

        model.addAttribute("abc","32432432342");
        return "index";
    }
}
