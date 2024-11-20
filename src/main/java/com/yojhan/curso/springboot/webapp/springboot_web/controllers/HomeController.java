package com.yojhan.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Con esto podemos hacer que el home sea una pagina
    @GetMapping({ "", "/", "home" })
    public String home() {
        // return "redirect:/list"; cambia el request, cambia los parametros de la url:
        // redirect es lo mas tipico en un crud
        return "forward:/list"; // Mantiene el request, no cambia parametros de la url

    }
}
