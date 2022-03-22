package com.curso.ejemplo002;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("saludoMejorado")
@Qualifier("saludo2")
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
