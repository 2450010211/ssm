package com.lhf.ssm.controller;

import com.lhf.ssm.bean.TUser;
import com.lhf.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shkstart
 * @create 2018-09-03 8:58
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user")
    public List<TUser> getUser(){
        List<TUser> users = userService.getUsers();
        return users;
    }
}
