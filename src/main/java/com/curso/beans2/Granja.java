package com.curso.beans2;

public class Granja {

	private Animal animal;
	
	public Granja(Animal animal) {
		this.animal = animal;
		System.out.println("... construye granja ");
	}
	
	public void trabajosGranja() {
		System.out.println("...dando de comer");
		animal.comer();
	}

}
