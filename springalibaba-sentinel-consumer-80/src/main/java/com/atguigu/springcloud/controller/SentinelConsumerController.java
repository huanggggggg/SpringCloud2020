package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class SentinelConsumerController {
    @Value("${server-url.nacos-user-service}")
    private String serverUrl;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/get/{id}")
    public String get(@PathVariable Long id){
        System.out.println(serverUrl);
        return restTemplate.getForObject(serverUrl+"/provider/get/"+id,String.class);
    }
}
