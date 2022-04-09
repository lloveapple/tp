package com.yx.tp.service;

import com.yx.ntr3.idworker.Sid;
import com.yx.tp.mapper.UserLoginMapper;
import com.yx.tp.pojo.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserLoginMapper loginMapper;

    @Autowired
    private Sid sid;



    /**
     * @Author YangXiao
     * @Description //TODO 用户是否存在
     * @Date 23:21 2022-04-06
     * @Param
     * @return
     **/
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryUsernameIsExist(String username) {
        UserLogin userLogin = new UserLogin();
        userLogin.setUserId(username);
        UserLogin result =loginMapper.selectOne(userLogin);
        return result != null;
    }
    /**
     * @Author YangXiao
     * @Description //TODO 检查用户密码是否输入正确
     * @Date 23:41 2022-04-06
     * @Param 
     * @return 
     **/
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public UserLogin queryUserForLogin(String userid, String pwd) {
        Example userExample = new Example(UserLogin.class);
        Example.Criteria criteria = userExample.createCriteria();
        criteria.andEqualTo("userId", userid);
        criteria.andEqualTo("passWord", pwd);
        UserLogin result = loginMapper.selectOneByExample(userExample);
        return result;
    }
    /**
     * @Author YangXiao
     * @Description //TODO 新用户注册
     * @Date 23:41 2022-04-06
     * @Param
     * @return
     **/
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public UserLogin saveUser(UserLogin user) {
        String id = sid.nextShort();
        user.setId(id);
        loginMapper.insert(user);
        return user;
    }
}
