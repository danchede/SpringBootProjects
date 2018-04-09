package com.ifox.springbootjwt.exception;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in18:54 2018/4/9
 * @Modified By:
 */
public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String msg) {
        super(msg);
    }

    public UnauthorizedException() {
        super();
    }
}
