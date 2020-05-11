package com.buyun.mall.security.admin;

import com.ace.cache.EnableAceCache;
import com.buyun.mall.security.auth.client.EnableClientAuthClient;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName AdminBootstrap
 * @Description admin服务住程序
 * @Author hmily
 * @Date 2020/5/11 20:21
 * @Version 1.0
 */
@EnableDiscoveryClient
@RefreshScope
@EnableCircuitBreaker
@SpringBootApplication
@EnableFeignClients({"com.buyun.mall.security.auth.client.feign"})
@EnableScheduling
@EnableClientAuthClient
@EnableAceCache
@EnableTransactionManagement
@MapperScan("com.buyun.mall.security.admin.mapper")
@EnableSwagger2Doc
public class AdminBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AdminBootstrap.class).run(args);    }
}
