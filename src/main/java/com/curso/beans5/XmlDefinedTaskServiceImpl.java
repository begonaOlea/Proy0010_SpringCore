package com.curso.beans5;

import java.util.logging.Logger;

public class XmlDefinedTaskServiceImpl implements XmlDefinedTaskService {

	private static Logger log = Logger.getAnonymousLogger();
	
	private UserService userService;
	private DAOService  daoService;
	
	public XmlDefinedTaskServiceImpl(UserService userService, DAOService  daoService) {
		log.info(".....instanciando XmlDefinedTaskServiceImpl");
		this.daoService = daoService;
		this.userService = userService;
	}
	
	

	@Override
	public void defined() {
		log.info(".... define xml");
	}

}
