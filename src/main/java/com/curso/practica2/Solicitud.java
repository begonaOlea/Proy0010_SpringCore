package com.curso.practica2;

import java.time.LocalDate;

public abstract class Solicitud {

	protected LocalDate fechaSolicitud;
	protected LocalDate fechaRevision;
	protected boolean aceptada;
	
	public Solicitud() {
		this.fechaSolicitud = LocalDate.now();
		this.fechaRevision = null;
		this.aceptada = false;	
	}
	
	public LocalDate getFechaRevision() {
		return fechaRevision;
	}
	public LocalDate getFechaSolicitud() {
		return fechaSolicitud;
	}
	
	public boolean isAceptada() {
		return aceptada;
	}
	
	public abstract  void aprobar();
	
}
