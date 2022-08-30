package com.cjl.chapter04.controller;

import com.cjl.chapter04.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/person")
public class PersonController {
    @RequestMapping("/xiaoming")
    @ResponseBody
    public String person() {
      return "person, name xiaoming, age 18";
    }

    @RequestMapping("/getPerson")
    public String getUser() {
        Person person = new Person();
        person.setName("xiaoqiang");
        person.setAge(10);
        return person.toString();
    }
}
