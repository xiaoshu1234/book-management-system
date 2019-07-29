package com.example111.demo.controller;

import com.example111.demo.model.Student;
import com.example111.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
    
/**
 * @author shuweiwang
 * @className IndexController
 * @description TODO
 * @date 2019-07-28 16:37
 **/
@Controller
@RequestMapping("index")
public class IndexController {


    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<Student> students = studentService.getList();
        modelAndView.addObject("title", "123");
        modelAndView.addObject("students", students);
        return modelAndView;
    }

}
