package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.FeignInterface;
import com.atguigu.springcloud.utils.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignConsumerController {

    @Resource
    private FeignInterface feignInterface;

    @GetMapping("/feign/consumer/get/{id}")
    public CommonResult getPayment(@PathVariable(value = "id") long id){
        return feignInterface.getPaymentById(id);
    }

    @GetMapping("/feign/consumer/save")
    public CommonResult savePayment(Payment payment){
        return feignInterface.create(payment);
    }
}
