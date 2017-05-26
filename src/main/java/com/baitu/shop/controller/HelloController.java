package com.baitu.shop.controller;

import com.baitu.shop.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Dave on 2017/5/24.
 */
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @GetMapping("/index")
    public ModelAndView hello(){
       return new ModelAndView("index");
    }

    @GetMapping("/say")
    public String say(){
        return girlProperties.getAge() + girlProperties.getCupSize();
    }
}
