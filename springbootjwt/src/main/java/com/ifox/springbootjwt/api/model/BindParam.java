package com.ifox.springbootjwt.api.model;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:08 2018/4/9
 * @Modified By:    POS绑定网点参数
 */
public class BindParam {
    /**
     * 机具IMEI码
     */
    private String imei;
    /**
     * 归属网点
     */
    private String location;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
