package com.yx.tp.mapper;

import com.yx.tp.pojo.TeachClass;
import com.yx.tp.pojo.TeachClassExample;
import com.yx.tp.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface TeachClassMapper extends MyMapper<TeachClass> {
    long countByExample(TeachClassExample example);

    int deleteByExample(TeachClassExample example);

    List<TeachClass> selectByExample(TeachClassExample example);

    int updateByExampleSelective(@Param("record") TeachClass record, @Param("example") TeachClassExample example);

    int updateByExample(@Param("record") TeachClass record, @Param("example") TeachClassExample example);
}