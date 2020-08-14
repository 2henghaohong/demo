package com.zhh.demo.service;

import com.zhh.demo.pojo.Student;

import java.util.List;

public interface StudentService {

    public List<Student> queryStudents();

    public Student getInfo(String id,String password);
}
