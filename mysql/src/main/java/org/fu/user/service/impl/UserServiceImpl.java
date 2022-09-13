package org.fu.user.service.impl;

import org.fu.user.mapper.UserMapper;
import org.fu.user.po.UserPO;
import org.fu.user.service.api.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {


    @Resource
    private UserMapper userMapper;



    /**
     *      根据用户名查询用户信息
     *          用户信息包含：用户名称，用户昵称，用户的创建时间
     * @param userName
     * @return
     */
    @Override
    public UserPO selectUserByUserName(String userName) {
        System.out.println("进来了");
        UserPO userPO = userMapper.selectUserByUserName(userName);
        System.out.println(userPO);
        return null;
    }

    @Override
    public UserPO getOne() {
        UserPO one = userMapper.getOne();
        System.out.println(one.getCreateTime());
        return null;
    }
}
