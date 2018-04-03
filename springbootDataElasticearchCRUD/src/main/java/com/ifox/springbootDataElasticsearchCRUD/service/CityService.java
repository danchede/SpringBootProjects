package com.ifox.springbootDataElasticsearchCRUD.service;

import com.ifox.springbootDataElasticsearchCRUD.entity.City;

import java.util.List;

public interface CityService {
    Long saveCity(City city);
    List<City> findByDescriptionAndScore(String description, Integer score);
    List<City> findByDescriptionOrScore(String description, Integer score);
    List<City> findByDescription(String description);
    List<City> findByDescriptionNot(String description);
    List<City> findByDescriptionLike(String description);
}
