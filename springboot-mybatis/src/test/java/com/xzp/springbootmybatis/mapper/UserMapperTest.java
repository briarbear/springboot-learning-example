package com.xzp.springbootmybatis.mapper;

import com.xzp.springbootmybatis.SpringbootMybatisApplicationTests;
import com.xzp.springbootmybatis.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@Transactional
public class UserMapperTest extends SpringbootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findByNmae() {
        userMapper.insert("xzp",26);
        User user = userMapper.findByNmae("xzp");
        Assert.assertEquals(26,user.getAge().intValue());
    }

}