package com.yojhan.curso.springboot.webapp.springboot_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
/*
 * Con esto tengo todas mis configuraciones de inyeccion globales si unsar el
 * application.properties
 * 
 * @PropertySources({
 * 
 * @PropertySource("classpath:values.properties"),
 * 
 * })
 */
public class SpringbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}

}
