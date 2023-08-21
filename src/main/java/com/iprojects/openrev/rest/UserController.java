package com.iprojects.openrev.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${custom.value.name}")
    private String valueFromProFile;
    @GetMapping ("/")
    public String getUsers(){
        System.out.println(valueFromProFile);
        return "userss";
    }

    @GetMapping ("/test")
    public String getUsers2(){
        return "userss 22";
    }
}
