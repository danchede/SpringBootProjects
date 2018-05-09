package com.ifox.springbootspringdatajpashizhan.com.ifox.jpa;

import com.ifox.springbootspringdatajpashizhan.com.ifox.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in20:20 2018/5/9
 * @Modified By:
 */
@Transactional
public interface UserJPA extends JpaRepository<UserEntity,Long>
{
    //查询大于20岁的用户
    @Query(value = "select * from t_user where t_age > ?1",nativeQuery = true)
    public List<UserEntity> nativeQuery(int age);

    //根据用户名、密码删除一条数据
    @Modifying
    @Query(value = "delete from t_user where t_name = ?1 and t_pwd = ?2",nativeQuery = true)
    public void deleteQuery(String name,String pwd);
}