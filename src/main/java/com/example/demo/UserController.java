package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/ping")
public class UserController {

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public void ping() {
        System.out.println("Tudo funcionando");
    }
}
