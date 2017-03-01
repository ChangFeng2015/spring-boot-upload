package com.springboot.controller;

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
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello()
    {
        return "Hello spring boot!";
    }
}
