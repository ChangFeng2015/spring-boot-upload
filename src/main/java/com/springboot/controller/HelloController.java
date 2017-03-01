package com.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dave on 2017/3/1.
 */
@RestController
@RequestMapping(value = "/ceshi")
public class HelloController
{
    @Value("${cup.maxSize}")
    private String cupMaxSize;

    @Value("${cup.content}")
    private String content;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello()
    {
        return content;
    }
}
