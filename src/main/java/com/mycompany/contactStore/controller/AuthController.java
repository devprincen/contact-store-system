package com.mycompany.contactStore.controller;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.contactStore.Security.JwtUtil;
import com.mycompany.contactStore.model.User;
import com.mycompany.contactStore.repository.UserRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/auth")
public class AuthController {

    private final UserRepository repo;
    private final JwtUtil jwt;

    public AuthController(UserRepository repo, JwtUtil jwt){
        this.repo = repo;
        this.jwt = jwt;

    }

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return repo.save(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        
        User db = repo.findByUsername(user.getUsername());

        if(db!=null && db.getPassword().equals(user.getPassword())) {
            return jwt.generateToken(user.getUsername());
        }
        throw new RuntimeException("Invalid Login");

    }
    

}