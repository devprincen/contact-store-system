package com.mycompany.contactStore.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.contactStore.model.User;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {


        @PostMapping("/login")
        public String login(@RequestBody User user){

                System.out.println("USERNAME: " + user.getUsername());
    System.out.println("PASSWORD: " + user.getPassword());

            if("Prince".equals(user.getUsername()) && "prince123".equals(user.getPassword())){
                return "LOGIN SUCCESS";
            }
        
            throw new RuntimeException("Invalid Credentials!");
        }

}
