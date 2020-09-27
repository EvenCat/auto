package com.event.source.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: zhangxin
 * @create: 2020-09-23 09:56
 **/

@RestController
public class IndexController {


    @RequestMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

}
