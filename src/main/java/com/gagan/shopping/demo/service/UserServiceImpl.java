package com.gagan.shopping.demo.service;

import com.gagan.shopping.demo.models.User;
import com.gagan.shopping.demo.models.UserWS;
import com.gagan.shopping.demo.repository.UserRepository;
import com.gagan.shopping.demo.util.UserDataHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.spec.InvalidKeySpecException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDataHelper userDataHelper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(UserWS userWS) throws InvalidKeySpecException {
        User user = userDataHelper.convertWstoEntity(userWS);
        userRepository.saveUser(user);
    }
}
