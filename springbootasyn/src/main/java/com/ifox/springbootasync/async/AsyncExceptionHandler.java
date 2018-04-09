package com.ifox.springbootasync.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:19 2018/4/9
 * @Modified By:
 */
public class AsyncExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncExceptionHandler.class);
    public void handleUncaughtException(Throwable ex, Method method, Object... params) {
        LOGGER.error("Async method has uncaught exception, params:{}" + Arrays.toString(params));

        if (ex instanceof AsyncException) {
            AsyncException asyncException = (AsyncException) ex;
            LOGGER.error("asyncException:"  + asyncException.getMessage());
        }

        LOGGER.error("Exception :", ex);
    }
}
