package com.baitu.shop.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * 异步调用spring config
 *
 * @author Dave
 * @create 2017-12-23 19:26
 **/
@Configuration
@ComponentScan("com.baitu.shop.service")
//开启异步调用
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        //核心线程数，线程会一直存活，即使没有任务需要处理。当线程数小于核心线程数时，
        //即使现有的线程空闲，线程池也会优先创建新的线程来处理任务，而不是直接交给现有的线程。
        //核心线程在allowCoreThreadTimeout被设置为true时会超时退出，默认情况下不会退出。
        threadPoolTaskExecutor.setCorePoolSize(5);
        //如果线程数已等于maxPoolSize,且任务队列已满时，则超出线程池的处理能力，线程池会拒绝处理任务而抛出异常。
        threadPoolTaskExecutor.setMaxPoolSize(10);
        //任务队列容量
        threadPoolTaskExecutor.setQueueCapacity(25);
        threadPoolTaskExecutor.initialize();

        return threadPoolTaskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
