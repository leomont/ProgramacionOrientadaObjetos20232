package edu.ucaldas.ingenieria.poo.interfaces;


public class Interfaces {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(10.0, "Rojo");
        Cuadrado cuadrado = new Cuadrado(10.0, "Amarillo");
        Rectangulo rectangulo = new Rectangulo(10.0, 20.0, "Verde");
        
        Figura figura = new Circulo(15.0, "Azul");
        
        Figura cuadrado2 = new Cuadrado(12.0, "verde");
        
        imprimirFigura(cuadrado2);
    }
    
    public static void imprimirFigura(Figura cir){
        System.out.println("El color de la figura es: " + cir.getColor()+ " y tiene un area de: " + cir.calcularArea());
    }
    
}
