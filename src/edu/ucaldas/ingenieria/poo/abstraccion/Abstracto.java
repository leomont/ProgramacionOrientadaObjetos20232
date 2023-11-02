package edu.ucaldas.ingenieria.poo.abstraccion;

public class Abstracto {

    public static void main(String[] args) {
        // Figura figura = new Figura();
        
        Circulo circulo = new Circulo("Rojo", 10);
        Triangulo cuadrado = new Triangulo(15,20, "Verde");
        
        System.out.println(circulo.area());
    }
    
}
