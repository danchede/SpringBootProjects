package com.ifox.springbootMybatis.controller;

import com.ifox.springbootMybatis.entity.City;
import com.ifox.springbootMybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    @Autowired
    CityService cityService;
    @RequestMapping(value = "/api/city",method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value ="cityName", required=true) String cityName){
        return cityService.findCityByName(cityName);
    }
}
