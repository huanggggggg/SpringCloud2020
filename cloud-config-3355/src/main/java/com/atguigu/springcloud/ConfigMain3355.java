package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableConfigServer//配置中心用的注解
@EnableEurekaClient

public class ConfigMain3355 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigMain3355.class,args);
    }
}
