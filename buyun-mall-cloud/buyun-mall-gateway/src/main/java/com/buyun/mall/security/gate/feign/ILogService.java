package com.buyun.mall.security.gate.feign;

import com.buyun.mall.security.api.vo.log.LogInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName ILogService
 * @Description 日志feign
 * @Author hmily
 * @Date 2020/5/10 17:09
 * @Version 1.0
 */
@FeignClient("cloud-admin")
public interface ILogService {
    @RequestMapping(value = "/api/log/save", method = RequestMethod.POST)
    void saveLog(LogInfo info);
}
