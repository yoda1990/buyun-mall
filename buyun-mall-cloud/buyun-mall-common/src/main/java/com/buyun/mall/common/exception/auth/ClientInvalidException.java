package com.buyun.mall.common.exception.auth;

import com.buyun.mall.common.constant.CommonConstants;
import com.buyun.mall.common.exception.BaseException;

public class ClientInvalidException extends BaseException {
    public ClientInvalidException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
