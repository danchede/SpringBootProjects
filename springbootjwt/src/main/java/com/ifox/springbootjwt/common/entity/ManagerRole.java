package com.ifox.springbootjwt.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:48 2018/4/9
 * @Modified By:
 */
public class ManagerRole {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 管理用户ID
     */
    private Integer managerId;
    /**
     * 角色ID
     */
    private Integer roleId;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 获取 主键ID.
     *
     * @return 主键ID.
     */
    public Integer getId() {
        return id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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
