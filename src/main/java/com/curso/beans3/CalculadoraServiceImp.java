package com.curso.beans3;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;


@Component("calculadora1")
public class CalculadoraServiceImp implements CalculadoraService {
	
	public static Logger log  = Logger.getLogger("CalucaldoraServiceImp");

	public CalculadoraServiceImp() {
		log.fine(".... instanciando CalculadoraServiceImp");
	}

	@Override
	public void suma(int a, int b) {
		log.info("suma  es " + (a+ b) );


	}

}
