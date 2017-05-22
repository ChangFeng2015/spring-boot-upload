package com.springboot.aspect;



import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;


/**
 * Created by Dave on 2017/5/22.
 */
@Aspect
@Component
public class HttpAspect {

    private static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Before("execution(public * com.springboot.controller.DemoController.demoList(..))")
    private void log(){
        System.out.println(1111);
    }
}
