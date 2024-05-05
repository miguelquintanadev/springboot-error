package com.miguel.springboot.error.springbooterror.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguel.springboot.error.springbooterror.exceptions.UserNotFoundException;
import com.miguel.springboot.error.springbooterror.models.domain.User;
import com.miguel.springboot.error.springbooterror.services.UserService;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService service;
    @GetMapping
    public String index(){
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "ok 200";
    }

    /*Si está presente, devuelve el objeto usuario. Sino, la ex. */
    @GetMapping("/show/{id}")
    public User show(@PathVariable(name = "id") Long id){
        User user = service.findById(id).orElseThrow(() -> new UserNotFoundException("Error, el usuario no existe."));
        System.out.println(user.getLastname());
        return user;
    }
}
