package com.stguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class SentinelProviderController {

    public static final HashMap hashMap = new HashMap<>();

    @Value("${server.port}")
    private String serverPort;

    static {
        hashMap.put(1L,new Payment(1L,"第一个对象"));
        hashMap.put(2L,new Payment(2L,"第二个对象"));
        hashMap.put(3L,new Payment(3L,"第三个对象"));

    }

    @GetMapping("/provider/get/{id}")
    public String provider(@PathVariable Long id){
        return hashMap.get(id)+serverPort;
    }
}
