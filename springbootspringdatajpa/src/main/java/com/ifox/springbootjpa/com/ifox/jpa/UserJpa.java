package com.ifox.springbootjpa.com.ifox.jpa;

import com.ifox.springbootjpa.com.ifox.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in17:01 2018/5/9
 * @Modified By:
 */
public interface UserJpa extends JpaRepository<UserEntity,Long>,JpaSpecificationExecutor<UserEntity>,Serializable {

}
