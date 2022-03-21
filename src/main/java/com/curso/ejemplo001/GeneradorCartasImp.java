package com.curso.ejemplo001;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("generador")
public class GeneradorCartasImp implements GeneradorCartasService {

	@Autowired
	private SaludoService  saludoServ; // INYECCION DE LA DEPENDENCIA

	@Override
	public void generarCarta() {
		System.out.println(".... escribo una carta");
		this.saludoServ.saludar("Maria");

	}

}
