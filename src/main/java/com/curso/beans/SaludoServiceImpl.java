package com.curso.beans;

public class SaludoServiceImpl implements SaludoService {

	public SaludoServiceImpl() {
		super();
		System.out.println(".... construyendo SaludoServiceImpl");
	}

	@Override
	public void saludar(String mensaje) {
		System.out.println("Hola " + mensaje);
	}
	

}
