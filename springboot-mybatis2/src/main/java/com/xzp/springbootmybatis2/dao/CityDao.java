package com.xzp.springbootmybatis2.dao;

import com.xzp.springbootmybatis2.domain.City;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 * 城市DAO接口类
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-12-16:24
 */
public interface CityDao{

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);


}
