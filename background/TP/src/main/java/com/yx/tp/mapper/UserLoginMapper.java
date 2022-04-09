package com.yx.tp.mapper;

import com.yx.tp.pojo.UserLogin;
import com.yx.tp.pojo.UserLoginExample;
import com.yx.tp.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper

public interface UserLoginMapper extends MyMapper<UserLogin> {
    long countByExample(UserLoginExample example);

    int deleteByExample(UserLoginExample example);

    List<UserLogin> selectByExample(UserLoginExample example);

    int updateByExampleSelective(@Param("record") UserLogin record, @Param("example") UserLoginExample example);

    int updateByExample(@Param("record") UserLogin record, @Param("example") UserLoginExample example);
}