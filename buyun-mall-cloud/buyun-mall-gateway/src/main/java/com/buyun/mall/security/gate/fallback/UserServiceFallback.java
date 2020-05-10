package com.buyun.mall.security.gate.fallback;

import com.buyun.mall.security.api.vo.authority.PermissionInfo;
import com.buyun.mall.security.gate.feign.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @ClassName UserServiceFallback
 * @Description 失败回调
 * @Author hmily
 * @Date 2020/5/10 17:09
 * @Version 1.0
 */
@Service
@Slf4j
public class UserServiceFallback implements IUserService {
    @Override
    public List<PermissionInfo> getPermissionByUsername(@PathVariable("username") String username) {
        log.error("调用{}异常{}", "getPermissionByUsername", username);
        return null;
    }

    @Override
    public List<PermissionInfo> getAllPermissionInfo() {
        log.error("调用{}异常", "getPermissionByUsername");
        return null;
    }
}
