package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    public static final String SERVICE_URl = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/zookeeper")
    public String controller(){
        return restTemplate.getForObject(SERVICE_URl+"/payment/zookeeper",String.class);
    }
}
