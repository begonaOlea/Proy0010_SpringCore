package com.curso.practica2;

import org.springframework.stereotype.Component;

@Component("servicio")
public class RRHHService {
	
	public void gestionarSolicitud(Solicitud s) {
		s.aprobar();
	}

}
