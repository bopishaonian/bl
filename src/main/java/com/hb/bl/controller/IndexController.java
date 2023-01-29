package com.hb.bl.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author hb
 * @Date 2022/5/7 16:08
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("123")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
