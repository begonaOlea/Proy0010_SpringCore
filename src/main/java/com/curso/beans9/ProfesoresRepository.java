package com.curso.beans9;

import java.util.Collection;

public interface ProfesoresRepository {
	
	
	public Profesor create(Profesor profesor) ;
	public void update(Profesor profesor);
	public void delete(int id);
	public Profesor getById(int id);
	public Collection<Profesor> getAll();
	

}
