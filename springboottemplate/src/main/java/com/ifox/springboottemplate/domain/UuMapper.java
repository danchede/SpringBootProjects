package com.ifox.springboottemplate.domain;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UuMapper {
    @Select("SELECT * FROM UU WHERE NAME = #{name}")
    Uu findByName(@Param("name") String name);

    @Insert("INSERT INTO UU(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}
