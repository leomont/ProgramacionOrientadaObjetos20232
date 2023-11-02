package edu.ucaldas.ingenieria.poo.PolimorfismDemo;

public class Ave extends Mascota {

	public Ave(String nombre, String raza, int edad) {
		super(nombre, raza, edad);
		// TODO Auto-generated constructor stub
	}
	
	public String Cantar() {
		return "El ave esta cantando...";
	}
	
	public void dormir() {
		super.dormir();
		System.out.println("el ave esta durmiendo");
	}

}
