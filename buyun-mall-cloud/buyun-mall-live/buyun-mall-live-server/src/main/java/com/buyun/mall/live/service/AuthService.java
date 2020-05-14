package com.buyun.mall.live.service;

import com.buyun.mall.live.common.util.user.JwtAuthenticationRequest;

public interface AuthService {
    String login(JwtAuthenticationRequest authenticationRequest) throws Exception;

    String refresh(String oldToken) throws Exception;

    void validate(String token) throws Exception;
}
