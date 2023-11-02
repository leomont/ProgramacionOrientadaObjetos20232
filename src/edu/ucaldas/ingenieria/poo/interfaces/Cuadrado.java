
package edu.ucaldas.ingenieria.poo.interfaces;



public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado*this.lado;
    }
    
    

}
