package com.miguel.springboot.error.springbooterror;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.miguel.springboot.error.springbooterror.models.domain.User;

@Configuration
public class AppConfig {

    /* BASE DE DATOS EN MEMORIA */
    @Bean
    public List<User> users(){
        List <User> users = new ArrayList<>();
        users.add(new User(1L, "Pepe", "Gonzalez"));
        users.add(new User(2L, "Andres", "Mena"));
        users.add(new User(3L, "Maria", "Perez"));
        users.add(new User(4L, "Josefa", "Ramirez"));
        users.add(new User(5L, "Ale", "Gutierrez"));
        return users;
    }
}
