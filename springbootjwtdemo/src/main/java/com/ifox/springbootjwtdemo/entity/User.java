package com.ifox.springbootjwtdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in10:06 2018/4/10
 * @Modified By:
 */
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String password;

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
