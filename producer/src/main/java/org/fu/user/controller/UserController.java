package org.fu.user.controller;

import org.fu.user.po.UserPO;
import org.fu.user.service.api.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @Value("${server.port}")
    private String serverPort;

    /**
     *  根据用户名查询用户信息
     *
     * @param userName 用户名
     * @return 用户信息
     */
    @RequestMapping("/getUser")
    public String getUser(@RequestParam("userName")String userName){
        UserPO userPO = userService.selectUserByUserName(userName);
        if (userPO==null){
            return "未查询到您想要的数据";
        }
        return userPO.toString();
    }


    /**
     *  查询所有用户信息
     * @return
     */
    @RequestMapping("/getAllUser")
    public String getAllUser(){
        List<UserPO> allUser = userService.getAllUser();
        return allUser.toString() +"\t" + serverPort;
    }


    /**
     * 添加用户
     * @param userName 用户名
     * @param userAcct 用户昵称
     * @return
     */
    @RequestMapping("/insertUser")
    public String insertUser(@RequestParam("userName")String userName,@RequestParam("userAcct")String userAcct){
        Boolean insertResult = userService.insertUser(userName, userAcct);
        if (insertResult == false){
            return "保存失败";
        }
        return "保存成功";
    }


    /**
     *  修改用户信息
     * @param userName 用户名
     * @param userAcct 用户昵称
     * @return
     */
    @RequestMapping("/updateUser")
    public String updateUser(@RequestParam("userName")String userName,@RequestParam("userAcct")String userAcct){
        Boolean insertResult = userService.updateUser(userName, userAcct);
        if (insertResult == false){
            return "修改失败";
        }
        return "修改成功";
    }



    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("userName")String userName){
        Boolean deleteResult = userService.deleteUser(userName);
        if (deleteResult == false){
            return "删除失败";
        }
        return "删除成功";
    }





}
