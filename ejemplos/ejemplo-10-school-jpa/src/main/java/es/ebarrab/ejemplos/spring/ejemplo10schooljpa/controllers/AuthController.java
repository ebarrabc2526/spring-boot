package es.ebarrab.ejemplos.spring.ejemplo10schooljpa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    @GetMapping("/login")
    public String loginGet(){
        return "login";

    }

}
