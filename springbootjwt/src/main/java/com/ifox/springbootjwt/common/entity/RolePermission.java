package com.ifox.springbootjwt.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:55 2018/4/9
 * @Modified By:
 */
public class RolePermission {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 角色ID
     */
    private Integer roleId;
    /**
     * 权限ID
     */
    private Integer permissionId;
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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
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
