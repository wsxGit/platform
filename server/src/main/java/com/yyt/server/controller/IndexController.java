package com.yyt.server.controller;

import com.yyt.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public Object index(){
        return userRepository.findAll();
    }
}
