package com.buyun.mall.security.admin.rpc;

import com.buyun.mall.security.admin.biz.GateLogBiz;
import com.buyun.mall.security.admin.entity.GateLog;
import com.buyun.mall.security.api.vo.log.LogInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @ClassName LogRest
 * @Description 日志记录
 * @Author hmily
 * @Date 2020/5/11 20:41
 * @Version 1.0
 */
@RequestMapping("api")
@RestController
public class LogRest {
    @Autowired
    private GateLogBiz gateLogBiz;
    @RequestMapping(value="/log/save",method = RequestMethod.POST)
    public @ResponseBody void saveLog(@RequestBody LogInfo info){
        GateLog log = new GateLog();
        BeanUtils.copyProperties(info,log);
        log.setCrtTime(new Date(info.getCrtTime()));
        gateLogBiz.insertSelective(log);
    }
}
