package com.buyun.mall.common.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: ClientUtil
 * @Description: http客户端工具类
 * @Author: hmily
 * @Date: 2020/5/3 13:13
 * @Version: 1.0
 */
public class ClientUtil {
	/**
	 * 获取客户端真实ip
	 * @param request
	 * @return
	 */
	public static String getClientIp(HttpServletRequest request){
		String ip = request.getHeader("x-forwarded-for");
		if (ip==null||ip.length()==0||"unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip==null||ip.length()==0||"unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip==null||ip.length()==0||"unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
}
