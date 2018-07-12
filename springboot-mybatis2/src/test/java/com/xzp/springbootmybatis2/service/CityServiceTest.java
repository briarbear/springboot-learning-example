package com.xzp.springbootmybatis2.service;

import com.xzp.springbootmybatis2.ApplicationTests;
import com.xzp.springbootmybatis2.dao.CityDao;
import com.xzp.springbootmybatis2.domain.City;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class CityServiceTest extends ApplicationTests {

    @Autowired
    private CityService cityService;

    @Test
    public void findCityByName() {
        City cities = cityService.findCityByName("温岭市");
        System.out.println(cities.getDescription());
    }
}