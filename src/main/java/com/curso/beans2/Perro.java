package com.curso.beans2;

public class Perro extends Animal {
	
	private String raza;
	
	public Perro() {
		super();
		System.out.println("... construyento Perro");
	}

	public Perro(String raza) {
		super();
		this.raza = raza;
		System.out.println("... construyento Perro " + raza );
	}

	@Override
	public void comer() {
		System.out.println("como huesos y gatos");
	}

}
