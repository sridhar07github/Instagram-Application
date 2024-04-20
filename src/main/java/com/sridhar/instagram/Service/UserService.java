package com.sridhar.instagram.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sridhar.instagram.Entity.User;
import com.sridhar.instagram.Repository.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User saveDetails(User user)
    {
       return userRepo.save(user);
    }

}
