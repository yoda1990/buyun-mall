package com.buyun.mall.security.auth.client;

import com.buyun.mall.security.auth.client.configuration.AutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @ClassName EnableClientAuthClient
 * @Description 网关配置
 * @Author hmily
 * @Date 2020/5/11 17:00
 * @Version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(AutoConfiguration.class)
@Documented
@Inherited
public @interface EnableClientAuthClient {
}
