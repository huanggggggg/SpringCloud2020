package com.atguigu.springcloud.service;

public interface StorageService {
    //库存减少
    void deCrease(Long productId,Integer count);
}
