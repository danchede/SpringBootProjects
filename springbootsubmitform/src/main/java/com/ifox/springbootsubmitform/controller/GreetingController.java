package com.ifox.springbootsubmitform.controller;

import com.ifox.springbootsubmitform.entity.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:342018/4/3
 * @Modified By:
 */
@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greetingForm(Model model){
        model.addAttribute("greeting",new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting){
        return "result";
    }
}
