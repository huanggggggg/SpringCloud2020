package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.OrderDao;
import com.atguigu.springcloud.domain.Order;
import com.atguigu.springcloud.service.AccountService;
import com.atguigu.springcloud.service.OrderService;
import com.atguigu.springcloud.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    //新增订单，库存减少，余额减少，
    public void saveOrder(Order order) {
        int i = orderDao.saveOrder(order);
        storageService.deCrease(order.getProductId(),order.getCount());
        accountService.deCrease(order.getUserId(),order.getMoney());
        orderDao.updateOrder(order.getId(),0);
    }
}
