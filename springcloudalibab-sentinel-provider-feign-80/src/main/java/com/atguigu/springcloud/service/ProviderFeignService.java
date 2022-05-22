package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.impl.ProviderFeignServiceImpl;
import com.atguigu.springcloud.utils.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "cloudalibaba-sentinel-provider",fallback = ProviderFeignServiceImpl.class)
public interface ProviderFeignService {
    @GetMapping("/provider/get/{id}")
    public CommonResult<Payment> provider(@PathVariable Long id);

}

