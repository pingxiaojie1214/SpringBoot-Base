package com.ping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author pxj
 */
@RestController
public class HelloController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/hello")
    public Map<String,Object> hello(){
        List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from department");
        return list.get(0);
    }
}
