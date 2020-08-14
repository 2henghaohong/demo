package com.zhh.demo.controller;

import com.zhh.demo.pojo.Student;
import com.zhh.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/index")
    public String sayHello(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String id,String password){
        Student student = studentService.getInfo(id,password);
        if(student != null){
            return "success";
        }else{
            return "error";
        }
    }
}