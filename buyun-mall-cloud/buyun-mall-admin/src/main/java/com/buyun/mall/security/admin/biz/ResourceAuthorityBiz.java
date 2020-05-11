package com.buyun.mall.security.admin.biz;

import com.buyun.mall.common.biz.BaseBiz;
import com.buyun.mall.security.admin.entity.ResourceAuthority;
import com.buyun.mall.security.admin.mapper.ResourceAuthorityMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class ResourceAuthorityBiz extends BaseBiz<ResourceAuthorityMapper, ResourceAuthority> {
}
