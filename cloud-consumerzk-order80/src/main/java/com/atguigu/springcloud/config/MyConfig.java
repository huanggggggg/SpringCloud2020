package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfig {
    @Bean
    @LoadBalanced//不加会报java.net.UnknownHostException: cloud-provider-payment
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
