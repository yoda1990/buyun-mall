package com.buyun.mall.live.controller;

import com.buyun.mall.live.biz.ClientBiz;
import com.buyun.mall.live.entity.Client;
import com.buyun.mall.live.entity.ClientService;
import com.buyun.mall.security.common.msg.ObjectRestResponse;
import com.buyun.mall.security.common.rest.BaseController;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName ServiceController
 * @Description Service控制器
 * @Author hmily
 * @Date 2020/5/11 17:00
 * @Version 1.0
 */
@RestController
@RequestMapping("service")
public class ServiceController extends BaseController<ClientBiz, Client> {

    @RequestMapping(value = "/{id}/client", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse modifyUsers(@PathVariable int id, String clients) {
        baseBiz.modifyClientServices(id, clients);
        return new ObjectRestResponse().rel(true);
    }

    @RequestMapping(value = "/{id}/client", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<ClientService> getUsers(@PathVariable int id) {
        return new ObjectRestResponse<ClientService>().rel(true).data(baseBiz.getClientServices(id));
    }
}
