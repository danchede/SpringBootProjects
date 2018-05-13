package com.ifox.springbootspringsecurity.com.ifox.jpa;

import com.ifox.springbootspringsecurity.com.ifox.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:39 2018/5/10
 * @Modified By:
 */
public interface UserJpa extends JpaRepository<UserEntity,Long> {
    //使用SpringDataJPA方法定义查询
    public UserEntity findByUsername(String username);
}
