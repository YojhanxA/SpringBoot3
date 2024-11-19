package com.yojhan.curso.springboot.webapp.springboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

//aqui utilizo una clase para las configuraciones para inyeccio globales y asi tener limpio el main
@Configuration
@PropertySources({
        // CONFIGURACION PARA QUE ACEPTE CARACTERES ESPECIALES (VALUE,
        // ENCONDING="UTF-8")
        @PropertySource(value = "classpath:values.properties", encoding = "UTF-8"),

})
public class ValuesConfig {

}
