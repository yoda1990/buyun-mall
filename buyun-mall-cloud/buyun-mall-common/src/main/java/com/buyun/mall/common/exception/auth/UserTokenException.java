package com.buyun.mall.common.exception.auth;

import com.buyun.mall.common.constant.CommonConstants;
import com.buyun.mall.common.exception.BaseException;

public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
