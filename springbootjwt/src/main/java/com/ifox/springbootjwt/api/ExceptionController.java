package com.ifox.springbootjwt.api;

import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in18:56 2018/4/9
 * @Modified By:
 */
/**
 * 注意这个统一异常处理器只对认证过的用户调用接口中的异常有作用，对AuthenticationException没有用
 */
@RestControllerAdvice

public class ExceptionController {

}
