package com.curso.core.ejemplo001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MiAplicacion {

	public static void main(String[] args) {
		
       //CREAR UNA INSTANCIA DE SaludoServiceImp sin Beans de Spring
		
		SaludoService saludo = new SaludoServiceImpl();
		
		saludo.saludar("a Spring");

		System.out.println("..... con spring ...........");
		
		ApplicationContext context =  
				new ClassPathXmlApplicationContext("application-context-ej001.xml");
		
		System.out.println("... solicito saludador ");
		
		SaludoService s1 = (SaludoService) context.getBean("saludadorPrototipo");
		s1.saludar(" a String Bean ");
		
		System.out.println(s1);
		
		SaludoService s2 = (SaludoService) context.getBean("saludadorPrototipo");
		
		System.out.println(s2);
	}

}
