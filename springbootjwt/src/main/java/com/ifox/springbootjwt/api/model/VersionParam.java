package com.ifox.springbootjwt.api.model;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:11 2018/4/9
 * @Modified By:    APP版本检查接口参数
 */
public class VersionParam {
    /**
     * 机具IMEI码
     */
    private String imei;
    /**
     * 应用ID
     */
    private String applicationId;
    /**
     * 当前版本号
     */
    private String version;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }
}
