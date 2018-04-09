package com.ifox.springbootjwt.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:53 2018/4/9
 * @Modified By:
 */
public class PosMonitor {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * POS机ID
     */
    private Integer posId;
    /**
     * Socket会话ID
     */
    private String sessionId;
    /**
     * 最近一次报告时间
     */
    private Date reportTime;
    /**
     * 最近一次报告地址
     */
    private String reportLocation;
    /**
     * 在线状态: 1:在线 2:离线
     */
    private Integer onlineState;
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

    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getReportLocation() {
        return reportLocation;
    }

    public void setReportLocation(String reportLocation) {
        this.reportLocation = reportLocation;
    }

    public Integer getOnlineState() {
        return onlineState;
    }

    public void setOnlineState(Integer onlineState) {
        this.onlineState = onlineState;
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
