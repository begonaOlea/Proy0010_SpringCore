package com.curso.ejemplo001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
	public static void main( String[] args )
	{
		//modo tradicional sin contenedor
		
		System.out.println("--------CON SPRING CONTEXT -----");

		// Beans Spring - Contenedor 
		
	      ApplicationContext context =  new ClassPathXmlApplicationContext("beans-context-eje01.xml");
	    
          //usar el servicio para saludar
	      
	      SaludoService s = (SaludoService) context.getBean("saludador");
	      
	      
	      s.saludar("Maria");
	      
	      System.out.println(s);
	      
	      GeneradorCartasService s2 = (GeneradorCartasService) context.getBean("generador");
		     
	      s2.generarCarta();
	      
	      
	}
}