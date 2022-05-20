package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderController {
    @Value("${server.port}")
    private String serverPort;
    @RequestMapping("/provider/get/{id}")
    public String getServerPort(@PathVariable String id){
        return "nacos的port"+serverPort+"参数id"+id;
    }
}
