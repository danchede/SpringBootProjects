package com.ifox.springbootRestful.dao;

import com.ifox.springbootRestful.entity.City;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


public interface CityDao {
    List<City> findAllCity();
    City findById(@Param("id")Long id);
    Long saveCity(City city);
    Long updateCity(City city);
    Long deleteCity(Long id);
}
