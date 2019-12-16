package com.examenes.bsd.Controller;

import com.examenes.bsd.AuthenticationBean;
import com.examenes.bsd.Model.User;
import com.examenes.bsd.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping(path = "/basicauth")
    public AuthenticationBean basicauth() {
        return new AuthenticationBean("You are authenticated");
    }

    @GetMapping("/user")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
