package com.example.sciencemanager.mapper;

import com.example.sciencemanager.bean.UserMsg;
import com.example.sciencemanager.bean.UserMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMsgMapper {
    long countByExample(UserMsgExample example);

    int deleteByExample(UserMsgExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(UserMsg record);

    int insertSelective(UserMsg record);

    List<UserMsg> selectByExample(UserMsgExample example);

    UserMsg selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") UserMsg record, @Param("example") UserMsgExample example);

    int updateByExample(@Param("record") UserMsg record, @Param("example") UserMsgExample example);

    int updateByPrimaryKeySelective(UserMsg record);

    int updateByPrimaryKey(UserMsg record);
}