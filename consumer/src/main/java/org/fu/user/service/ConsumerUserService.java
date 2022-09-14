package org.fu.user.service;

import org.fu.user.po.UserPO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "cloud-mysql-service")
public interface ConsumerUserService {

    /**
     *  根据用户名查询用户信息
     *
     * @param userName 用户名
     * @return 用户信息
     */
    @RequestMapping("/getUser")
    String getUser(@RequestParam("userName")String userName);


    /**
     *  查询所有用户信息
     * @return
     */
    @RequestMapping("/getAllUser")
    String getAllUser();


    /**
     * 添加用户
     * @param userName 用户名
     * @param userAcct 用户昵称
     * @return
     */
    @RequestMapping("/insertUser")
    String insertUser(@RequestParam("userName")String userName,@RequestParam("userAcct")String userAcct);



    /**
     *  修改用户信息
     * @param userName 用户名
     * @param userAcct 用户昵称
     * @return
     */
    @RequestMapping("/updateUser")
    String updateUser(@RequestParam("userName")String userName,@RequestParam("userAcct")String userAcct);



    @RequestMapping("/deleteUser")
    String deleteUser(@RequestParam("userName")String userName);
}
