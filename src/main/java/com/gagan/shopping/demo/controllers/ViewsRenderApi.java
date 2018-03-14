package com.gagan.shopping.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "")
public interface ViewsRenderApi {

    String HOME = "home";

    @RequestMapping(value = {HOME}, method = RequestMethod.GET)
    public String home();
}
