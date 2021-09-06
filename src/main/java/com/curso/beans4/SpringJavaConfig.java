package com.curso.beans4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import com.curso.beans2.Granja;
import com.curso.beans2.Animal;
import com.curso.beans2.Perro;

@Configuration
//@ComponentScan(basePackages = "com.curso")
//@Import(GrangaJavaConfig.class)
@ImportResource( "classpath:granja-beans.xml")
public class SpringJavaConfig {

	@Bean
	@Scope(value = "prototype" )
	public Animal animal1() { // ctx.getBean("animal1")
		return new Perro();
	}
	
	@Bean 
	public Granja granjaPerros() {  //  ctx.getBean("granjaPerros")
		return new Granja(animal1());  // animal1() es el mismo que entrega siempre getBean("aninal2")
	}

}
