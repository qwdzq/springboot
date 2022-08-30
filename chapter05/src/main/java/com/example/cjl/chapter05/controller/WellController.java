package com.example.cjl.chapter05.controller;

import com.example.cjl.chapter05.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WellController {
    @RequestMapping("/well")
// @ResponseBody 注意这里不使用这个注解
    public String well(ModelMap map) {
        map.addAttribute("message", "大家好这是修改过的文字");
        User user = new User( "xiaoming");
        map.addAttribute("user", user);
        //注意这里返回的字符串需要和模板的文件名一致
        return "well";
    }
}






