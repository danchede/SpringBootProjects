package com.ifox.springbootaop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in12:51 2018/4/9
 * @Modified By:
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAccess {
    String desc() default "无信息";
}