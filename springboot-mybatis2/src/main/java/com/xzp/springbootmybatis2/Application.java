package com.xzp.springbootmybatis2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan(basePackages = "com.xzp.springbootmybatis2.dao")
//@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.xzp.springbootmybatis2.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
