package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class HystrixProviderService {

    //ιηΊ§ε€η
    public String ok(String id){
        return Thread.currentThread().getName()+id+"πππππππ";
    }

    @HystrixCommand(fallbackMethod = "fallBackMethod",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
    })
    public String time_out(){
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getName()+"γΎ(οΌ βγΌβοΌ )γ";
    }

    public String fallBackMethod(){
        return Thread.currentThread().getName()+"εηιθ――ζθθΆζΆηζΆεθ°η¨ηε½ζ°ζ··εππππππππππ";
    }
}
