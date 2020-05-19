package com.dingpro.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello world";
    }
}
