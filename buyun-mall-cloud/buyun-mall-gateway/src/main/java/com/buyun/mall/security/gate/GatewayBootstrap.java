package com.buyun.mall.security.gate;


import com.buyun.mall.security.auth.client.EnableClientAuthClient;
import com.buyun.mall.security.gate.utils.DBLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName GatewayServerBootstrap
 * @Description 网关主程序
 * @Author hmily
 * @Date 2020/5/10 16:52
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableClientAuthClient
@EnableFeignClients({"com.buyun.mall.security.auth.client.feign","com.buyun.mall.security.gate.feign"})
public class GatewayBootstrap {
    public static void main(String[] args) {
        DBLog.getInstance().start();
        SpringApplication.run(GatewayBootstrap.class, args);
    }
}

