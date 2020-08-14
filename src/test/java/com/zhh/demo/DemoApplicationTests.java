package com.zhh.demo;

import com.zhh.demo.pojo.Student;
import com.zhh.demo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    StudentService studentService;

    @Test
    public void contextLoads(){
        Student student = studentService.getInfo("1","张三222");
        System.out.println("用户姓名：");
        System.out.println(student.getStuname());
    }
}
