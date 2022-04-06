package com.mackittipat.macbootwebfluxsample.controller;

import com.mackittipat.macbootwebfluxsample.model.User;
import com.mackittipat.macbootwebfluxsample.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("users")
@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public Mono<User> createUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @GetMapping("{id}")
    public Mono<User> getUserById(@PathVariable int id) {
        return userRepo.findById(id);
    }

    @GetMapping("{id}/name")
    public Mono<String> getNameById(@PathVariable int id) {
        return userRepo.findNameById(id);
    }

    @GetMapping
    public Flux<User> getAllUsers() {
        return userRepo.findAll();
    }

}
