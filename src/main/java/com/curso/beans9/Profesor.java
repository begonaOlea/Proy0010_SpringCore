package com.curso.beans9;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Profesor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//atributos
	private int id;
	private String nombre;
	private String especialidad;
	private boolean activo;
	
	
	//constructores
	
	public Profesor() {
		super();
	}
	
	public Profesor(int id, String nombre, String especialidad, boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.activo = activo;
	}
	
	//métodos del ciclo de vida del Bean
	
		//getters y setters
		
		
		

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	

	

}//fin clase Profesor
