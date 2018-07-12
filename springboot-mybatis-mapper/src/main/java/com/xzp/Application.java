package com.xzp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan(basePackages = "com.xzp.mapper")
@MapperScan("com.xzp.mapper")  //如果是使用 通用mapper插件,则使用tk.mybatis.spring.annotation.MapperScan;!!!!!!!!!!
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
