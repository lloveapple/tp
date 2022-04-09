package com.yx.tp.mapper;

import com.yx.tp.pojo.ClassResource;
import com.yx.tp.pojo.ClassResourceExample;
import com.yx.tp.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface ClassResourceMapper extends MyMapper<ClassResource> {
    long countByExample(ClassResourceExample example);

    int deleteByExample(ClassResourceExample example);

    List<ClassResource> selectByExample(ClassResourceExample example);

    int updateByExampleSelective(@Param("record") ClassResource record, @Param("example") ClassResourceExample example);

    int updateByExample(@Param("record") ClassResource record, @Param("example") ClassResourceExample example);
}