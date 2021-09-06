package com.curso.beans7;

import java.util.logging.Logger;

public class NotasService {
	
	private String asignatura;
	private int totales;
	
	private static Logger log = Logger.getAnonymousLogger();
	

	public NotasService() {
		log.info("... instanciando NotasService");
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		log.info(".. setAsginatura");
		this.asignatura = asignatura;
	}

	public int getTotales() {
		return totales;
	}

	public void setTotales(int totales) {
		log.info("....setTotales");
		this.totales = totales;
	}
	
	

}
