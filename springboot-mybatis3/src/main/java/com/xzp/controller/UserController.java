package com.xzp.controller;

import com.github.pagehelper.PageInfo;
import com.xzp.domain.User;
import com.xzp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户类控制器
 *
 * @auther briarbear
 * @blog http://briarbear.github.io
 * @create 2018-07-13-23:24
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public int addUser(User user){
        return userService.insertUser(user);
    }

    @GetMapping("/all")
    public Object findAll(@RequestParam(name = "pageNum",required = false,defaultValue = "1") int pageNum,@RequestParam(name = "pageSize",required = false,defaultValue = "10") int pageSize){

        return userService.findAll(pageNum,pageSize);

    }
}
