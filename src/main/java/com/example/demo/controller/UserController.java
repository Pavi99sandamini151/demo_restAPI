package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getUser")
    public String getUser(){
        return "Simple-root";
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping("/putUser")
    public String putUser(){
        return "user Updated!";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "user Deleted!";
    }
}
