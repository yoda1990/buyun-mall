package com.buyun.mall.security.gate.config;

import com.buyun.mall.security.gate.handler.RequestBodyRoutePredicateFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName GatewayConfig
 * @Description 网关配置
 * @Author hmily
 * @Date 2020/5/10 17:09
 * @Version 1.0
 */
@Configuration
public class GatewayConfig {
    @Bean
    RequestBodyRoutePredicateFactory requestBodyRoutePredicateFactory() {
        return new RequestBodyRoutePredicateFactory();
    }
}
