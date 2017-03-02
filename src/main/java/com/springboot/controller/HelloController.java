package com.springboot.controller;

import com.springboot.domain.Demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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

//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @GetMapping(value = "/hello")
    public String hello()
    {
        return content;
    }

    @PostMapping(value = "/hello")
    public Demo getDemo(@RequestParam(value = "id",required = false,defaultValue = "0")long id,
                        @RequestParam(value = "userName",required = false,defaultValue = "Tom")String userName,
                        @RequestParam(value = "age",required = false,defaultValue = "18")int age)
    {
        Demo demo = new Demo();
        demo.setId(id);
        demo.setUserName(userName);
        demo.setAge(age);
        return demo;
    }

}
