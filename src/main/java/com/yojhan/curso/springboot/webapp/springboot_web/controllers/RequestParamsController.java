package com.yojhan.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yojhan.curso.springboot.webapp.springboot_web.models.dto.ParamDto;
import com.yojhan.curso.springboot.webapp.springboot_web.models.dto.ParamMixDto;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "hola") String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);

        return param;
    }

    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam() String text, @RequestParam() Integer code) {
        ParamMixDto params = new ParamMixDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }

}
