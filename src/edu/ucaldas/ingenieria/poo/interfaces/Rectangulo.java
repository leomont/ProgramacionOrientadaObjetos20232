
package edu.ucaldas.ingenieria.poo.interfaces;



public class Rectangulo extends Figura implements Dibujable{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.altura* this.base;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectangulo");
    }
    
    

}
