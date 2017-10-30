package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wzh on 2017/2/18.
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
