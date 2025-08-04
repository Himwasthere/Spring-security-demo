package com.telusko.spring_security_demo.service;

import com.telusko.spring_security_demo.dao.UserRepo;
import com.telusko.spring_security_demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {


    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));//encoder is encoding the password
        System.out.println(user.getPassword()); //printing this in console
        return repo.save(user) ;

    }
}
