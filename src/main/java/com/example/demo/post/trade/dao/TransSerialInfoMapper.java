package com.example.demo.post.trade.dao;

import com.example.demo.trade.entity.TransSerialInfo;
import com.example.demo.trade.entity.TransSerialInfoExample;
import java.util.List;

public interface TransSerialInfoMapper {
    long countByExample(TransSerialInfoExample example);

    int deleteByPrimaryKey(Long serialId);

    int insert(TransSerialInfo record);

    int insertSelective(TransSerialInfo record);

    List<TransSerialInfo> selectByExample(TransSerialInfoExample example);

    TransSerialInfo selectByPrimaryKey(Long serialId);

    int updateByPrimaryKeySelective(TransSerialInfo record);

    int updateByPrimaryKey(TransSerialInfo record);
}