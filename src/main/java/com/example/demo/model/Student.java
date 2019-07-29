package com.example.demo.model;

import java.io.Serializable;

/**
 * @author shuweiwang
 * @className Student
 * @description TODO
 * @date 2019-05-22 21:28
 **/
public class Student implements Serializable {

    private static final long serialversionUID = 1L;

    private Integer id;

    private String name;

    private Integer age;

    private String telephoneNumber;

    public Integer getId() {
        return id;
    }

    public Student setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Student setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public Student setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }
}
