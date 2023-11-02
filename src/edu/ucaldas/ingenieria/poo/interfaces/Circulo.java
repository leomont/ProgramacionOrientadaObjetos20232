
package edu.ucaldas.ingenieria.poo.interfaces;

public class Circulo extends Figura implements Dibujable{
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return 3.1416 * this.radio * this.radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }


    

}
