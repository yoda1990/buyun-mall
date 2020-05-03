package com.buyun.mall.common.msg.auth;

import com.buyun.mall.common.constant.RestCodeConstants;
import com.buyun.mall.common.msg.BaseResponse;

/**
 * token被禁异常返回
 **/
public class TokenForbiddenResponse  extends BaseResponse {
    public TokenForbiddenResponse(String message) {
        super(RestCodeConstants.TOKEN_FORBIDDEN_CODE, message);
    }
}
