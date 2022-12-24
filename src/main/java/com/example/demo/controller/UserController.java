package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v/user")
@CrossOrigin
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "Simple-root";
    }

    @PostMapping("/saveUser")
    public String saveUser(){
        return "user Saved!";
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
