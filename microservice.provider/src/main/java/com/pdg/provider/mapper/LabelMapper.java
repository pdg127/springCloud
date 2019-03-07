package com.pdg.provider.mapper;

import com.pdg.common.entity.Label;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LabelMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(Label record);

    int insertSelective(Label record);

    Label selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(Label record);

    int updateByPrimaryKey(Label record);

    List<Label> queryAll();

    Label getOne(Integer lid);
}