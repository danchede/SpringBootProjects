package com.ifox.springbootspringsecurity.com.ifox.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:43 2018/5/10
 * @Modified By:
 */
@RestController
public class UserController {
    @RequestMapping(value = "/index")
    public String index(){
        return "get index success";
    }
}
