package com.curso.beans9;

import java.util.Collection;
import java.util.List;

public interface GestionProfesoresService {
	
	/**
	 * Retorna todos los profesores de una especialdiad dada
	 * si no hay profesores devuelve colección vacia
	 * 
	 * @param especialidad
	 * @return
	 */
	public Collection<Profesor> getProfesoresPorEspecialidad(String especialidad);
	
	/**
	 * Recibe una lista con los profesores a dar de alta
	 * @param listaProfes
	 */
	public void crearProfesores(List<Profesor> listaProfes);

}
