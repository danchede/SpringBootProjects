package com.ifox.springbootjwt.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:40 2018/4/9
 * @Modified By:
 */
public class App {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 应用编号
     */
    private String applicationId;
    /**
     * 应用名称
     */
    private String name;
    /**
     * 版本号
     */
    private String version;
    /**
     * 版本说明
     */
    private String tips;
    /**
     * 归属项目ID
     */
    private Integer projectId;
    /**
     * 发布时间
     */
    private Date publishtime;
    /**
     * 发布范围 1:全网发布 2:灰度发布
     */
    private Integer publishRange;
    /**
     * 操作者ID
     */
    private Integer operatorId;
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

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public Integer getPublishRange() {
        return publishRange;
    }

    public void setPublishRange(Integer publishRange) {
        this.publishRange = publishRange;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
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
