package com.stguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SentinelProviderMain9902 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelProviderMain9902.class,args);
    }
}

