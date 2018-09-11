package com.codehouse.codehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.bind.annotation.DeleteMapping;
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

    @GetMapping("getAll")
    public List<User> getAll(){
        return some.findAll();
    }

    @PostMapping("logout")
    public void logout() throws Exception {

    }

    @GetMapping("/test")
    public String someString(){
        return "31321321";
    }
}