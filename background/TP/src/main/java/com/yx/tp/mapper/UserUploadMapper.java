package com.yx.tp.mapper;

import com.yx.tp.pojo.UserUpload;
import com.yx.tp.pojo.UserUploadExample;
import com.yx.tp.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper

public interface UserUploadMapper extends MyMapper<UserUpload> {
    long countByExample(UserUploadExample example);

    int deleteByExample(UserUploadExample example);

    List<UserUpload> selectByExample(UserUploadExample example);

    int updateByExampleSelective(@Param("record") UserUpload record, @Param("example") UserUploadExample example);

    int updateByExample(@Param("record") UserUpload record, @Param("example") UserUploadExample example);
}