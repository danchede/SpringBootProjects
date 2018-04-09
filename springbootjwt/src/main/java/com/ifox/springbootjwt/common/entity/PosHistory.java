package com.ifox.springbootjwt.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:52 2018/4/9
 * @Modified By:
 */
public class PosHistory {
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
     * 归属网点
     */
    private String location;
    /**
     * 绑定时间
     */
    private Date bindtime;
    /**
     * 解绑时间
     */
    private Date unbindtime;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBindtime() {
        return bindtime;
    }

    public void setBindtime(Date bindtime) {
        this.bindtime = bindtime;
    }

    public Date getUnbindtime() {
        return unbindtime;
    }

    public void setUnbindtime(Date unbindtime) {
        this.unbindtime = unbindtime;
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
