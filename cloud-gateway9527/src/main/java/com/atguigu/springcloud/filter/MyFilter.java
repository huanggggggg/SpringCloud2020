package com.atguigu.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class MyFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("dddddddddddddddddd"+exchange.getRequest().getRemoteAddress());
        log.info("================="+exchange.getRequest().getMethodValue());

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;//返回的是过滤其的优先级，月小月大
    }
}
