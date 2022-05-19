package com.atguigu.springcloud.service;


import org.springframework.stereotype.Component;

@Component
public class HystrixConsumerGlobal implements HystrixConsumerService{
    @Override
    public String ok(String id) {
        return "九点三零附近";
    }

    @Override
    public String time_out() {
        return "sdpifjodlsij ";
    }
}
