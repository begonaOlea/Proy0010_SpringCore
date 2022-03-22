package com.curso.core.ejemplo002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NominasServiceImp implements NominasService{
	
	@Autowired
	private CalculadoraService calculadora;

	@Override
	public void calcularNomina() {
		calculadora.calculaIRPF();
	}

}
