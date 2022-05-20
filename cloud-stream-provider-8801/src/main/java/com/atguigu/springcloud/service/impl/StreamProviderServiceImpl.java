package com.atguigu.springcloud.service.impl;


import com.atguigu.springcloud.service.StreamProviderService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(Source.class)//定义消息的推送管道source 是stream 拿管道来，叫source的管道，也叫消息的源头
public class StreamProviderServiceImpl implements StreamProviderService {

    @Resource
    private MessageChannel output;//消息推送的管道， 管道在这里，我是消息管道
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());//通过消息管道发送消息，信息建设者加载消息，一直加载，
        System.out.println("serial***********************"+serial);
        return null;
    }
}
