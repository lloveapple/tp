package com.yx.tp.service;

import com.yx.tp.pojo.UserLogin;

public interface UserService {
    /**
     * @Description //用户是否存在
     **/
    public boolean queryUsernameIsExist(String username);
    /**
     * @Description // 检测用户密码是否正确
     **/
    public UserLogin queryUserForLogin(String userid, String pwd);
    /**
     * @Description: 用户注册
     */
    public UserLogin saveUser(UserLogin user);

}
