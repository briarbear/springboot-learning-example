package com.xzp.springbootmybatis2.controller;

import com.xzp.springbootmybatis2.domain.City;
import com.xzp.springbootmybatis2.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取城市信息
 *
 * @author briarbear
 * @blog https://briarbear.github.io
 * @create 2018-07-12-16:19
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @GetMapping(value = "/api/city")
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }

}
