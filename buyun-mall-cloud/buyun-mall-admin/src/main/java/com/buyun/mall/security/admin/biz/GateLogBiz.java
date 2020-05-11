package com.buyun.mall.security.admin.biz;


import com.buyun.mall.common.biz.BaseBiz;
import com.buyun.mall.security.admin.entity.GateLog;
import com.buyun.mall.security.admin.mapper.GateLogMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class GateLogBiz extends BaseBiz<GateLogMapper,GateLog> {

    @Override
    public void insert(GateLog entity) {
        mapper.insert(entity);
    }

    @Override
    public void insertSelective(GateLog entity) {
        mapper.insertSelective(entity);
    }
}
