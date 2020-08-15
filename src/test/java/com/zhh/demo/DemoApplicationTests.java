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
        Student student = new Student();
        student.setStuname("五化名");
        student.setPhonenumber("12345678945");
        student.setClassnumber("Computer Class 5");
        int i = studentService.insertStudent(student);
        System.out.println(i);
    }
}
