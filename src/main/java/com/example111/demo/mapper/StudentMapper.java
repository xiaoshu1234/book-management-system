package com.example111.demo.mapper;

import com.example111.demo.model.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shuweiwang
 * @interface StudentMapper
 * @description TODO
 * @date 2019-07-28 18:27
 **/
@Service
public interface StudentMapper {

    @Select("Select id, name, age, telephone_number as telephoneNumber, address from t_student;")
    List<Student> findAll();


}
