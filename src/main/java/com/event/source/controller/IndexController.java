package com.event.source.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: zhangxin
 * @create: 2020-09-23 09:56
 **/

@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "success";
    }



}
