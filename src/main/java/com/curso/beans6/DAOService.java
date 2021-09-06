package com.curso.beans6;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class DAOService {

	private static Logger log = Logger.getAnonymousLogger();
	
	public DAOService() {
		log.info(".... instanciando DAOService");
	}

}
