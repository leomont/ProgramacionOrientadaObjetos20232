package edu.ucaldas.ingenieria.poo.EjerciciosHerencia.EjercicioTres;

public class Gato extends Mascota{
   String apodo;

    public Gato() {
    }
   
    public Gato(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }
   
    @Override
    public void dormir(){
        super.comer();
        System.out.println("El gato duerme");
    }
    
    public void arrunar(){
        System.out.println("El gato esta aruñando");
    }
}
