package com.ping.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

// 使用jpa注解配置映射关系
@Entity // 告诉jpa这是一个实体类 数据库和表的映射
@Table(name = "tbl_user") // table来指定和那个表对应 如果省略就是 user表
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class User {
    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
    private Integer id;

    @Column(name = "last_name", length = 50) // 数据表对应的一个列
    private String lastName;

    @Column // 省略默认列名就是属性名称
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
