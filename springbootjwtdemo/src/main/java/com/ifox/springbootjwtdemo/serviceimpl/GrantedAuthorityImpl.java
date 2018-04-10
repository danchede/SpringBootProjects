package com.ifox.springbootjwtdemo.serviceimpl;

import org.springframework.security.core.GrantedAuthority;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in10:11 2018/4/10
 * @Modified By:    权限类型，负责存储权限和角色
 */
public class GrantedAuthorityImpl implements GrantedAuthority {
    private String authority;

    public GrantedAuthorityImpl(String authority) {
        this.authority = authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
