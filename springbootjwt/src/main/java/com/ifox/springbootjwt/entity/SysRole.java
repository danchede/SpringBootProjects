package com.ifox.springbootjwt.entity;

import com.ifox.springbootjwt.common.entity.Permission;

import java.util.List;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in18:49 2018/4/9
 * @Modified By:
 */
public class SysRole {
    private static final long serialVersionUID = 1L;

    // 拥有的权限列表
    private List<Permission> permissions;
    public SysRole() {
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
