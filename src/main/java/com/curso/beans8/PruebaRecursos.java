package com.curso.beans8;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class PruebaRecursos {



	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Resource classPathResource = context.getResource("classpath:scripts/script_bd.sql");

		System.out.println(classPathResource.getFilename());

	}

}
