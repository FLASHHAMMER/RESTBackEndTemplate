package com.flashhammer.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/endpoint")
public class RestEndpoint {

    @GetMapping(path = "/hello")
    public String hello() {
        String response = "Hello man!";
        return response;
    }

    @GetMapping(path = "/getUrls")
    public @ResponseBody Object getUrls() {
        return null;
    }
    
}
