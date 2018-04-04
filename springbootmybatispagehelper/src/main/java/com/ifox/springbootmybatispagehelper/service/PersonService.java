package com.ifox.springbootmybatispagehelper.service;

import com.github.pagehelper.Page;
import com.ifox.springbootmybatispagehelper.domain.entity.Person;

import java.util.List;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in16:242018/4/4
 * @Modified By:
 */
public interface PersonService {
    List<Person> findAll();

    /**
     * 分页查询
     * @param pageNo 页号
     * @param pageSize 每页显示记录数
     * @return
     */
    Page<Person> findByPage(int pageNo, int pageSize);

    void insert(Person person);
}
