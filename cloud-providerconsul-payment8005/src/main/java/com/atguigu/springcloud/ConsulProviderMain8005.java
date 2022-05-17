package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProviderMain8005 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulProviderMain8005.class,args);
    }
}
