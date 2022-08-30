//package com.cjl.chapter04.config;
//
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import java.io.IOException;
//import java.util.Date;
//
//
//@Component
//public class WorkedTimeFilter implements Filter {
//    @Override
//    public void init(FilterConfig para) throws ServletException {
//
//    }
//
//    @Override
//    public void destroy() {
//    }
//
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//        throws IOException, ServletException {
//        System.out.println("work begin");
//        long start = new Date().getTime();
//        chain.doFilter(request, response);
//        long end = new Date().getTime();
//        System.out.println("WorkedTimerFilter end, use total time: " + (end - start));
//
//    }
//
//
//}
