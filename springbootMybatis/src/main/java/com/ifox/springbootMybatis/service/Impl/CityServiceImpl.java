package com.ifox.springbootMybatis.service.Impl;

import com.ifox.springbootMybatis.dao.CityDao;
import com.ifox.springbootMybatis.entity.City;
import com.ifox.springbootMybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;
    @Override
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}
