package com.xzp.dao;

import com.xzp.domain.User;

import java.util.List;

/**
 * 用户类DAO
 */

//设置了MapperSacn,则这里不需要设置@Mapper

public interface UserDao {
    List<User> findAll();
    int insertUser(User user);
}
