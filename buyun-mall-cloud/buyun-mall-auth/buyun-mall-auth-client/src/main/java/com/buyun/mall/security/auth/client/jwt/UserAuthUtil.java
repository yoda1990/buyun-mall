package com.buyun.mall.security.auth.client.jwt;

import com.buyun.mall.security.auth.client.config.UserAuthConfig;
import com.buyun.mall.security.auth.common.util.jwt.IJWTInfo;
import com.buyun.mall.security.auth.common.util.jwt.JWTHelper;
import com.buyun.mall.common.exception.auth.UserTokenException;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName UserAuthUtil
 * @Description 用户授权 工具类
 * @Author hmily
 * @Date 2020/5/11 17:00
 * @Version 1.0
 */
@Configuration
public class UserAuthUtil {
    @Autowired
    private UserAuthConfig userAuthConfig;

    public IJWTInfo getInfoFromToken(String token) throws Exception {
        try {
            return JWTHelper.getInfoFromToken(token, userAuthConfig.getPubKeyByte());
        } catch (ExpiredJwtException ex) {
            throw new UserTokenException("User token expired!");
        } catch (SignatureException ex) {
            throw new UserTokenException("User token signature error!");
        } catch (IllegalArgumentException ex) {
            throw new UserTokenException("User token is null or empty!");
        }
    }
}
