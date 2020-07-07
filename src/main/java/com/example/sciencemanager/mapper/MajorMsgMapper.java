package com.example.sciencemanager.mapper;

import com.example.sciencemanager.bean.MajorMsg;
import com.example.sciencemanager.bean.MajorMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MajorMsgMapper {
    long countByExample(MajorMsgExample example);

    int deleteByExample(MajorMsgExample example);

    int deleteByPrimaryKey(Integer majorid);

    int insert(MajorMsg record);

    int insertSelective(MajorMsg record);

    List<MajorMsg> selectByExample(MajorMsgExample example);

    MajorMsg selectByPrimaryKey(Integer majorid);

    int updateByExampleSelective(@Param("record") MajorMsg record, @Param("example") MajorMsgExample example);

    int updateByExample(@Param("record") MajorMsg record, @Param("example") MajorMsgExample example);

    int updateByPrimaryKeySelective(MajorMsg record);

    int updateByPrimaryKey(MajorMsg record);
}