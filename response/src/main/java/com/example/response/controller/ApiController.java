package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping(path = "/text")
    public String text(@RequestParam String account){
        return account;
    }

    //Json
    //req -> object mapper -> object -> method -> object -> object mapper -> json -> response
    @PostMapping(path = "/json")
    public User json(@RequestBody User user){
        return user;
    }
    // HttpstatusCode
    // Body
    // Header
    @PutMapping(path = "/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
