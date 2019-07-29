package com.example111.demo.service.impl;

import com.example111.demo.mapper.StudentMapper;
import com.example111.demo.model.Student;
import com.example111.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shuweiwang
 * @className StudentServiceImpl
 * @description TODO
 * @date 2019-07-28 18:41
 **/
@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getList() {
        return studentMapper.findAll();
    }
}
