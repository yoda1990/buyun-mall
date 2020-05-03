package com.buyun.mall.security.auth.biz;

import com.buyun.mall.security.auth.entity.Client;
import com.buyun.mall.security.auth.entity.ClientService;
import com.buyun.mall.security.auth.mapper.ClientMapper;
import com.buyun.mall.security.auth.mapper.ClientServiceMapper;
import com.buyun.mall.security.common.biz.BaseBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @ClassName ClientBiz
 * @Description Client 业务
 * @Author hmily
 * @Date 2020/5/11 17:00
 * @Version 1.0
 */
@Service
public class ClientBiz extends BaseBiz<ClientMapper,Client> {
    @Autowired
    private ClientServiceMapper clientServiceMapper;
    @Autowired
    private ClientServiceBiz clientServiceBiz;

    public List<Client> getClientServices(int id) {
        return mapper.selectAuthorityServiceInfo(id);
    }

    public void modifyClientServices(int id, String clients) {
        clientServiceMapper.deleteByServiceId(id);
        if (!StringUtils.isEmpty(clients)) {
            String[] mem = clients.split(",");
            for (String m : mem) {
                ClientService clientService = new ClientService();
                clientService.setServiceId(m);
                clientService.setClientId(id+"");
                clientServiceBiz.insertSelective(clientService);
            }
        }
    }
}