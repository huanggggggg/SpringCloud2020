package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {
    //新增订单
    int saveOrder(Order order);
    //修改订单状态
    int updateOrder(@Param("id") Long id, Integer status);
}
