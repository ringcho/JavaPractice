package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping(path = "/main")
    public String main(){
        return "main.html";
    }

    // ResponseEntity

    // ResponseBody
    @ResponseBody
    @GetMapping(path = "/user")
    public User user(){
        var user = new User();
        user.setName("steve");
        user.setAddress("서울,한국");
        return user;
    }
}
