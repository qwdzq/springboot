package com.cjl.chapter04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Chapter04Application extends SpringBootServletInitializer {

    //重写configure方法使得程序可以配置
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Chapter04Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Chapter04Application.class, args);
    }

}
