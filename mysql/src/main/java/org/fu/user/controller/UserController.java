package org.fu.user.controller;

import org.fu.user.po.UserPO;
import org.fu.user.service.api.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/getUser")
    public String getUser(){
        UserPO userPO = userService.getOne();
        System.out.println(userPO);
        return "好好";
    }

}
