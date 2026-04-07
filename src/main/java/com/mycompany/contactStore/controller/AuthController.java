package com.mycompany.contactStore.controller;

import com.mycompany.contactStore.Security.JwtUtil;
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

        private final JwtUtil jwtUtil;

        AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
        }

        @PostMapping("/login")
        public String login(@RequestBody User user) {

                System.out.println("USERNAME: [" + user.getUsername() + "]");
                System.out.println("PASSWORD: [" + user.getPassword() + "]");

                if("Prince".equals(user.getUsername()) && "prince".equals(user.getPassword())) {
                        return jwtUtil.generatedToken(user.getUsername());
                }

                return "Invalid";
        }

}
