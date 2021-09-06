package com.curso.beans7;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pruebas {

	
		public static void main(String[] args) {
			
			System.out.println("... ejemplo con properties");
			ConfigurableApplicationContext ctx = 
					new ClassPathXmlApplicationContext("alumno-beans.xml");
			
			NotasService s = (NotasService) ctx.getBean("notasLatin");
			System.out.printf("La asignatura %s tiene %d. " , s.getAsignatura(), s.getTotales());
			
	        ctx.close();  //llama al metodo cleanup
			
		}

}
