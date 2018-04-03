package com.ifox.springbootRestful.service.Impl;

import com.ifox.springbootRestful.dao.CityDao;
import com.ifox.springbootRestful.entity.City;
import com.ifox.springbootRestful.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceImpl.class);
   @Autowired
   private CityDao cityDao;
    @Override
    public List<City> findAllCity() {
        LOGGER.info("查找所有的城市");
        return cityDao.findAllCity();
    }

    @Override
    public City findById(Long id) {
        LOGGER.info("根据id查城市："+id);
        return cityDao.findById(id);
    }

    @Override
    public Long saveCity(City city) {
        LOGGER.info("保存城市："+city);
        return cityDao.saveCity(city);
    }

    @Override
    public Long updateCity(City city) {
        LOGGER.info("更新城市:"+city);
        return cityDao.updateCity(city);
    }

    @Override
    public Long deleteCity(Long id) {
        LOGGER.info("根据id删除城市："+id);
        return cityDao.deleteCity(id);
    }

}
