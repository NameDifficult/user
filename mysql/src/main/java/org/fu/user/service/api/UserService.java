package org.fu.user.service.api;

import org.fu.user.po.UserPO;

public interface UserService {

    /**
     *      根据用户名查询用户信息
     *          用户信息包含：用户名称，用户昵称，用户的创建时间
     * @param userName
     * @return
     */
    UserPO selectUserByUserName(String userName);


    UserPO getOne();

}
