package com.spring.demo.controllers;

//los controladores son los que manejan las vistas

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/hola")
public class ControllerBasic {
    @GetMapping(path={"/saludar","/holamundo"})
    public String saludar() {
        return "index";
    }
}
