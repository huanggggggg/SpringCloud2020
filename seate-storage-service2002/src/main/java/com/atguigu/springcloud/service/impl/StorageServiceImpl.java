package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.StorageDao;
import com.atguigu.springcloud.service.StorageService;

import javax.annotation.Resource;

public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void deCrease(Long productId, Integer count) {
        storageDao.deCrease(productId,count);
    }
}
