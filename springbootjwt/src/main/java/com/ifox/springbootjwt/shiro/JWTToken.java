package com.ifox.springbootjwt.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:00 2018/4/9
 * @Modified By:
 */
public class JWTToken implements AuthenticationToken {
    // 密钥
    private String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
