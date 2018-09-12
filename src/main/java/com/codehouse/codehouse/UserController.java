package com.codehouse.codehouse;

import com.codehouse.codehouse.models.User;
import com.codehouse.codehouse.models.UserLoginFormDto;
import com.codehouse.codehouse.services.SecurityService;
import com.codehouse.codehouse.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    public UserRepository userRepository;

    @PostMapping("/login")
    public User login(@RequestBody UserLoginFormDto userLoginFormDto, HttpSession httpSession){
        User user = userRepository.findByEmail(userLoginFormDto.getEmail());
        if (bCryptPasswordEncoder.matches(userLoginFormDto.getPassword(), user.getPassword())){
            httpSession.setAttribute("user", user);
            return user;
        }
        else {
            return null;
        }
    }

    @PostMapping("create")
    public User create(@RequestBody @Valid User userDto){
        userRepository.save(userDto);
        return userDto;
    }

    @GetMapping("getAll")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @PostMapping("logout")
    public void logout(HttpSession httpSession) {
        httpSession.removeAttribute("email");
    }

    @GetMapping("/test")
    public String someString(){
        return "31321321";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public User registration(@RequestBody @Valid User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return user;
        }

        userService.save(user);

        //securityService.autologin(user.getEmail(), user.getPassword());

        return user;
    }
}