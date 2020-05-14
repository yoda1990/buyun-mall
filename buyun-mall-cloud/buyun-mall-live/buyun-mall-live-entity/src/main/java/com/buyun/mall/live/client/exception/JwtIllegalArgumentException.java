package com.buyun.mall.live.client.exception;

/**
 * @ClassName JwtIllegalArgumentException
 * @Description jwt异常定义
 * @Author hmily
 * @Date 2020/5/11 17:00
 * @Version 1.0
 */
public class JwtIllegalArgumentException extends Exception {
    public JwtIllegalArgumentException(String s) {
        super(s);
    }
}
