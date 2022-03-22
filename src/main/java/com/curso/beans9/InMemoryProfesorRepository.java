package com.curso.beans9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryProfesorRepository implements ProfesoresRepository {
	
	
	private static Map<Integer, Profesor>  tablaProfesores;
	private static int ultimoID;
	
	static {
		tablaProfesores = new HashMap<Integer,Profesor>();
		tablaProfesores.put(++ultimoID, new Profesor(1, "Luis Ramos", "Fisica", true));
		tablaProfesores.put(++ultimoID, new Profesor(2, "Laura Roca", "Programacion", true));
		tablaProfesores.put(++ultimoID, new Profesor(3, "Eneko Rosh", "Matemáticas", true));
	}
	

	@Override
	public Profesor create(Profesor profesor) {
		profesor.setId(++ultimoID);
		tablaProfesores.put(ultimoID, profesor);
		return null;
	}

	@Override
	public void update(Profesor profesor) {
		tablaProfesores.put(profesor.getId(), profesor);
	}

	@Override
	public void delete(int id) {
		tablaProfesores.remove(id);
	}

	@Override
	public Profesor getById(int id) {
		return tablaProfesores.get(id);
	}

	@Override
	public Collection<Profesor> getAll() {
		return tablaProfesores.values();
	}

}
