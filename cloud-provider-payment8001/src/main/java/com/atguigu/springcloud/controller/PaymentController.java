package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.utils.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        if (i >0) {
            return new CommonResult<>(200,"操作成功"+serverPort,i);
        }
        return new CommonResult(500,"操作失败"+serverPort);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        Payment payment = paymentService.gerPaymentById(id);
        if (payment != null) {
            return new CommonResult<>(200,"查询成功"+serverPort,payment);
        }
        return new CommonResult<>(500,"没有id为"+id+"的用户"+serverPort);
    }
}
