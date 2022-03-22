package com.curso.ejemplo002;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("saludo1")
@Qualifier("saludo1")
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
