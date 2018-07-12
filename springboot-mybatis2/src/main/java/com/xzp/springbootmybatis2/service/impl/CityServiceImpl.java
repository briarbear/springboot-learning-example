package com.xzp.springbootmybatis2.service.impl;

import com.xzp.springbootmybatis2.dao.CityDao;
import com.xzp.springbootmybatis2.domain.City;
import com.xzp.springbootmybatis2.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 逻辑实现类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-12-16:24
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
//        return cityDao.selectByPrimaryKey(1);
    }
}
