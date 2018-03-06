package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author licunzhi
 * @desc 描述功能
 * @date 2018-03-05
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/nameli")
    public String hello() {
        return "hello nameli";
    }

    @RequestMapping("/main")
    public String main() {
        return "index";
    }

    @RequestMapping("/data")
    public ModelAndView testData(ModelAndView modelAndView) {
        modelAndView.setViewName("/data/index");
        modelAndView.addObject("name", "licunzhi");
        return modelAndView;
    }
}
