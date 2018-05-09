package com.ifox.springbootwebmvcconfiguration.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in16:36 2018/5/9
 * @Modified By:
 */
@RestController
public class TestController {

    @RequestMapping(value = "/index")
    public String index(){
        return "Success";
    }
}
