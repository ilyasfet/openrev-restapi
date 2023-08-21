package com.iprojects.openrev.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping ("/")
    public String getUsers(){
        return "userss";
    }

    @GetMapping ("/test")
    public String getUsers2(){
        return "userss 22";
    }
}
