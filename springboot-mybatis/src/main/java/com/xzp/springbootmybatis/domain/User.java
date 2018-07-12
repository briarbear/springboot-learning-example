package com.xzp.springbootmybatis.domain;

/**
 * 用户表
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-12-10:31
 */

public class User {

    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
