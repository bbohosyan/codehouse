package com.codehouse.codehouse;

import com.codehouse.codehouse.services.SecurityService;
import com.codehouse.codehouse.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    public UserRepository some;
    @PostMapping("create")
    public User create(@RequestBody @Valid User userDto){
        some.save(userDto);
        return userDto;
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

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public User registration(@RequestBody User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return user;
        }

        userService.save(user);

        securityService.autologin(user.getEmail(), user.getPassword());

        return user;
    }
}