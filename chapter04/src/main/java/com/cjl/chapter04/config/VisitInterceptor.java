//package com.cjl.chapter04.config;
//
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class VisitInterceptor implements HandlerInterceptor {
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//        throws Exception {
//        Object user = request.getSession().getAttribute("vipuser");
//        if (user == null) {
//            request.setAttribute("msg", "充值VIP即可访问");
//            request.getRequestDispatcher("/").forward(request, response);
//            return false;
//        }
//        return  true;
//    }
//}
