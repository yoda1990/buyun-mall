package com.buyun.mall.common.msg.auth;

import com.buyun.mall.common.constant.RestCodeConstants;
import com.buyun.mall.common.msg.BaseResponse;

/**
 * token错误返回
 **/
public class TokenErrorResponse extends BaseResponse {
    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
