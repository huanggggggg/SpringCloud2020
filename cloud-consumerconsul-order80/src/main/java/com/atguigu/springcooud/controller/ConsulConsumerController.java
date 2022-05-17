package com.atguigu.springcooud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsulConsumerController {

    public static final String SERVICE_URL="http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consul/consumer")
    public String consulConsumer(){
        return restTemplate.getForObject(SERVICE_URL+"/consul/provider",String.class);
    }
}
