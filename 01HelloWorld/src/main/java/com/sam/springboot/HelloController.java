package com.sam.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SamZhao on 2017/6/10.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello, wolcome to SpringBoot!";
    }

}
