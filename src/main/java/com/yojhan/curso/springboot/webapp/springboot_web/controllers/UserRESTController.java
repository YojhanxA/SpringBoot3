package com.yojhan.curso.springboot.webapp.springboot_web.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yojhan.curso.springboot.webapp.springboot_web.models.User;
import com.yojhan.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRESTController {

@GetMapping("/details")
    public  UserDto details (){
        UserDto userDto = new UserDto();
        User user = new User("Yojhan", "Arias Correa");
        userDto.setTittle("Hola mundo");
        userDto.setUser(user);

    

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Yojhan", "Arias Correa");
        User user2 = new User("Andres", "Gomes");
        User user3 = new User("Pepe", "Cordoba");

        List<User> users =  Arrays.asList(user,user2,user3);
        /*List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);*/

        return users;

    }

    @GetMapping("/details-map")
    public  Map<String, Object> detailsMap (){
        User user = new User("Yojhan", "Arias Correa");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo");
        body.put("user",user);

        return body;
    }
}
