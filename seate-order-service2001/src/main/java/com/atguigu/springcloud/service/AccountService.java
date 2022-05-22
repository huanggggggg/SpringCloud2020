package com.atguigu.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;

@EnableFeignClients("seata-account-service")
public interface AccountService {
    //账户金额减少
    @GetMapping("/account/deCrease")
    int deCrease(@Param("userId") Long userId,@Param("money") BigDecimal money);
}
