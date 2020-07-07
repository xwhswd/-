package com.example.sciencemanager.mapper;

import com.example.sciencemanager.bean.InventorMsg;
import com.example.sciencemanager.bean.InventorMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InventorMsgMapper {
    long countByExample(InventorMsgExample example);

    int deleteByExample(InventorMsgExample example);

    int deleteByPrimaryKey(String inventorname);

    int insert(InventorMsg record);

    int insertSelective(InventorMsg record);

    List<InventorMsg> selectByExample(InventorMsgExample example);

    InventorMsg selectByPrimaryKey(String inventorname);

    int updateByExampleSelective(@Param("record") InventorMsg record, @Param("example") InventorMsgExample example);

    int updateByExample(@Param("record") InventorMsg record, @Param("example") InventorMsgExample example);

    int updateByPrimaryKeySelective(InventorMsg record);

    int updateByPrimaryKey(InventorMsg record);
}