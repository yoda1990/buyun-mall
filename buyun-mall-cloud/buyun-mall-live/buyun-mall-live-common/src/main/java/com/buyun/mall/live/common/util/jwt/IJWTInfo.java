package com.buyun.mall.live.common.util.jwt;

/**
 * @ClassName IJWTInfo
 * @Description jtw接口
 * @Author hmily
 * @Date 2020/5/3 16:31
 * @Version 1.0
 */
public interface IJWTInfo {
    /**
     * 获取用户名
     * @return
     */
    String getUniqueName();

    /**
     * 获取用户ID
     * @return
     */
    String getId();

    /**
     * 获取名称
     * @return
     */
    String getName();
}
