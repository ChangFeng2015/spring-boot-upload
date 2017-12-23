package com.baitu.shop.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AsyncTaskServiceTest {

    @Inject
    AsyncTaskService asyncTaskService;

    @Test
    public void execureAsyncTask() {
        for (int i = 0; i < 10; i++) {
            asyncTaskService.execureAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
    }

}