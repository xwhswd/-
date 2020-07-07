package com.example.sciencemanager.mapper;

import com.example.sciencemanager.bean.PatentMsg;
import com.example.sciencemanager.bean.PatentMsgExample;
import com.example.sciencemanager.bean.PatentMsgKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatentMsgMapper {
    long countByExample(PatentMsgExample example);

    int deleteByExample(PatentMsgExample example);

    int deleteByPrimaryKey(PatentMsgKey key);

    int insert(PatentMsg record);

    int insertSelective(PatentMsg record);

    List<PatentMsg> selectByExample(PatentMsgExample example);

    PatentMsg selectByPrimaryKey(PatentMsgKey key);

    int updateByExampleSelective(@Param("record") PatentMsg record, @Param("example") PatentMsgExample example);

    int updateByExample(@Param("record") PatentMsg record, @Param("example") PatentMsgExample example);

    int updateByPrimaryKeySelective(PatentMsg record);

    int updateByPrimaryKey(PatentMsg record);
}