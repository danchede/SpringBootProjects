package com.ifox.springboottemplate.controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class HelloController {
//    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
//    @ResponseBody
//    public String hello(@RequestParam String name){
//        return "Hello" + name;
//    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
