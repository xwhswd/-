package com.example.sciencemanager.mapper;

import com.example.sciencemanager.bean.TrainingProgram;
import com.example.sciencemanager.bean.TrainingProgramExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainingProgramMapper {
    long countByExample(TrainingProgramExample example);

    int deleteByExample(TrainingProgramExample example);

    int deleteByPrimaryKey(Integer serialnum);

    int insert(TrainingProgram record);

    int insertSelective(TrainingProgram record);

    List<TrainingProgram> selectByExample(TrainingProgramExample example);

    TrainingProgram selectByPrimaryKey(Integer serialnum);

    int updateByExampleSelective(@Param("record") TrainingProgram record, @Param("example") TrainingProgramExample example);

    int updateByExample(@Param("record") TrainingProgram record, @Param("example") TrainingProgramExample example);

    int updateByPrimaryKeySelective(TrainingProgram record);

    int updateByPrimaryKey(TrainingProgram record);
}