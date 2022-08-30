package com.cjl.helloworld.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String findHelloMsg(){
        return "find Hello Msg";
    }
}
