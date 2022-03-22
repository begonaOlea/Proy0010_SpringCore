package com.curso.core.ejemplo002;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImp implements CalculadoraService {

	@Override
	public double calculaIRPF() {		
		return 10;
	}

}
