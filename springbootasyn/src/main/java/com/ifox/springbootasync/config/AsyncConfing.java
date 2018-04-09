package com.ifox.springbootasync.config;

import com.ifox.springbootasync.async.AsyncExceptionHandler;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:25 2018/4/9
 * @Modified By:
 */
@Configuration
@EnableAsync
public class AsyncConfing {


    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(100);
        executor.setQueueCapacity(100);
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setAwaitTerminationSeconds(60 * 10);
        executor.setThreadNamePrefix("AsyncThread-");
        executor.initialize(); //如果不初始化，导致找到不到执行器
        return executor;
    }


    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return (AsyncUncaughtExceptionHandler) new AsyncExceptionHandler();
    }
}
