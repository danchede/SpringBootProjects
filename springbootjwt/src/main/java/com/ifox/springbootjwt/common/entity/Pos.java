package com.ifox.springbootjwt.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:51 2018/4/9
 * @Modified By:
 */
public class Pos {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 机具IMEI码
     */
    private String imei;
    /**
     * 序列号(SN)
     */
    private String sn;
    /**
     * 机具型号
     */
    private String series;
    /**
     * Android版本
     */
    private String androidVersion;
    /**
     * 版本号
     */
    private String version;
    /**
     * 归属网点
     */
    private String location;
    /**
     * 归属项目ID
     */
    private Integer projectId;
    /**
     * 入网时间
     */
    private Date jointime;
    /**
     * 绑定时间
     */
    private Date bindtime;
    /**
     * 产权方
     */
    private String owner;
    /**
     * 备注
     */
    private String tips;
    /**
     * 机具状态: 1:正常 2:故障 3:维修中(返厂) 4:已禁用(丢失) 5:已停用(回收)
     */
    private Integer posState;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新时间
     */
    private Date updatedTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public Date getBindtime() {
        return bindtime;
    }

    public void setBindtime(Date bindtime) {
        this.bindtime = bindtime;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public Integer getPosState() {
        return posState;
    }

    public void setPosState(Integer posState) {
        this.posState = posState;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    protected Serializable pkVal() {
        return this.id;
    }

}
