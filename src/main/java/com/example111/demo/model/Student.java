package com.example111.demo.model;

import javax.lang.model.element.NestingKind;

/**
 * @author shuweiwang
 * @className Student
 * @description TODO
 * @date 2019-07-28 18:27
 **/
public class Student {

    private Integer id;
    private String  name;
    private Integer age;
    private String  telephoneNumber;
    private String  address;

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

    public String getAddress() {
        return address;
    }

    public Student setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
