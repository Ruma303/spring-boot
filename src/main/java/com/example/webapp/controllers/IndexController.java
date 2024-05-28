package com.example.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private String saluti = "Benvenuto nella tua prima applicazione Spring Boot 3!";

    @GetMapping(value="/")
    public String welcome(Model model) {
        model.addAttribute("intestazione", "Benvenuto in AlphaShop!");
        model.addAttribute("saluti", this.saluti);
        return "index";
    }

    @GetMapping(value="/about")
    public String getAbout() {
        return "about";
    }
}


