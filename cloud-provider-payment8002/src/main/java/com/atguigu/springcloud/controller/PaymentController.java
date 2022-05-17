package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import com.atguigu.springcloud.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@Slf4j
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Resource
//    private DiscoveryClient discoveryClient;//对于注册到eureka的服务可以通过该注解获取到他的信息
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;
    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        if (i >0) {
            return new CommonResult<>(200,"操作成功"+serverPort,i);
        }
        return new CommonResult(500,"操作失败"+serverPort);
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        Payment payment = paymentService.gerPaymentById(id);
        if (payment != null) {
            return new CommonResult<>(200,"查询成功"+serverPort,payment);
        }
        return new CommonResult<>(500,"没有id为"+id+"的用户"+serverPort);
    }

    @GetMapping("/payment/discoveryClient")
    public Object getObject(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("eureka中注册的服务"+service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info("服务名称"+instance.getInstanceId()+"服务端口号"+instance.getPort()+"服务的url"+instance.getUri());
        }
        return instances;
    }
}
