package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient//指明是eureka客户端
@EnableCircuitBreaker//开启降级处理和熔断，
@EnableFeignClients//开启feign的服务调用
public class HystrixConsumerMain80 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixConsumerMain80.class,args);
    }
}
