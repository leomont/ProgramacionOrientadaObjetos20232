
package edu.ucaldas.ingenieria.poo.interfaces;



public abstract class Figura{
    private String color;

    public Figura(String color) {
        this.color = color;
    }
    
    public Figura() {
    }
    
    
    public abstract double calcularArea();

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    

}
