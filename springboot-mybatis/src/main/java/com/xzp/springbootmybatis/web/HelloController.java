package com.xzp.springbootmybatis.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello控制器
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-12-10:23
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello world";
    }
}
