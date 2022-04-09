package com.yx.tp.mapper;

import com.yx.tp.pojo.UserInfo;
import com.yx.tp.pojo.UserInfoExample;
import com.yx.tp.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper

public interface UserInfoMapper extends MyMapper<UserInfo> {
    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    List<UserInfo> selectByExample(UserInfoExample example);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);
}