package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.ProviderFeignService;
import com.atguigu.springcloud.utils.CommonResult;
import org.springframework.stereotype.Component;
//方法的降级处理方法
@Component(value = "aa")
public class ProviderFeignServiceImpl implements ProviderFeignService {

    @Override
    public CommonResult<Payment> provider(Long id) {
        return new CommonResult<>(404,"🥶🥶🥶🥶🥶");
    }
}
