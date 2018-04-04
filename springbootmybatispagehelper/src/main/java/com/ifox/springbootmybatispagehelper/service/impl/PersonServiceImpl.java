package com.ifox.springbootmybatispagehelper.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ifox.springbootmybatispagehelper.domain.entity.Person;
import com.ifox.springbootmybatispagehelper.domain.mapper.PersonMapper;
import com.ifox.springbootmybatispagehelper.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in16:252018/4/4
 * @Modified By:
 */
@Service
@Transactional(readOnly = true)
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> findAll() {
        return personMapper.findAll();
    }

    @Override
    public Page<Person> findByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        return personMapper.findByPage();
    }

    @Override
    @Transactional
    public void insert(Person person) {
        personMapper.insert(person);
    }
}
