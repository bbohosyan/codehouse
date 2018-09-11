package com.codehouse.codehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserDtoRepository some;
    @PostMapping("create")
    public UserDto create(@RequestBody @Valid UserDto userDto){
        some.save(userDto);
        return userDto;
    }

    @GetMapping("getAll")
    public List<UserDto> getAll(){
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