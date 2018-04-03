package com.ifox.springbootMybatis.service;

import com.ifox.springbootMybatis.entity.City;

public interface CityService {
    City findCityByName(String cityName);
}
