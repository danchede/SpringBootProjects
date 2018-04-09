package com.ifox.springbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in12:56 2018/4/9
 * @Modified By:
 */
@Component
@Aspect
public class UserAccessAspect {
    @Pointcut(value = "@annotation(com.ifox.springbootaop.aspect.UserAccess)")
    public void access() {

    }

    @Before("access()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println("second before");
    }

    @Around("@annotation(userAccess)")
    public Object around(ProceedingJoinPoint pjp, UserAccess userAccess) {
        //获取注解里的值
        System.out.println("second around:" + userAccess.desc());
        try {
            return pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}
