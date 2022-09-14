package org.fu.user.service.impl;

import org.fu.user.mapper.UserMapper;
import org.fu.user.po.UserPO;
import org.fu.user.service.api.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
        if (userName == null || userName.length() == 0){
            return null;
        }
        UserPO userPO = userMapper.selectUserByUserName(userName);
        return userPO;
    }



    /**
     *  查询所有用户信息
     * @return
     */
    @Override
    public List<UserPO> getAllUser() {
        List<UserPO> allUser = userMapper.getAllUser();
        if (allUser == null || allUser.size()==0){
            return null;
        }
        return allUser;
    }


    /**
     *  保存用户
     * @param userName 用户名
     * @param userAcct 用户昵称
     * @return
     */
    @Override
    public Boolean insertUser(String userName , String userAcct) {
        if (userName == null || userName.length() < 1 || userAcct == null || userAcct.length() < 1){
            return false;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String createTime = simpleDateFormat.format(new Date());
        UserPO userPO = new UserPO(userName,userAcct,createTime);
        return userMapper.insertUser(userPO);
    }


    /**
     *  根据用户名修改用户昵称
     *  用户名和创建时间不可更改
     *
     * @param userName 用户名
     * @param userAcct 用户昵称
     * @return true：修改成功 false：修改失败
     */
    @Override
    public Boolean updateUser(String userName, String userAcct) {
        if (userName == null || userName.length() < 1 || userAcct == null || userAcct.length() < 1){
            return false;
        }
        return userMapper.updateUser(userName,userAcct);
    }


    /**
     *  根据用户名删除用户
     * @param userName 用户名
     * @return true：删除成功 false：删除失败
     */
    @Override
    public Boolean deleteUser(String userName) {
        if (userName == null || userName.length() < 1){
            return false;
        }
        return userMapper.deleteUser(userName);
    }


}
