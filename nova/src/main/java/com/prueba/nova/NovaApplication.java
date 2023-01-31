package com.prueba.nova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.prueba.nova.controller", "com.prueba.nova.repositories",
"com.prueba.nova.service"})//SE INSTANCIA TODOS NUESTROS OBJETOS 
@EntityScan("com.prueba.nova.model")//se define para escaner diferentes entidades en distintos paquetes 
@SpringBootApplication
public class NovaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovaApplication.class, args);
	}

}
