package com.ifox.springbootspringsecurity.com.ifox.service;

import com.ifox.springbootspringsecurity.com.ifox.entity.UserEntity;
import com.ifox.springbootspringsecurity.com.ifox.jpa.UserJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:39 2018/5/10
 * @Modified By:
 */
public class UserService implements UserDetailsService {
    @Autowired
    UserJpa userJpa;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userJpa.findByUsername(username);
        if(user == null)
        {
            throw new UsernameNotFoundException("未查询到用户："+username+"信息！");
        }
        return user;
    }
}
