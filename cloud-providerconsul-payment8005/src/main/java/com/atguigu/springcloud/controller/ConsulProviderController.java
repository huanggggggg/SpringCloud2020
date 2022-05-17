package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ConsulProviderController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/consul/provider")
    public String consulProvider(){
        return "Spring-cloud-Consul:"+serverPort+ UUID.randomUUID();
    }
}
