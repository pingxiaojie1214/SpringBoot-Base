package com.ping.controller;

import com.ping.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello")
    public String sayHello(){
        String hello = helloService.sayHelloPing("董世友");
        return hello;
    }
}
