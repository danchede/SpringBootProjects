package com.ifox.springbootMybatis.dao;

import com.ifox.springbootMybatis.entity.City;
import org.apache.ibatis.annotations.Param;

public interface CityDao {
    City findByName(@Param("cityName") String cityName);
}
