package com.gagan.shopping.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewsRenderApi {

    @RequestMapping("home")
    public String home(){
        return "Welcome to Spring boot application";
    }

}
