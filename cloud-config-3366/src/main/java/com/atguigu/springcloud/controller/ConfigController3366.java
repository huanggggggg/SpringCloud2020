package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController3366 {

    @Value("${server.port}")
    private String serverPort;


    @Value("${config.info}")
    private String configInfo;

    @RequestMapping("/config")
    public String config2(){
        return "端口号"+serverPort+"😥😥😥😥😥😥😥😥😥"+"远程配置"+configInfo;
    }
}
