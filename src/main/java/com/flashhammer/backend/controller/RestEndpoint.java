package com.flashhammer.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/endpoint")
public class RestEndpoint {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello man!";
    }

    @GetMapping(path = "/getUrls")
    public @ResponseBody List<Map<String, Object>> getUrls() {
        return this.jdbcTemplate.queryForList("select * from testschema.test.testtable;");
    }

}
