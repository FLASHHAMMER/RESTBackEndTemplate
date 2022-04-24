package com.flashhammer.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/endpoint")
public class RestEndpoint {

    @GetMapping(path = "/getUrls")
    public String getUrls() {

        String response = "Hello man!";
        return response;
    }
    
}
