package com.buyun.mall.live.configuration;

import com.buyun.mall.live.interceptor.ClientTokenInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignConfiguration
 * @Description Feign配置
 * @Author hmily
 * @Date 2020/5/11 17:00
 * @Version 1.0
 */
@Configuration
public class FeignConfiguration {
    @Bean
    ClientTokenInterceptor getClientTokenInterceptor(){
        return new ClientTokenInterceptor();
    }
}
