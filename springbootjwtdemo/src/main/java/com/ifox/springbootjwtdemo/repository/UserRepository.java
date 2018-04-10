package com.ifox.springbootjwtdemo.repository;

import com.ifox.springbootjwtdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in10:07 2018/4/10
 * @Modified By:
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
