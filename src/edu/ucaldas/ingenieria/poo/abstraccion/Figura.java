package edu.ucaldas.ingenieria.poo.abstraccion;


public abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }
    
    public abstract double area();
    

}
