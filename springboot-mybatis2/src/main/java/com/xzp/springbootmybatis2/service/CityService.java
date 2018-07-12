package com.xzp.springbootmybatis2.service;

import com.xzp.springbootmybatis2.domain.City;

/**
 * 城市业务逻辑接口类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-12-16:22
 */
public interface CityService {
    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
