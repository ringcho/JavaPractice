package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    @GetMapping(path = "/hello") // http://localhost:8080/api/get/hello
    public String getHello(){
        return "get Hello";
    }
    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get,post,put,delete
    public String hello(){
        return "hi";
    }
    @GetMapping("/path-variable/{id}") // http://localhost:8080/api/get/path-variable/{id}
    public String pathVariable(@PathVariable(name = "id") String pathName){
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }

    // http://localhost:8080/api/get/query-param?user=steve&email=steve@gmail.com&age=35
    @GetMapping(path = "/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+" = "+entry.getValue()+"\n");
        });
        return sb.toString();
    }
    @GetMapping(path = "/query-param2")
    public String queryParam2(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        return name+" "+email+" "+age;
    }

    @GetMapping(path = "/query-param3")
    public String queryParam3(UserRequest userRequest){
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();

    }
}
