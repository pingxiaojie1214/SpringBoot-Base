package com.ping.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pxj
 */
@RestController
public class HelloController {
    @Value("${person.last-name}")
    private String lastName;

    @Value("#{11*2}")
    private Integer age;

    @Value("true")
    private Boolean boss;

    @RequestMapping("/hello")
    public String sayHello() {
        return "我叫" + lastName + ",我今年" + age + "岁了,我是个" + boss;
    }

}
