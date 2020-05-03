package com.buyun.mall.common.msg;

/**
 * @ClassName: BaseResponse
 * @Description: 基础返回数据类
 * @Author: hmily
 * @Date: 2020/5/3 13/33
 * @Version: 1.0
 */
public class BaseResponse {
    private int status = 200;
    private String message;

    public BaseResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public BaseResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
