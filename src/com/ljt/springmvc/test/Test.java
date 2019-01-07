package com.ljt.springmvc.test;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Test {

    @RequestMapping("/say")
    public String say(Model model){

        model.addAttribute("name", "LJT");
        model.addAttribute("url", "http://www.baidu.com");

        return "say";

    }

}
