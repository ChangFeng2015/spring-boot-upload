package com.baitu.shop.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @author Dave
 * @create 2017-11-16 23:02
 **/

@Data
@AllArgsConstructor
public class Inventor {

    private String name;
    private Date birthday;
    private String nationality;
}
