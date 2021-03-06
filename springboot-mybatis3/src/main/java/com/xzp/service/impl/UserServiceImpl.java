package com.xzp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzp.dao.UserDao;
import com.xzp.domain.User;
import com.xzp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户服务实现类
 *
 * @auther briarbear
 * @blog http://briarbear.github.io
 * @create 2018-07-13-23:27
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao; //报错不影响

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    /**
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * @return
     */
    @Override
    public PageInfo<User> findAll(int pageNum, int pageSize) {
        ////将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userDao.findAll();
        PageInfo result = new PageInfo(users);

        return result;
    }
}
