
package edu.ucaldas.ingenieria.poo.interfaces;



public class ProbarDibujable {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(10.0, "Rojo");
        Cuadrado cuadrado = new Cuadrado(10.0, "Amarillo");
        Rectangulo rectangulo = new Rectangulo(10.0, 20.0, "Verde");
        
        probarDibujar(circulo);
        
    }
    
    public static void probarDibujar(Dibujable d ){
        d.dibujar();
    }
    
}
