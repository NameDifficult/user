package org.fu.user.service.api;

import org.fu.user.po.UserPO;

import java.util.List;

public interface UserService {

    /**
     *      根据用户名查询用户信息
     *          用户信息包含：用户名称，用户昵称，用户的创建时间
     * @param userName
     * @return
     */
    UserPO selectUserByUserName(String userName);


    /**
     *  查询所有用户信息
     * @return
     */
    List<UserPO> getAllUser();


    /**
     *  添加用户
     * @param userName 用户名
     * @param userAcct 用户昵称
     * @return true:保存成功      false:保存失败
     */
    Boolean insertUser(String userName , String userAcct);


    /**
     *  根据用户名修改用户昵称
     *  用户名和创建时间不可更改
     *
     * @param userName 用户名
     * @param userAcct 用户昵称
     * @return true：修改成功 false：修改失败
     */
    Boolean updateUser(String userName , String userAcct);


    /**
     *  根据用户名删除用户
     * @param userName 用户名
     * @return true：删除成功 false：删除失败
     */
    Boolean deleteUser(String userName);



}
