package org.fu.user.controller;

import org.fu.user.service.ConsumerUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private ConsumerUserService mysqlUserService;

    /**
     *  根据用户名查询用户信息
     *
     * @param userName 用户名
     * @return 用户信息
     */
    @RequestMapping("/getUser")
    public String getUser(@RequestParam("userName")String userName){
        return mysqlUserService.getUser(userName);
    }


    /**
     *  查询所有用户信息
     * @return
     */
    @RequestMapping("/getuAllUser")
    public String getAllUser(){
        String allUser = mysqlUserService.getAllUser();
        System.out.println(allUser);
        return allUser;
    }


    /**
     * 添加用户
     * @param userName 用户名
     * @param userAcct 用户昵称
     * @return
     */
    @RequestMapping("/insertUser")
    public String insertUser(@RequestParam("userName")String userName,@RequestParam("userAcct")String userAcct){
        return mysqlUserService.insertUser(userName,userAcct);
    }


    /**
     *  修改用户信息
     * @param userName 用户名
     * @param userAcct 用户昵称
     * @return
     */
    @RequestMapping("/updateUser")
    public String updateUser(@RequestParam("userName")String userName,@RequestParam("userAcct")String userAcct){
        return mysqlUserService.updateUser(userName,userAcct);
    }



    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("userName")String userName){
        return mysqlUserService.deleteUser(userName);
    }
}
