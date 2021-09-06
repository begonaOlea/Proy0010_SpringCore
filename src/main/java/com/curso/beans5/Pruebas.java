package com.curso.beans5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pruebas {

	
		public static void main(String[] args) {
			
			ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("application-context-avanzado.xml");
			
			
	        ctx.close();  //llama al metodo cleanup
			
		}

}
