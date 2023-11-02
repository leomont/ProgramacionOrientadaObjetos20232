package edu.ucaldas.ingenieria.poo.PolimorfismDemo;

public class Perro extends Mascota {

	public Perro(String nombre, String raza, int edad) {
		super(nombre, raza, edad);
		// TODO Auto-generated constructor stub
	}
	
	public void dormir() {
		super.dormir();
		System.out.println("El perro esta durmiendo");
	}

}
