package com.ifox.springbootwebsocket;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in9:55 2018/5/13
 * @Modified By:
 */
public class WiselyReponse {
    private String responseMessage;

    public WiselyReponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
