package edu.ucaldas.ingenieria.poo.PolimorfismDemo;

public class Gato extends Mascota{

    public Gato(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }

    public void dormir(){
        super.dormir();
        System.out.println("El gato esta dormido");
    }
 
}
