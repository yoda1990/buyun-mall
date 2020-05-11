package com.buyun.mall.security.admin.rest;


import com.buyun.mall.common.rest.BaseController;
import com.buyun.mall.security.admin.biz.GateLogBiz;
import com.buyun.mall.security.admin.entity.GateLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName GateLogController
 * @Description 网关日志 控制器
 * @Author hmily
 * @Date 2020/5/11 20:41
 * @Version 1.0
 */
@Controller
@RequestMapping("gateLog")
public class GateLogController extends BaseController<GateLogBiz, GateLog> {
//    @RequestMapping(value = "/page",method = RequestMethod.GET)
//    @ResponseBody
//    public TableResultResponse<GateLog> page(@RequestParam(defaultValue = "10") int limit, @RequestParam(defaultValue = "1")int offset, String name){
//        Example example = new Example(GateLog.class);
//        if(StringUtils.isNotBlank(name)) {
//            example.createCriteria().andLike("menu", "%" + name + "%");
//        }
//        int count = baseBiz.selectCountByExample(example);
//        PageHelper.startPage(offset, limit);
//        return new TableResultResponse<GateLog>(count,baseBiz.selectByExample(example));
//    }
}
