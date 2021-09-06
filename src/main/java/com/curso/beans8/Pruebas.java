package com.curso.beans8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pruebas {

	
		public static void main(String[] args) {
			
			System.out.println("... ejemplo con anotaciones @values");
			ConfigurableApplicationContext ctx = 
					new ClassPathXmlApplicationContext("application-context-proyecto.xml");
			
			Proyecto p = (Proyecto) ctx.getBean("proyecto");
			
			System.out.println(p.getFechaInicio());
			System.out.println(p.getGerente());
			
	        ctx.close();  
			
		}

}
