package com.curso.beans2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PruebaGranja {

	public static void main(String[] args) {
		
		Animal a = new Perro("Pastor Aleman");
		Granja g = new Granja(a);
		g.trabajosGranja();
		
		System.out.println("---- con spring beans ---");
		
		// spring beans
		
		ApplicationContext context =  
				  new ClassPathXmlApplicationContext("application-context-granja.xml");
		    
		Granja g2 = (Granja) context.getBean("granjaPerros");
		g2.trabajosGranja();
		
		
		
		
		
	}

}
