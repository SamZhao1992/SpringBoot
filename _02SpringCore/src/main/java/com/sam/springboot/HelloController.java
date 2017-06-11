package com.sam.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SamZhao on 2017/6/10.
 */
@RestController
public class HelloController {

    @Value("${test.name}")
    private String name;

    @Value("${test.age}")
    private int age;

    @Autowired
    private UserConfig userConfig;

    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello, wolcome to SpringBoot!---111 name:"+name+"  age:"+age+"...."+userConfig.toString();
    }

}
