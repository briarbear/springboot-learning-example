package com.xzp;

import com.xzp.dao.UserDao;
import com.xzp.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    UserDao userDao;

    @Test
    public void contextLoads() {
    }


    @Test
    public void updatemore(){
        User user = new User();
        user.setPassword("789");
        user.setUsername("xzp");

        User user1 = new User();
        user1.setUsername("xzp");
        user1.setPassword("101");

        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);

        userDao.update2(list);

    }
}
