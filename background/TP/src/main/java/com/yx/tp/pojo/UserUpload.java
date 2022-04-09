package com.yx.tp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_user_upload")
public class UserUpload {
    @Id
    private String id;

    /**
     * 用户账号
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户资源类别
     */
    @Column(name = "user_res_type")
    private String userResType;

    /**
     * 用户资源名
     */
    @Column(name = "user_res_name")
    private String userResName;

    /**
     * 用户资源链接
     */
    @Column(name = "user_res_link")
    private String userResLink;

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
     * 获取用户资源类别
     *
     * @return user_res_type - 用户资源类别
     */
    public String getUserResType() {
        return userResType;
    }

    /**
     * 设置用户资源类别
     *
     * @param userResType 用户资源类别
     */
    public void setUserResType(String userResType) {
        this.userResType = userResType;
    }

    /**
     * 获取用户资源名
     *
     * @return user_res_name - 用户资源名
     */
    public String getUserResName() {
        return userResName;
    }

    /**
     * 设置用户资源名
     *
     * @param userResName 用户资源名
     */
    public void setUserResName(String userResName) {
        this.userResName = userResName;
    }

    /**
     * 获取用户资源链接
     *
     * @return user_res_link - 用户资源链接
     */
    public String getUserResLink() {
        return userResLink;
    }

    /**
     * 设置用户资源链接
     *
     * @param userResLink 用户资源链接
     */
    public void setUserResLink(String userResLink) {
        this.userResLink = userResLink;
    }
}