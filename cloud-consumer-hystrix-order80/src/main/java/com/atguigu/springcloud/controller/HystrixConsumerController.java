package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.HystrixConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HystrixConsumerController {

    @Resource
    private HystrixConsumerService hystrixConsumerService;

    @GetMapping("/hystrix/consumer/getOk/{id}")
    public String ok(@PathVariable(value = "id") String id){
        return hystrixConsumerService.ok(id);
    }


    @GetMapping("/hystrix/consumer/getOut")
    public String time_out(){
       return hystrixConsumerService.time_out();
    }

}
