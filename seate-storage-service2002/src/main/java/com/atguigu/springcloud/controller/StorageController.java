package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/deCrease")
    public void storage(Long productId,Integer count){
        storageService.deCrease(productId, count);
    }
}
