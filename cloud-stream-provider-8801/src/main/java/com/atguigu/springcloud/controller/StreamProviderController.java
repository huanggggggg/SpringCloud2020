package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.impl.StreamProviderServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StreamProviderController {
    @Resource
    private StreamProviderServiceImpl streamProviderServiceImpl;

    @RequestMapping(value = "/getMessage",method = RequestMethod.GET )
    public String sendMessage(){
       return streamProviderServiceImpl.send();
    }

}
