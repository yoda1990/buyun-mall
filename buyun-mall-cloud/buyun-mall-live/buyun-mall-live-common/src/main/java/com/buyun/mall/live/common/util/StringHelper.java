package com.buyun.mall.live.common.util;

/**
 * @ClassName StringHelper
 * @Description 字符串工具类
 * @Author hmily
 * @Date 2020/5/3 16:31
 * @Version 1.0
 */
public class StringHelper {
    public static String getObjectValue(Object obj) {
        return obj == null ? "" : obj.toString();
    }
}
