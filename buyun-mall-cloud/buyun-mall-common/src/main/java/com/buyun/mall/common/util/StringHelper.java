package com.buyun.mall.common.util;

/**
 * @ClassName: StringHelper
 * @Description: 字符串操作工具类
 * @Author: hmily
 * @Date: 2020/5/3 13:13
 * @Version: 1.0
 */
public class StringHelper {
    public static String getObjectValue(Object obj){
        return obj==null?"":obj.toString();
    }
}
