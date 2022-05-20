package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.utils.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
    //服务的消费者，不需要数据层的lei，消费者和提供者使用RestTemplate链接,封装了访问远程服务的方法的类
    @Resource
    private RestTemplate restTemplate;

//    public static final String PAYMENT_URL="http://127.0.0.1:8001";
    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create( Payment payment){
        String url = PAYMENT_URL +"/payment/create";
        return restTemplate.postForObject(url,payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id){
        String url = PAYMENT_URL + "/payment/get/"+id;
        return restTemplate.getForObject(url,CommonResult.class);
    }


}