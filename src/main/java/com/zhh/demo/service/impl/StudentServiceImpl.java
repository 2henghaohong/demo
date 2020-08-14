package com.zhh.demo.service.impl;

import com.zhh.demo.mapper.StudentMapper;
import com.zhh.demo.pojo.Student;
import com.zhh.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> queryStudents() {
        return studentMapper.selectByExample(null);
    }

    @Override
    public Student getInfo(String id, String password) {
        Student student = studentMapper.selectByPrimaryKey(Integer.parseInt(id));
        return student;
    }
}
