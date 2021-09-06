package com.curso.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
	public static void main( String[] args )
	{
		//modo tradicional sin contenedor
		
		SaludoService servicio = new SaludoServiceImpl();
								// new SaludoServiceMejoradoImp();
		
		servicio.saludar("AMIGO");
		
		System.out.println("--------CON SPRING CONTEXT -----");

		// Beans Spring - Contenedor 
		
	      ApplicationContext context =  new ClassPathXmlApplicationContext("application-context.xml");
	    		//  new ClassPathXmlApplicationContext( new String[] {“application-context.xml"});
	      
	      //obtener una instancia del bean saludo1
	      System.out.println("obtener  saludador1 dos veces - SINGLETON");
	      
	      SaludoService s1 = (SaludoService) context.getBean("saludador1");
		
	      s1.saludar("amigo");
	      
	      System.out.println(s1);
	      
	      SaludoService s2 = (SaludoService) context.getBean("saludador1");
	      System.out.println(s2);
		  
	      // este se instancia bajo demanda
	      SaludoService s3 =  (SaludoService) context.getBean("saludador3");
	      s3.saludar("otro");
	      System.out.println(s2);
	      
	      System.out.println("obtener dos saludador2 - PROTOTYPE");
	      SaludoService s4 =  (SaludoService) context.getBean("saludador2");
	      SaludoService s5 =  (SaludoService) context.getBean("saludador2");
	      System.out.println(s4);
	      System.out.println(s5);

	}
}