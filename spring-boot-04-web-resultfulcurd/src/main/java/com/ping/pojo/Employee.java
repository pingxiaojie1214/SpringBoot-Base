package com.ping.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Employee {
    private Integer id;

    private String name;

    private String sex;

    private Integer age;

    private String claszz;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getClaszz() {
        return claszz;
    }

    public void setClaszz(String claszz) {
        this.claszz = claszz;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Employee(Integer id, String name, String sex, Integer age, String claszz, Date birth) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.claszz = claszz;
        this.birth = birth;
    }

    public Employee() {
    }
}
