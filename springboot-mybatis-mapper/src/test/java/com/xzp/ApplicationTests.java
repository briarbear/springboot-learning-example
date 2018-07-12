package com.xzp;

import com.xzp.domain.City;
import com.xzp.domain.User;
import com.xzp.mapper.CityDao;
import com.xzp.mapper.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    UserDao userDao;

    @Autowired
    CityDao cityDao;

    @Test
    public void testOld(){
        List<User> uesr = userDao.getAllUesr();
        System.out.println(uesr.size());
    }

    @Test
    public void testNew(){
        List<City> cities = cityDao.selectAll();
        System.out.println(cities.size());
    }

    @Test
    public void contextLoads() {
    }

}
