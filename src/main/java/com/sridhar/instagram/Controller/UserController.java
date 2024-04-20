package com.sridhar.instagram.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sridhar.instagram.Entity.User;
import com.sridhar.instagram.Service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

@PostMapping("/addUser")
    public User postDetails(@RequestBody User user)
    {
         return userService.saveDetails(user);
    }
}
