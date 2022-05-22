package com.atguigu.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;

@EnableFeignClients(value = "seata-storage-service")
public interface StorageService {
    //库存减少

    @GetMapping("/storage/deCrease")
    int deCrease(@Param("productId") Long productId, @Param("count") Integer count);
}
