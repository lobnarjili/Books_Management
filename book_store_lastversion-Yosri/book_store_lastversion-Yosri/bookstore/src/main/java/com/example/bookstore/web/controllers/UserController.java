// package com.example.bookstore.web.controllers;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import com.example.bookstore.business.services.UserService;
// import com.example.bookstore.dao.entites.User;

// @RestController
// @RequestMapping("/api/auth")
// public class UserController {
//     @Autowired
//     private UserService userService;

//     @PostMapping("/register")
//     public User register(@RequestBody User user) {
//         return userService.registerUser(user);
//     }
// }