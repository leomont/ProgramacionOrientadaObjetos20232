package edu.ucaldas.ingenieria.poo.EjerciciosHerencia.EjercicioTres;

public class Mascota {
    public String nombre;
    public String raza;
    public int edad;
    
    public Mascota(){
    }

    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }   
    
    public void dormir(){
        System.out.println("La mascota duerme");
    }
    public void caminar(){
        System.out.println("La mascota camina");
    }
    
    public void comer(){
        System.out.println("La mascota come");
    }
    
    public void tomaAgua(){
        System.out.println("La mascota toma agua");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

}
