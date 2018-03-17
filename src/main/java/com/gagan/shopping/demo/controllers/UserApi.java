package com.gagan.shopping.demo.controllers;

import com.gagan.shopping.demo.models.UserWS;
import com.gagan.shopping.demo.util.CustomResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import javax.validation.metadata.MethodType;

@RequestMapping(value = BaseApi.USER)
public interface UserApi {

    @RequestMapping(value = {"create"}, method = RequestMethod.POST)
    public ResponseEntity createUser(@Valid @RequestBody UserWS userWS, BindingResult bindingResult);
}
