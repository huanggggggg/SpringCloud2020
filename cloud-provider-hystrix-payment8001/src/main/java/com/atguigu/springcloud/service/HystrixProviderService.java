package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class HystrixProviderService {

    //降级处理
    public String ok(String id){
        return Thread.currentThread().getName()+id+"😊😂😊😊😊😊😊";
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
        return Thread.currentThread().getName()+"ヾ(＠⌒ー⌒＠)ノ";
    }

    public String fallBackMethod(){
        return Thread.currentThread().getName()+"发生错误或者超时的时候调用的函数混合🚀🚀🚀🚀🚀🎈🎈🎈🎈🎈";
    }
}
