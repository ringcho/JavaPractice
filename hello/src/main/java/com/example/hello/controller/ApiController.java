package com.example.hello.controller;

import com.example.hello.dto.PostRequestDto;
import com.example.hello.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController // RESTAPI를 처리
@RequestMapping("/api") // URI 지정
public class ApiController {
    @GetMapping("/hello") // http://localhost:8080/api/hello
    public String hello(){
        return "hello spring boot!";
    }
    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestData){
        System.out.println(requestData);
    }

    @PutMapping(path = "/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto requestDto, @PathVariable(name="userId") Long id){
        System.out.println(id);
        return requestDto;
    }

    @DeleteMapping(path = "/delete/{userId}")
    public void delete(@PathVariable(name="userId") String id, @RequestParam String account){
        System.out.println(id);
        System.out.println(account);
    }
}
