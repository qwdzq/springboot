package com.cjl.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/helloworld")
    public String helloworld() {
        return "hello world,你好世界";
    }
}
