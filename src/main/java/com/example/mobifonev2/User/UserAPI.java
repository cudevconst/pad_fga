package com.example.mobifonev2.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/user")
public class UserAPI {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public User postUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        return userService.findByUsernameAndPassword(username, password);
    }
}
