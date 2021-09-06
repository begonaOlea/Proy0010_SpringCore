package com.curso.beans8;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Scope("prototype")
public class Proyecto {
	

	private int departamento;
	
	@Value("#{ config.gerente }")
	private String gerente;
	@Value("#{ new java.util.Date()}")
	private Date fechaInicio;
	

	public Proyecto() {
		// TODO Auto-generated constructor stub
	}
	
	public int getDepartamento() {
		return departamento;
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	public String getGerente() {
		return gerente;
	}
	
	
}
