package com.example.sciencemanager.mapper;

import com.example.sciencemanager.bean.Thesis;
import com.example.sciencemanager.bean.ThesisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThesisMapper {
    long countByExample(ThesisExample example);

    int deleteByExample(ThesisExample example);

    int deleteByPrimaryKey(Integer thesisid);

    int insert(Thesis record);

    int insertSelective(Thesis record);

    List<Thesis> selectByExample(ThesisExample example);

    Thesis selectByPrimaryKey(Integer thesisid);

    int updateByExampleSelective(@Param("record") Thesis record, @Param("example") ThesisExample example);

    int updateByExample(@Param("record") Thesis record, @Param("example") ThesisExample example);

    int updateByPrimaryKeySelective(Thesis record);

    int updateByPrimaryKey(Thesis record);
}