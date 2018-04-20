package com.gagan.shopping.demo.service;


import com.gagan.shopping.demo.models.UserWS;

import java.security.spec.InvalidKeySpecException;

public interface UserService {

    public void createUser(UserWS userWS) throws InvalidKeySpecException;
}
