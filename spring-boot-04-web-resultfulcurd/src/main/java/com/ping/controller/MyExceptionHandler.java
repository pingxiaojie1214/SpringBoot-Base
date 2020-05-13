package com.ping.controller;

import com.ping.exception.UserNotExisitException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

        /*@ResponseBody
        @ExceptionHandler(UserNotExisitException.class)
        public Map<String,Object> handleException(Exception e){
            Map<String,Object> map = new HashMap<>();
            map.put("code","user.notexisit");
            map.put("message",e.getMessage());
            return map;
        }*/


    @ExceptionHandler(UserNotExisitException.class)
    public String handleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        //传入我们自己的错误状态码，否则就不会进入定制的错误页面解析流程。
        /*Integer statusCode = (Integer)request.getAttribute("javax.servlet.error.status_code");*/
        //传入我们自己的错误状态码4消息，5xx
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("code", "user.notexisit");
        map.put("message", "用户出错了");
        request.setAttribute("ext", map);
        return "forward:/error";
    }
}
