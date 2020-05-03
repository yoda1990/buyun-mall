package com.buyun.mall.security.auth.feign;

import com.buyun.mall.security.api.vo.user.UserInfo;
import com.buyun.mall.security.auth.configuration.FeignConfiguration;
import com.buyun.mall.security.auth.util.user.JwtAuthenticationRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName IUserService
 * @Description feign 用户service接口
 * @Author hmily
 * @Date 2020/5/11 17:00
 * @Version 1.0
 */
@FeignClient(value = "cloud-admin", configuration = FeignConfiguration.class)
public interface IUserService {
    @RequestMapping(value = "/api/user/validate", method = RequestMethod.POST)
    public UserInfo validate(@RequestBody JwtAuthenticationRequest authenticationRequest);
}
