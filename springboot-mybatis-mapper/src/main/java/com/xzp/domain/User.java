package com.xzp.domain;

/**
 * 用户类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-12-18:37
 */

/**
 * 传统的mybatis
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
