package com.springboot.controller;

import com.springboot.properties.CupProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dave on 2017/3/1.
 */
@RestController
@RequestMapping(value = "/property")
public class PropertyController
{

    @Autowired
    private CupProperties cupProperties;

    @RequestMapping(value = "/cupInfo")
    public String getCupInfo()
    {
        return cupProperties.getContent()
                + cupProperties.getMaxSize()
                + cupProperties.getMinSize();
    }
}
