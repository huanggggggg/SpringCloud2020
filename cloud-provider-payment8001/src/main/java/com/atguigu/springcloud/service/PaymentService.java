package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

public interface PaymentService {
    int create(Payment payment);
    Payment gerPaymentById(Long id);
}
