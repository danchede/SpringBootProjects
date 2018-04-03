package com.ifox.springbootjpa.dao;

import com.ifox.springbootjpa.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in16:122018/4/3
 * @Modified By:
 */

public interface AccountDao extends JpaRepository<Account,Integer>{
}
