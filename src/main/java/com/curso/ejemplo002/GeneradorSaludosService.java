package com.curso.ejemplo002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("generador")
public class GeneradorSaludosService {
	
	@Autowired
	@Qualifier("saludo2")
	SaludoService saludoServ;
	
	public GeneradorSaludosService() {
		System.out.println("..... iniciando GeneradorSaludoService");
		
	}
	
	public void gestionar() {
		this.saludoServ.saludar("begoña");
	}
	
	

}
