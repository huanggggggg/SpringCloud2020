package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/get")
    public String get(){
        return serverPort + "正常呢😀😀😀😀😀😀😀😀😀";
    }

    @RequestMapping("/post/{id}")
    public String post(@PathVariable String id){
        return serverPort +"参数id是："+id ;
    }
}
