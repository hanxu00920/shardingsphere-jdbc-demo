package com.example.demo.post.trade.dao;

import com.example.demo.trade.entity.OrderInfo;
import com.example.demo.trade.entity.OrderInfoExample;
import java.util.List;

public interface OrderInfoMapper {
    long countByExample(OrderInfoExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    List<OrderInfo> selectByExample(OrderInfoExample example);

    OrderInfo selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}