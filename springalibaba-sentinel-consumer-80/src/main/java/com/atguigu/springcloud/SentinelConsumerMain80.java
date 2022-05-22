package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients 使用feign做服务调用
public class SentinelConsumerMain80 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelConsumerMain80.class,args);
    }
}
