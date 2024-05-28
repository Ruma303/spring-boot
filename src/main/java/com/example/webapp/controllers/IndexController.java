package com.example.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    private String saluti = "Benvenuto nella tua prima applicazione Spring Boot 3!";

    @GetMapping(value="/")
    public String getIndex(Model model, @RequestParam(value="nome") String nome) {
        model.addAttribute("nome", nome);
        model.addAttribute("intestazione", "Index");
        model.addAttribute("saluti", this.saluti);
        return "index";
    }

    @GetMapping(value="/about")
    public String getAbout(Model model) {
        model.addAttribute("intestazione", "About");
        model.addAttribute("saluti", "Benvenuto nella pagina About!");
        return "about";
    }

    @GetMapping(value="/welcome")
    public String getWelcome(Model model) {
        model.addAttribute("intestazione", "Welcome");
        model.addAttribute("saluti", "Benvenuto nella pagina Welcome!");
        return "welcome";
    }
}


