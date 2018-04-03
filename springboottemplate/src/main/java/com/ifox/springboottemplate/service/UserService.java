package com.ifox.springboottemplate.service;



public interface UserService {
    void creat(String name,Integer age);
    void deleteByName(String name);
    Integer getAllUsers();
    void deleteAllUsers();
}
