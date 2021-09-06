package com.curso.beans6;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XmlDefinedTaskServiceImpl implements XmlDefinedTaskService {

	private static Logger log = Logger.getAnonymousLogger();
	
	private UserService userService;
	private DAOService  daoService;
	
	@Autowired
	public XmlDefinedTaskServiceImpl(UserService userService, DAOService  daoService) {
		log.info(".....instanciando XmlDefinedTaskServiceImpl");
		this.daoService = daoService;
		this.userService = userService;
	}

	@Override
	public void defined() {
		log.info(".... define xml");
	}

	@PostConstruct
	public void init() {
		log.info(" .... init 2");
	}
	
	@PreDestroy
	public void cleanup() {
		log.info(" .... cleanup 2");
	}
	
}
