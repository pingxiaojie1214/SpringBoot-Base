package com.ping.controller;

import com.ping.exception.UserNotExisitException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author pxj
 */
@Controller
public class HelloWorldController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user) {
        if (user.equals("aaa")) {
            throw new UserNotExisitException();
        }
        return "hello world!";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "你好！");
        return "success";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /*@RequestMapping({"/","/index.html"})
    public String index() {
        return "index";
    }*/

}
