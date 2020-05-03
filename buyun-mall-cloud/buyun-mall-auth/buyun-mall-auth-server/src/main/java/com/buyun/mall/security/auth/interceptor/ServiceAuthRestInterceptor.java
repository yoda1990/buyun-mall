package com.buyun.mall.security.auth.interceptor;

import com.buyun.mall.security.auth.common.util.jwt.IJWTInfo;
import com.buyun.mall.security.auth.configuration.ClientConfiguration;
import com.buyun.mall.security.auth.service.AuthClientService;
import com.buyun.mall.security.auth.util.client.ClientTokenUtil;
import com.buyun.mall.common.exception.auth.ClientForbiddenException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName ServiceAuthRestInterceptor
 * @Description 服务授权拦截器
 * @Author hmily
 * @Date 2020/5/11 17:00
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class ServiceAuthRestInterceptor extends HandlerInterceptorAdapter {
    private Logger logger = LoggerFactory.getLogger(ServiceAuthRestInterceptor.class);

    @Autowired
    private ClientTokenUtil clientTokenUtil;
    @Autowired
    private AuthClientService authClientService;
    @Autowired
    private ClientConfiguration clientConfiguration;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        String token = request.getHeader(clientConfiguration.getClientTokenHeader());
        IJWTInfo infoFromToken = clientTokenUtil.getInfoFromToken(token);
        String uniqueName = infoFromToken.getUniqueName();
        for (String client : authClientService.getAllowedClient(clientConfiguration.getClientId())) {
            if (client.equals(uniqueName)) {
                return super.preHandle(request, response, handler);
            }
        }
        throw new ClientForbiddenException("Client is Forbidden!");
    }
}
