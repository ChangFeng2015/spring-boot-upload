package com.baitu.shop.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步调用Service demo
 *
 * @author Dave
 * @create 2017-12-23 19:13
 **/
@Service
public class AsyncTaskService {
    @Async
    public void execureAsyncTask(Integer i) {
        System.out.println("execute async task ----- " + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("execute aysnc task +1 -------- " + (++i));
    }
}
