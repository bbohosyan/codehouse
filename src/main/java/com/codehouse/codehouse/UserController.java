package com.codehouse.codehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserRepository some;
    @PostMapping("create")
    public User create(){
        User user = new User("Gosho");
        some.save(user);
        return user;
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return some.findAll();
    }
}