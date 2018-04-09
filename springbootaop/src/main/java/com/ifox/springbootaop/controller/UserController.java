package com.ifox.springbootaop.controller;

import com.ifox.springbootaop.aspect.UserAccess;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in12:57 2018/4/9
 * @Modified By:
 */
@RestController
public class UserController {
    @RequestMapping(value = "/first")
    public Object first(){
        return "first controller";
    }
    @RequestMapping("/doError")
    public Object error() {
        return 1 / 0;
    }

    @RequestMapping("/second")
    @UserAccess(desc = "second")
    public Object second() {
        return "second controller";
    }
}

