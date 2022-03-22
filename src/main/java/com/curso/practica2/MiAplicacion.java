package com.curso.practica2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MiAplicacion {
	
	public static void main(String[] args) {
		
		//crear un RRHHService
		//crear una solicitud de vacas
		// aprobarla
		
		//SIN SPRING
//		RRHHService service = new RRHHService();
//		Solicitud s1 = new SolicitudVacas();
//		service.gestionarSolicitud(s1);

		
		//CON SPRING
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("/com/curso/practica2/solicitudes-beans.xml");
		
		RRHHService service = (RRHHService) ctx.getBean("servicio");
		
		Solicitud s1 = (Solicitud) ctx.getBean("solicitudVacas");
		service.gestionarSolicitud(s1);
		
		
		Solicitud s2 = (Solicitud) ctx.getBean("solicitudDLibre");
		service.gestionarSolicitud(s2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
