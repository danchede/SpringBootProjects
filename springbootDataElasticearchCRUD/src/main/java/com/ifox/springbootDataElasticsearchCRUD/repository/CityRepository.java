package com.ifox.springbootDataElasticsearchCRUD.repository;

import com.ifox.springbootDataElasticsearchCRUD.entity.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CityRepository extends ElasticsearchRepository<City,Long>{
    List<City> findByDescriptionAndScore(String description,Integer score);
    List<City> findByDescriptionOrScore(String description,Integer score);
    Page<City> findByDescription(String description, Pageable page);
    Page<City> findByDescriptionNot(String description, Pageable page);
    Page<City> findByDescriptionLike(String description, Pageable page);
}
