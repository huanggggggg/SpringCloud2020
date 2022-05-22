package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageDao {
    //库存减少
    void deCrease(@Param("productId") Long productId, @Param("count") Integer count);
}
