package com.curso.core.ejemplo001;

import java.util.logging.Logger;

public class SaludoServiceImpl implements SaludoService {

	Logger log = Logger.getLogger("SaludoSeviceImpl");
	
	@Override
	public void saludar(String mensaje) {
		log.info("Bienvenido " + mensaje);
		
	}

}
