package com.xzp.mapper;

import com.xzp.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 传统的mybatis用法
 * 对应到resource中xml文件
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-12-18:39
 */
@Mapper
public interface UserDao {

    List<User> getAllUesr();
}
