package com.buyun.mall.live.client.configuration;

import com.buyun.mall.live.client.config.ServiceAuthConfig;
import com.buyun.mall.live.client.config.UserAuthConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AutoConfiguration
 * @Description Feign使用okhttp配置
 * @Author hmily
 * @Date 2020/5/11 17:00
 * @Version 1.0
 */
@Configuration
@ComponentScan({"com.buyun.mall.security.auth.client"})
//@EnableFeignClients(basePackages = "com.buyun.mall.security.auth.client.feign")
//@EnableConfigurationProperties(value = {CloudAuthClientProperties.class}) // 启用配置
public class AutoConfiguration {
    @Bean
    ServiceAuthConfig getServiceAuthConfig() {
        return new ServiceAuthConfig();
    }

    @Bean
    UserAuthConfig getUserAuthConfig() {
        return new UserAuthConfig();
    }

//    @ConditionalOnClass({org.springframework.web.servlet.handler.HandlerInterceptorAdapter.class,
//            org.springframework.web.servlet.config.annotation.WebMvcConfigurer.class})
//    static class AuthClientInterceptorConfiguration {
//        @Bean
//        ServiceAuthRestInterceptor serviceAuthRestInterceptor() {
//            return new ServiceAuthRestInterceptor();
//        }
//
//        @Bean
//        UserAuthRestInterceptor userAuthRestInterceptor() {
//            return new UserAuthRestInterceptor();
//        }
//
//        // 增加权限验证的拦截器
//        @Bean
//        public org.springframework.web.servlet.config.annotation.WebMvcConfigurer authInterceptorWebMvcConfigurer(ServiceAuthRestInterceptor serviceAuthRestInterceptor,
//                                                                                                                  UserAuthRestInterceptor userAuthRestInterceptor,
//                                                                                                                  CloudAuthClientProperties cloudAuthClientProperties) {
//            return new org.springframework.web.servlet.config.annotation.WebMvcConfigurer() {
//                @Override
//                public void addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry registry) {
//                    /* 服务校验 */
//                    registry.addInterceptor(serviceAuthRestInterceptor).
//                            addPathPatterns(cloudAuthClientProperties.getIncludePathPatterns());
//                    /* 用户校验 */
//                    registry.addInterceptor(userAuthRestInterceptor).
//                            addPathPatterns(cloudAuthClientProperties.getIncludePathPatterns());
//                }
//            };
//        }
//    }


}
