package com.curso.beans6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pruebas {

	
		public static void main(String[] args) {
			
			System.out.println("... ejemplo con anotaciones");
			ConfigurableApplicationContext ctx = 
					new ClassPathXmlApplicationContext("application-context-anotaciones2.xml");
			
			
	        ctx.close();  //llama al metodo cleanup
			
		}

}
