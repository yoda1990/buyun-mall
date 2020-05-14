package com.buyun.mall.live.bean;

import com.buyun.mall.live.common.util.jwt.IJWTInfo;

/**
 * @ClassName ClientInfo
 * @Description ClientInfo
 * @Author hmily
 * @Date 2020/5/11 17:00
 * @Version 1.0
 */
public class ClientInfo implements IJWTInfo {
    String clientId;
    String name;
    String id;

    public ClientInfo(String clientId, String name, String id) {
        this.clientId = clientId;
        this.name = name;
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public String getUniqueName() {
        return clientId;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
