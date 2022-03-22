package com.curso.practica2;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component("solicitudVacas")
public class SolicitudVacas extends Solicitud{
     
	private String departamento ;
	
	public SolicitudVacas() {
		this.departamento = "GENERAL";
	}
	
	public SolicitudVacas(String departamento) {
		super();
		this.departamento = departamento;
	}
	
	@Override
	public void aprobar() {
		this.fechaRevision = LocalDate.now();
	
		if(this.departamento.equals("VENTAS")) {
			System.out.println("..... aceptadas las vacaciones ");
			this.aceptada  = true;
		}else {
			System.out.println("..... vacaciones rechazadas ");
			this.aceptada  = false;
		}
	}

}
