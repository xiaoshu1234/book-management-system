package com.example.demo.controller;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author shuweiwang
 * @className HelloController
 * @description TODO
 * @date 2019-05-22 20:39
 **/
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/index")
    @ResponseBody
    public List<Student> index() {
        return studentMapper.findAll();
    }

    @RequestMapping("/index2")
    @ResponseBody
    public List<Student> index2() {
        return studentMapper.findAll();
    }

}
