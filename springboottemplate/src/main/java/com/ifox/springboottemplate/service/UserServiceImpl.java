package com.ifox.springboottemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void creat(String name, Integer age) {
        jdbcTemplate.update("insert into uu(name,age) VALUES (?,?)",name ,age );
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("DELETE FROM uu  WHERE NAME = ?",name);
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from uu",Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("DELETE FROM uu ");
    }
}
