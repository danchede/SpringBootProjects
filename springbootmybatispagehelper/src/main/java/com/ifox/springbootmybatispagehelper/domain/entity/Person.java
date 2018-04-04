package com.ifox.springbootmybatispagehelper.domain.entity;

import java.io.Serializable;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in16:162018/4/4
 * @Modified By:
 */
public class Person  implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Integer age;
    private String address;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
