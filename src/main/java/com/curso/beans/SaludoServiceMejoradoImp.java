package com.curso.beans;

public class SaludoServiceMejoradoImp implements SaludoService {

	public SaludoServiceMejoradoImp() {
		super();	
		System.out.println(".... construyendo SaludoServiceMejoradoImp");
	}

	@Override
	public void saludar(String mensaje) {
		
		///File f = new File();
		System.out.println("saludoa en un fichero");
		
	}

}
