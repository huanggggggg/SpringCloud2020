package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = HystrixConsumerGlobal.class)//这个服务下的所用的方法发生问题后使用这个类下面的降级方法
public interface HystrixConsumerService {
    @GetMapping("/hystrix/provider/getOk/{id}")
    public String ok(@PathVariable(value = "id") String id);


    @GetMapping("/hystrix/provider/getOut")
    public String time_out();

}
