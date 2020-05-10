package com.buyun.mall.security.gate.feign;

import com.buyun.mall.security.api.vo.authority.PermissionInfo;
import com.buyun.mall.security.gate.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @ClassName IUserService
 * @Description 用户feign
 * @Author hmily
 * @Date 2020/5/10 17:09
 * @Version 1.0
 */
@FeignClient(value = "cloud-admin", fallback = UserServiceFallback.class)
public interface IUserService {
    @RequestMapping(value = "/api/user/un/{username}/permissions", method = RequestMethod.GET)
    public List<PermissionInfo> getPermissionByUsername(@PathVariable("username") String username);

    @RequestMapping(value = "/api/permissions", method = RequestMethod.GET)
    List<PermissionInfo> getAllPermissionInfo();
}
