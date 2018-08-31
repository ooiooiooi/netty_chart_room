package com.example.netty.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Index {

    @RequestMapping("/index")
    public String Index(){
        return "index";
    }
}
