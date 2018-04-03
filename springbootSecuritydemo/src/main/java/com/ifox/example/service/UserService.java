package com.ifox.example.service;

import com.ifox.example.bean.User;
import com.ifox.example.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private SessionRegistry sessionRegistry;
    @Autowired
    private UserDao userDao;

    public User getById(Integer id) {
        User user = userDao.getById(id);
        return user;
    }
}
