//package com.cjl.chapter04.config;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class WorkedTimeWebConfig {
//    @Bean
//    public FilterRegistrationBean commonWorkerFilterRegistration() {
//        FilterRegistrationBean<WorkedTimeFilter> registration = new FilterRegistrationBean<>();
//        registration.setFilter(new WorkedTimeFilter());
//        registration.addUrlPatterns("/*");
//        registration.setName("WorkedTimeFilter");
//        registration.setOrder(1);
//        return registration;
//    }
//}
