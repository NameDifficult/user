package org.fu.user;

import org.fu.user.mapper.UserMapper;
import org.fu.user.service.api.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootTest
public class UserTest {

    @Autowired
    private UserService userService ;

    @Resource
    private UserMapper userMapper;

    @Resource
    private DataSource dataSource;

    @Test
    public void test1(){
        System.out.println(dataSource);
        userService.selectUserByUserName("小明");
//        UserPO userPO = userMapper.selectUserByUserName("小明");
//        System.out.println(userPO);

    }
}
