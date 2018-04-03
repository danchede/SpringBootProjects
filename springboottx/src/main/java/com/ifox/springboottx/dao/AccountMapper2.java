package com.ifox.springboottx.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper2 {
    int update(@Param("money") double money, @Param("id") int  id);
}
