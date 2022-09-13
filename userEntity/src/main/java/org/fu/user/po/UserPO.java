package org.fu.user.po;

public class UserPO {

    /**
     * 用户名
     */
    private String UserName;

    /**
     * 用户昵称
     */
    private String UserAcct;

    /**
     * 创建时间
     */
    private String CreateTime;


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserAcct() {
        return UserAcct;
    }

    public void setUserAcct(String userAcct) {
        UserAcct = userAcct;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }
}
