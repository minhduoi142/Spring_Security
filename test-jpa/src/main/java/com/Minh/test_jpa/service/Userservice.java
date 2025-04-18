package com.Minh.test_jpa.service;

import com.Minh.test_jpa.dao.UserRepo;
import com.Minh.test_jpa.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice {

    @Autowired
  private   UserRepo repo;

 public void Register(Users users)
    {
        repo.save(users);

    }
}
