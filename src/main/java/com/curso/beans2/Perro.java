package com.curso.beans2;

public class Perro extends Animal {

	public Perro() {
		super();
		System.out.println("... construyento Perro");
	}

	@Override
	public void comer() {
		System.out.println("como huesos y gatos");
	}

}
