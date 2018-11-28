package com.zhangshiquming.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {

    @ResponseBody
    @RequestMapping("/")
    public String demo(){
        return "hello word";
    }

    @RequestMapping("/homepage")
    public ModelAndView landingPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");

        return modelAndView;
    }
}
