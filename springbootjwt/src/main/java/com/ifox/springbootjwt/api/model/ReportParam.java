package com.ifox.springbootjwt.api.model;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:10 2018/4/9
 * @Modified By:    报告参数
 */
public class ReportParam {
    /**
     * IMEI码
     */
    private String imei;
    /**
     * 位置
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
