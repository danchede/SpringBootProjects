package com.ifox.demo.dao;

import com.ifox.demo.domain.SysUser;

public interface UserDao {
    SysUser findByUserName(String username);
}
