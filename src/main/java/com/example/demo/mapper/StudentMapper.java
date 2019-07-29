package com.example.demo.mapper;

import com.example.demo.model.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shuweiwang
 * @interface StudentMapper
 * @description TODO
 * @date 2019-05-22 21:28
 **/
@Service
public interface StudentMapper {

    @Select("select id, name, age , telephone_number telephoneNumber from t_student")
    List<Student> findAll();


    @Select()
    List<Student> findAll2();
}
