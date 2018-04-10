package com.ifox.springbootjwtdemo.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in10:19 2018/4/10
 * @Modified By:
 */
public class UsernameIsExitedException extends AuthenticationException{
    public UsernameIsExitedException(String msg, Throwable t) {
        super(msg, t);
    }

    public UsernameIsExitedException(String msg) {
        super(msg);
    }
}
