package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.HystrixProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HystrixProviderController {

    @Resource
    private HystrixProviderService hystrixProviderService;

    @GetMapping("/hystrix/provider/getOk/{id}")
    public String ok(@PathVariable(value = "id") String id){
       return hystrixProviderService.ok(id);
    }

    @GetMapping("/hystrix/provider/getOut")
    public String time_out(){
        return hystrixProviderService.time_out();
    }
}
