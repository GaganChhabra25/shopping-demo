package com.gagan.shopping.demo.controllers;


import com.gagan.shopping.demo.exceptions.InvalidPayloadException;
import com.gagan.shopping.demo.models.UserWS;
import com.gagan.shopping.demo.service.UserService;
import com.gagan.shopping.demo.util.CustomResponse;
import com.gagan.shopping.demo.util.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.security.spec.InvalidKeySpecException;

@RestController
public class UserApiImpl implements UserApi {

    @Autowired
    private UserService userService;


    @Override
    public ResponseEntity createUser(@Valid @RequestBody UserWS userWS, BindingResult bindingResult) throws InvalidKeySpecException {
        System.out.println("into create User method");
        if(bindingResult.hasErrors()){
           throw new InvalidPayloadException(bindingResult);
        }
        userService.createUser(userWS);
        return null;
    }
}
