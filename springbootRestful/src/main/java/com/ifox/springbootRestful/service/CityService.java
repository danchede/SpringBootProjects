package com.ifox.springbootRestful.service;

import com.ifox.springbootRestful.entity.City;

import java.util.List;

public interface CityService{
    List<City> findAllCity();
    City findById(Long id);
    Long saveCity(City city);
    Long updateCity(City city);
    Long deleteCity(Long id);
}
