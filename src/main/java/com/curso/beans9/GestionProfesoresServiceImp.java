package com.curso.beans9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gestionProfesores")
public class GestionProfesoresServiceImp implements GestionProfesoresService {

	
	@Autowired
	private ProfesoresRepository repositorio;
	
	@Override
	public Collection<Profesor> getProfesoresPorEspecialidad(String especialidad) {
		
		Collection<Profesor> profes = repositorio.getAll();
		Collection<Profesor> profeEsp = new ArrayList();
		
		
		for(Profesor p: profes ) {
			if(p.getEspecialidad().equalsIgnoreCase(especialidad)) {
				profeEsp.add(p);
			}
		}
		return profeEsp;
	}

	@Override
	public void crearProfesores(List<Profesor> listaProfes) {
		for(Profesor p : listaProfes) {
			repositorio.create(p);
		}
		
	}

}
