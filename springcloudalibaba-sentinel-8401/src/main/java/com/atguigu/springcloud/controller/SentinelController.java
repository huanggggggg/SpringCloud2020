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
        return serverPort + "æ­£å¸¸å¢ððððððððð";
    }

    @RequestMapping("/post/{id}")
    public String post(@PathVariable String id){
        return serverPort +"åæ°idæ¯ï¼"+id ;
    }
}
