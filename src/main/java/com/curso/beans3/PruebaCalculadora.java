package com.curso.beans3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PruebaCalculadora {

	public static void main(String[] args) {
		
		
		ApplicationContext context =   
				  new ClassPathXmlApplicationContext("application-context-anotaciones.xml");
		
	
		CalculadoraService c = (CalculadoraService) context.getBean("calculadora1");
		c.suma(2, 3);
		
		CalculadoraService c2 = (CalculadoraService) context.getBean("calculadora2");
		c2.suma(33, 3);
		
	}

}
