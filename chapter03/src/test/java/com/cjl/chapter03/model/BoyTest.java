package com.cjl.chapter03.model;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class BoyTest {
    @Autowired
    private Boy boy;

    @Test
    void testToString() {
        System.out.printf(boy.toString());
    }
}