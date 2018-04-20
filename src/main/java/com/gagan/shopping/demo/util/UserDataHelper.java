package com.gagan.shopping.demo.util;


import com.gagan.shopping.demo.models.User;
import com.gagan.shopping.demo.models.UserWS;
import org.springframework.stereotype.Component;

import java.security.spec.InvalidKeySpecException;

@Component
public class UserDataHelper {

    public User convertWstoEntity(UserWS userWS) throws InvalidKeySpecException {
        User user = new User();
        user.setFname(userWS.getFname());
        user.setLname(userWS.getLname());
        user.setEmail(userWS.getEmail());
        user.setGender(userWS.getGender());
        user.setPassword(userWS.getPassword());
        user.setPhone(userWS.getPhone());
        user.setUuid(userWS.getUuid());
        return user;
    }
}
