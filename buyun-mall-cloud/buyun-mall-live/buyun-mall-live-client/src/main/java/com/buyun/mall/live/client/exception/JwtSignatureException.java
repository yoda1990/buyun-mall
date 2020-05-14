package com.buyun.mall.security.auth.client.exception;

/**
 * @ClassName JwtSignatureException
 * @Description jwt异常定义
 * @Author hmily
 * @Date 2020/5/11 17:00
 * @Version 1.0
 */
public class JwtSignatureException extends Exception {
    public JwtSignatureException(String s) {
        super(s);
    }
}
