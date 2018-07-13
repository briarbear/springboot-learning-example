package com.xzp.service;

import com.github.pagehelper.PageInfo;
import com.xzp.domain.User;

/**
 * 用户类服务
 */
public interface UserService {

    int insertUser(User user);
    PageInfo<User> findAll(int pageNum,int pageSize);
}
