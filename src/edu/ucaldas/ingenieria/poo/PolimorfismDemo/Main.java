package edu.ucaldas.ingenieria.poo.PolimorfismDemo;

public class Main {
    public static void main(String[] args) {
        
        // Sin Polimorfismo
        Gato gato = new Gato("Garfield", "Angora", 10);
        Perro perro = new Perro("Scoobie Do", " Doberman", 5);
        Mascota mascotaUno = new Gato("Felix", "Criollo", 1);
        Mascota mascotaDos = new Perro("Rex", "Criollo", 2);
        Ave canario = new Ave("piolin", "Canario", 1);
        canario.Cantar();
        
        Mascota[] mascotas = new Mascota[5];
        mascotas[0] = gato;
        mascotas[1] = perro;
        mascotas[2] = mascotaUno;
        mascotas[3] = mascotaDos;
        mascotas[4] = canario;       
        // mascotas[0].dormir();
        // mascotas[1].dormir();
        
        // nombreClaseYMascota(perro);
        
        for(Mascota m : mascotas){
            nombreClaseYMascota(m);
        }
        
        
        
        gato.dormir();
        perro.dormir();
        
        System.out.println(gato.getNombre());
        
        
        /*
        // Arbol Jerarquico
        Class clase = perro.getClass();
        while(clase.getSuperclass() != null){
            String hijo = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hijo + " es una clase hija  de la clase padre: " + padre);
            clase = clase.getSuperclass();
        }*/
        
    }
    
    public static void nombreClaseYMascota(Mascota algo){
        System.out.println(algo.getNombre() + ", Clase: " + algo.getClass().getName());
    }
    
    
    
}
