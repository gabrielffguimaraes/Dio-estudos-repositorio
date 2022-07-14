package com.auth.secutirity.authenticate.controller;

import com.auth.secutirity.authenticate.model.User;
import com.auth.secutirity.authenticate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class StartController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping
    /*@PreAuthorize("hasAnyRole('manager','user')")*/
    public String init() {
        this.userRepository.save(User.builder().id(1).password("123").name("user").username("user").roles(Arrays.asList("user")).build());
        return "Seja bem vindo a aplicação";
    }
    @GetMapping("/user")
    /*@PreAuthorize("hasRole('user')")*/
    public String usuario() {
        return "Seja bem usuario";
    }
    @GetMapping("/manager")
    /*@PreAuthorize("hasRole('manager')")*/
    public String admin() {
        return "Seja bem admin";
    }
}
