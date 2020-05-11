package com.buyun.mall.security.admin.biz;


import com.buyun.mall.common.biz.BaseBiz;
import com.buyun.mall.security.admin.entity.GroupType;
import com.buyun.mall.security.admin.mapper.GroupTypeMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class GroupTypeBiz extends BaseBiz<GroupTypeMapper, GroupType> {
}
