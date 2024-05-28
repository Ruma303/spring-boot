package com.example.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController
{
    // Viene iniettato il servizio di autenticazione dalla classe AuthenticationService
    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping(value="/login")
    public String getLogin(Model model) {
        return "login";
    }

    @PostMapping(value="/login")
    public String postLogin(
            Model map,
            @RequestParam String name,
            @RequestParam String password) {
        if (authenticationService.auth(name, password)) {
            map.addAttribute("name", name);
            return "welcome";
        } else {
            return "login";
        }
    }
}
