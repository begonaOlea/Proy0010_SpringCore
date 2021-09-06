package com.curso.beans4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.curso.beans2.Animal;
import com.curso.beans2.Granja;

public class PruebasSpringJavaConfig {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		Animal a = (Animal) ctx.getBean("animal1");
		a.comer();

		Granja g = (Granja) ctx.getBean("granjaPerros");
		
	}

}
