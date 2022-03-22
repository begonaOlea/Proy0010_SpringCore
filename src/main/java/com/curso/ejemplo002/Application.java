package com.curso.ejemplo002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
	public static void main( String[] args )
	{

		
		System.out.println("--------CON SPRING CONTEXT -----");

		// Beans Spring - Contenedor 
		
	      ApplicationContext context =  
	    		  new ClassPathXmlApplicationContext("application-context-cuantificador.xml");
	    	
	      GeneradorSaludosService s = (GeneradorSaludosService) context.getBean("generador");
	      s.gestionar();

	}
}