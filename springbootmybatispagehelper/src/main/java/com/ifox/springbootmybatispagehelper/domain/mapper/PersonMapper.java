package com.ifox.springbootmybatispagehelper.domain.mapper;

import com.github.pagehelper.Page;
import com.ifox.springbootmybatispagehelper.domain.entity.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in16:182018/4/4
 * @Modified By:
 */
@Mapper

public interface PersonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    /**
     * 获取所有数据
     * @return
     */
    List<Person> findAll();

    /**
     * 分页查询数据
     * @return
     */
    Page<Person> findByPage();
}
