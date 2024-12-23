package com.yojhan.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yojhan.curso.springboot.webapp.springboot_web.models.User;
import com.yojhan.curso.springboot.webapp.springboot_web.models.dto.ParamDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.code}")
    private Integer code;
    // @Value("${config.username}")
    // private String username;
    @Value("${config.message}")
    private String message;
    @Value("${config.listOfValue}")
    private String[] listOfValue;

    @Value("#{'${config.listOfValue}'.toUpperCase().split(',')}")
    private List<String> valueList;

    @Value("#{${config.valuesMap}}")
    private Map<String, Object> valuesMap;

    @Value("#{${config.valuesMap}.product}")
    private String product;

    @Value("#{${config.valuesMap}.price}")
    private Long price;

    @Autowired
    private Environment environment;

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable() String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathvar(@PathVariable String product, @PathVariable Long id) {

        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        // hacer algo con el usuario save en la bd
        user.setName(user.getName().toUpperCase());
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values(@Value("${config.username}") String username) {
        Map<String, Object> json = new HashMap<>();

        json.put("code", code);
        json.put("username", username);
        json.put("message", message);
        json.put("message2", environment.getProperty("config.message"));
        json.put("code2", Integer.valueOf(environment.getProperty("config.code" /*
                                                                                 * Tambien se puede convertir con
                                                                                 * Long.class
                                                                                 */ )));
        json.put("listOfValue", listOfValue);
        json.put("valueList", valueList);
        json.put("valuesMap", valuesMap);
        json.put("product", product);
        json.put("price", price);

        return json;
    }

}
