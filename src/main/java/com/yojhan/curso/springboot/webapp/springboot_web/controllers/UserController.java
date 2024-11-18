package com.yojhan.curso.springboot.webapp.springboot_web.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.yojhan.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Yojhan", "Arias Correa");

        user.setEmail("zigzagflete@gmail.com");
        model.addAttribute("title", "Hola mundo");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        /*
         * List<User> users = Arrays.asList(new User("Yojhan", "Arias Correa",
         * "zigzagflete@gmail.com"),
         * new User("Andres", "Felipe"),
         * new User("Maicol", "Gonzales"));
         */
        // model.addAttribute("users", users);
        model.addAttribute("tittle", "Listado de usuarios");

        return "list";
    }

    // sieve para reutilizar los datos, es un metodo global, todos los demas metodos
    // tienen acceso a lo que retorna
    @ModelAttribute("users")
    public List<User> userModel() {
        return Arrays.asList(new User("Yojhan", "Arias Correa", "zigzagflete@gmail.com"),
                new User("Andres", "Felipe"),
                new User("Maicol", "Gonzales"));
    }

}
