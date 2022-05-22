package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.ProviderFeignService;
import com.atguigu.springcloud.service.impl.ProviderFeignServiceImpl;
import com.atguigu.springcloud.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProviderFeignController {
    private String ServerUrl = "http://cloudalibaba-sentinel-provider";

//    @Autowired
//    @Qualifier(value = "aa")
    @Resource(type = ProviderFeignServiceImpl.class)
    private ProviderFeignService providerFeignService;

    @GetMapping("/consumer/get/{id}")
    public CommonResult<Payment> get(@PathVariable() Long id){
        return providerFeignService.provider(id);
    }

    //熔断与降级的处理方法
    @GetMapping("/consumer/hhh/{id}")
    @SentinelResource(value = "fallback",fallback = "yyy",blockHandler = "nnn")
    public String hhh(@PathVariable Integer id){
        if (id == 4) {
            throw new IllegalStateException("状态异常");
        }else if (id >4){
            throw new IllegalStateException("hhhh");
        }
        return  "🧠🧠🧠🧠🧠🧠";
    }

    public String yyy(){
        return "🐖🐖🐖🐖🐖👥👣🤼‍♂️👩🏼‍🤝‍👩🏻👩‍👧‍👦👩‍👩‍👧‍👦👭🐎🦁🐱‍🐉👽😈😧🧠🦾🦾🦿👣🤺⛷🤼‍♂️🤼‍♀️";
    }

    public String nnn(){
        return "🥶🥶🥵";
    }
}
