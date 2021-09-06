package com.curso.beans6;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private static Logger log = Logger.getAnonymousLogger();
	
	public UserService() {
		log.info("... instanciando UserService");
	}

}
