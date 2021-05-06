package com.example.demo.post.trade.dao;

import com.example.demo.trade.entity.MerInfo;
import com.example.demo.trade.entity.MerInfoExample;
import java.util.List;

public interface MerInfoMapper {
    long countByExample(MerInfoExample example);

    int insert(MerInfo record);

    int insertSelective(MerInfo record);

    List<MerInfo> selectByExample(MerInfoExample example);
}