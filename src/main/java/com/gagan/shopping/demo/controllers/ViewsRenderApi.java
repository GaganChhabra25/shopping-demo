package com.gagan.shopping.demo.controllers;

import com.gagan.shopping.demo.models.Role;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

public interface ViewsRenderApi {

    String HOME = "home";

    @RequestMapping(value = {HOME}, method = RequestMethod.GET)
    public String  home();
}
