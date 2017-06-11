package com.sam.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
//@SpringBootApplication//等同于下面三个注解
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
//@SpringBootApplication(exclude = xxx.class)//关闭jar包中 某些默认配置
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(App.class, args);
    }
}
