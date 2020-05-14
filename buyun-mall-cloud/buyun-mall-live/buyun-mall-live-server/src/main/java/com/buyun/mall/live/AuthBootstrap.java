package com.buyun.mall.live;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName AuthBootstrap
 * @Description 授权服务主程序
 * @Author hmily
 * @Date 2020/5/11 17:00
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients
@MapperScan("com.buyun.mall.live.mapper")
@RefreshScope
@EnableDiscoveryClient
public class AuthBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(AuthBootstrap.class, args);
    }
}
