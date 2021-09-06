package com.curso.beans8;

import org.springframework.stereotype.Component;

@Component("config")
public class ConfiguracioProy {

	
	private String gerente ="Laura";
	
	
	
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

}
