package com.Minh.test_jpa.controller;

import com.Minh.test_jpa.model.Users;
import com.Minh.test_jpa.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
  private   Userservice service;

    @PostMapping("register")
    public void register(@RequestBody Users users)
    {
        service.Register(users);


    }


}
