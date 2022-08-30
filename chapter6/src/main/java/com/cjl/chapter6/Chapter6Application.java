package com.cjl.chapter6;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cjl.chapter6.mapper")
public class Chapter6Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter6Application.class, args);
    }

}
