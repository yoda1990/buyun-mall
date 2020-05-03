package com.buyun.mall.common.exception.auth;

import com.buyun.mall.common.constant.CommonConstants;
import com.buyun.mall.common.exception.BaseException;

public class UserInvalidException extends BaseException {
    public UserInvalidException(String message) {
        super(message, CommonConstants.EX_USER_PASS_INVALID_CODE);
    }
}
