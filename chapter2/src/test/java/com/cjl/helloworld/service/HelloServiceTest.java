package com.cjl.helloworld.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class HelloServiceTest {
    @Autowired
    private HelloService helloService;

    @Test
    public void findHelloMsg() {
        Assert.assertEquals("find Hello Msg", helloService.findHelloMsg());
    }
}