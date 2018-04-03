package com.ifox.example.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(value = "/user")
@RestController
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Object list(HttpServletRequest request){
        return "Get all User";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public  Object detail(@PathVariable Integer id){
        return "Get a User";
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Object create(HttpServletRequest request){
        return "POST a  User";
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public Object update(HttpServletRequest request) {
        return "PUT a user";
    }
}
