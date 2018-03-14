package com.gagan.shopping.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewsRenderApiImpl{

    @RequestMapping("home")
    public String home(){
        System.out.println("bfewfew");
        return "Welcome to Spring boot application";
    }
}
