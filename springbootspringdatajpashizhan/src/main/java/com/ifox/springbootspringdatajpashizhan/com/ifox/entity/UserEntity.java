package com.ifox.springbootspringdatajpashizhan.com.ifox.entity;

import com.ifox.springbootspringdatajpashizhan.com.ifox.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in20:20 2018/5/9
 * @Modified By:
 */
@Entity
@Table(name = "t_user")
public class UserEntity extends BaseEntity implements Serializable
{

    @Id
    @GeneratedValue
    @Column(name = "t_id")
    private Long id;

    @Column(name = "t_name")
    private String name;

    @Column(name = "t_age")
    private int age;

    @Column(name = "t_address")
    private String address;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}