package com.atguigu.springcloud.service;


import com.atguigu.springcloud.domain.Order;

public interface OrderService {
    //新增订单
    void saveOrder(Order order);
}
