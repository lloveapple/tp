package com.yx.tp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_user_info")
public class UserInfo {
    @Id
    private String id;

    /**
     * 用户账号
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 我的头像，如果没有默认给一张
     */
    @Column(name = "user_face_image")
    private String userFaceImage;

    @Column(name = "user_face_image_big")
    private String userFaceImageBig;

    /**
     * 昵称
     */
    @Column(name = "user_nick_name")
    private String userNickName;

    /**
     * 新用户注册后默认后台生成二维码，并且上传到minio
     */
    @Column(name = "user_qrcode")
    private String userQrcode;

    /**
     * 用户说明，如果没有默认
     */
    @Column(name = "user_description")
    private String userDescription;

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
     * 获取我的头像，如果没有默认给一张
     *
     * @return user_face_image - 我的头像，如果没有默认给一张
     */
    public String getUserFaceImage() {
        return userFaceImage;
    }

    /**
     * 设置我的头像，如果没有默认给一张
     *
     * @param userFaceImage 我的头像，如果没有默认给一张
     */
    public void setUserFaceImage(String userFaceImage) {
        this.userFaceImage = userFaceImage;
    }

    /**
     * @return user_face_image_big
     */
    public String getUserFaceImageBig() {
        return userFaceImageBig;
    }

    /**
     * @param userFaceImageBig
     */
    public void setUserFaceImageBig(String userFaceImageBig) {
        this.userFaceImageBig = userFaceImageBig;
    }

    /**
     * 获取昵称
     *
     * @return user_nick_name - 昵称
     */
    public String getUserNickName() {
        return userNickName;
    }

    /**
     * 设置昵称
     *
     * @param userNickName 昵称
     */
    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    /**
     * 获取新用户注册后默认后台生成二维码，并且上传到minio
     *
     * @return user_qrcode - 新用户注册后默认后台生成二维码，并且上传到minio
     */
    public String getUserQrcode() {
        return userQrcode;
    }

    /**
     * 设置新用户注册后默认后台生成二维码，并且上传到minio
     *
     * @param userQrcode 新用户注册后默认后台生成二维码，并且上传到minio
     */
    public void setUserQrcode(String userQrcode) {
        this.userQrcode = userQrcode;
    }

    /**
     * 获取用户说明，如果没有默认
     *
     * @return user_description - 用户说明，如果没有默认
     */
    public String getUserDescription() {
        return userDescription;
    }

    /**
     * 设置用户说明，如果没有默认
     *
     * @param userDescription 用户说明，如果没有默认
     */
    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }
}