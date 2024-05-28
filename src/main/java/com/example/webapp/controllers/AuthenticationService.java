package com.example.webapp.controllers;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {

        public boolean auth(String name, String password) {
            return name.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password");
        }
}
