package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope//github上的配置放生改变的时候，自动更新
public class ConfigController {


    @Value("${config.info}")
    private String configInfo;

    @RequestMapping("/config")
    public String config(){
        return configInfo;
    }
}
