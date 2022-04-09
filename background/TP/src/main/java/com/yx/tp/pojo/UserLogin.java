package com.yx.tp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_user_login")
public class UserLogin {
    @Id
    private String id;

    /**
     * 用户账号
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 密码
     */
    @Column(name = "pass_word")
    private String passWord;

    /**
     * 用户类别
     */
    @Column(name = "user_Type")
    private String userType;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户账号
     *
     * @return user_id - 用户账号
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户账号
     *
     * @param userId 用户账号
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取密码
     *
     * @return pass_word - 密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置密码
     *
     * @param passWord 密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取用户类别
     *
     * @return user_Type - 用户类别
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置用户类别
     *
     * @param userType 用户类别
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }
}